package com.generation.rento.service;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.generation.rento.model.UsuarioLogin;
import com.generation.rento.model.Usuario;
import com.generation.rento.repository.UsuarioRepository;
import org.apache.commons.codec.binary.Base64;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<Usuario> listarUsuarios() {

		return usuarioRepository.findAll();

	}

	public Optional<Usuario> cadastrarUsuario(Usuario usuario) {

		if (usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent())
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuário já existe!", null);

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);

		return Optional.of(usuarioRepository.save(usuario));

	}

	public Optional<UsuarioLogin> logarUsuario(Optional<UsuarioLogin> usuarioLogin) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<Usuario> usuario = usuarioRepository.findByUsuario(usuarioLogin.get().getUsuario());

		if (usuario.isPresent()) {
			if (encoder.matches(usuarioLogin.get().getSenha(), usuario.get().getSenha())) {

				String auth = usuarioLogin.get().getUsuario() + ":" + usuarioLogin.get().getSenha();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);

				usuarioLogin.get().setToken(authHeader);
				usuarioLogin.get().setId(usuario.get().getId());
				usuarioLogin.get().setNome(usuario.get().getNome());
				usuarioLogin.get().setTipoCadastro(usuario.get().getTipoCadastro());
				usuarioLogin.get().setFoto(usuario.get().getFoto());

				return usuarioLogin;

			}
		}
		throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Usuário ou senha inválidos!", null);
	}

}

package com.generation.rento.repository;

import java.util.Optional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.generation.rento.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Optional<Usuario> findByUsuario(String usuario);
	
	public List <Usuario> findAllByNomeContainingIgnoreCase (String nome);
	
	public Usuario findByNome(String nome);
}
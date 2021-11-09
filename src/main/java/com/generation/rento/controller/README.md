<h1 align="center">💛 CONTROLLER - SPRING</h1>

## :memo: Descrição
Com objetivo facilitar o processo em aplicações Java. O grupo passa a trabalhar a camada controller a partir das tabelas estabelecidas. 

<br>

## :books: Funcionalidades
* <b>Funcionalidade</b>: responsável por manipular todas as requisições feitas do lado de fora da API, requisições feitas através de URL’s seguindo o protocolo HTTP.


<br>

## :wrench: Tecnologias utilizadas
* ECLIPSE IDE;
* MYSQL;
* SPRING BOOT.

<br>

## :rocket: Apresentando o Código ➡ CategoriaController
Para rodar o repositório é necessário clonar o mesmo para que acompanhe outros detalhamentos. 
<br>
~~~Java

	@RestController
  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @RequestMapping("/categoria")
  public class CategoriaController {
	
	  @Autowired
	  private CategoriaRepository repository;
	
	//EndPoints
	
	//busca todas categorias
		@GetMapping
		public ResponseEntity<List<Categoria>> getAll(){
			return ResponseEntity.ok(repository.findAll());
		}
		
		//busca categorias pelo id
		@GetMapping("/{id}")
		public ResponseEntity<Categoria> getById(@PathVariable long id){
			return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());
		}
		
		//busca categorias pela descricao
		@GetMapping("/descricao/{descricao}")
		public ResponseEntity<List<Categoria>> getByName(@PathVariable String descricao){
			return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
		}
		
		//Post 
		@PostMapping
		public ResponseEntity<Categoria> post (@RequestBody Categoria categoria){
			return ResponseEntity.status(HttpStatus.CREATED)
					.body(repository.save(categoria));
		}

		@PutMapping
		public ResponseEntity<Categoria> put (@RequestBody Categoria categoria){
			return ResponseEntity.ok(repository.save(categoria));				
		}
		
		@DeleteMapping("/{id}")
		public void delete(@PathVariable long id) {
			repository.deleteById(id);
		}
~~~

<br>

<hr size = "2"</hr>

<br>
<br>

## :rocket: Código ➡ ProdutoController
Para rodar o repositório é necessário clonar o mesmo para que acompanhe outros detalhamentos. Em direção a tasks propostas a model de Produto se apresentará assim:
<br>
~~~Java

	@RestController
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping("/produto")
	public class ProdutoController {
		
		@Autowired
		private ProdutoRepository repository;
		
		//EndPoints
		
		//busca todas produtos
			@GetMapping
			public ResponseEntity<List<Produto>> getAll(){
				return ResponseEntity.ok(repository.findAll());
			}
			
			//busca produtos pelo id
			@GetMapping("/{id}")
			public ResponseEntity<Produto> getById(@PathVariable long id){
				return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
						.orElse(ResponseEntity.notFound().build());
			}
			
			//busca categorias pelo nome de servico
			@GetMapping("/servico/{nomeServico}")
			public ResponseEntity<List<Produto>> getByName(@PathVariable String nomeServico){
				return ResponseEntity.ok(repository.findAllBynomeServicoContainingIgnoreCase(nomeServico));
			}
			
			//Post 
			@PostMapping
			public ResponseEntity<Produto> post (@RequestBody Produto produto){
				return ResponseEntity.status(HttpStatus.CREATED)
						.body(repository.save(produto));
			}

			@PutMapping
			public ResponseEntity<Produto> put (@RequestBody Produto produto){
				return ResponseEntity.ok(repository.save(produto));				
			}
			
			@DeleteMapping("/{id}")
			public void delete(@PathVariable long id) {
				repository.deleteById(id);
			}
~~~

<br>

<hr size = "2"</hr>

<br>

## 🔺 NOSSAS ANOTAÇÕES:

- **@RestController:** indicar que são serviços REST com o tipo de resposta JSON.

- **@CrossOrigin:** Compartilhamento de recursos com origens diferentes - é o que permite que um site acesse outro site mesmo tendo domínios de origens diferentes.

- **@RequestMapping:** É o que define a url para quando for requisitada chamar o método.

- **@Autowired:** É uma injeção de dependência. Basicamente, uma técnica de desenvolvimento utilizada para evitar o alto nível de junção de código.(Quando os componentes de uma aplicação dependem muito uns dos outros) dentro de uma aplicação.

<br> <h4 align="center"> MÉTODOS DE REQUISIÇÃO </h4>
- **@GetMapping:** Para retornar apenas dados. (Pegar)

- **@PostMapping:** Causar uma mudança no estado do recurso. (Criar)

- **@PutMapping:** Substitui todas as atuais representações do recurso de destino pela carga de dados da requisição. (atualizar)

- **@DeleteMapping:** Deleta/Remove o recurso específico.
<br>


## :soon: Implementação futura
* Criação de UsuarioController.

<br>

## :handshake: Colaboradores
<table>
  <tr>
    <td align="center">
      <a href="https://github.com/beatriz-rodrig">
        <img src="https://avatars.githubusercontent.com/u/89103950?v=4" width="100px;" alt="Foto de Beatriz Rodrigues no GitHub"/><br>
        <sub>
          <b>beatriz-rodrig</b>
        </sub>
      </a>
    </td>    
    <td align="center">
      <a href="https://github.com/oGraebin">
        <img src="https://avatars.githubusercontent.com/u/84040211?v=4" width="100px;" alt="Foto de Felipe Graebin no GitHub"/><br>
        <sub>
          <b>oGraebin</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/Gus0092">
        <img src="https://avatars.githubusercontent.com/u/88991885?v=4" width="100px;" alt="Foto de Gustavo Victor no GitHub"/><br>
        <sub>
          <b>Gus0092</b>
        </sub>
      </a>
    </td>
    <td align="center">
      <a href="http://github.com/r4skaren">
        <img src="https://avatars.githubusercontent.com/u/86742652?v=4" width="100px;" alt="Foto de Karen Rodrigues no GitHub"/><br>
        <sub>
          <b>r4skaren</b>
        </sub>
      </a>
    </td>
        <td align="center">
      <a href="https://github.com/byTiagoAssis">
        <img src="https://avatars.githubusercontent.com/u/86063887?v=4" width="100px;" alt="Foto de Tiago Assis no GitHub"/><br>
        <sub>
          <b>byTiagoAssis</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

<br>

## :dart: Status do projeto
EM ANDAMENTO 🔄

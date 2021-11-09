<h1 align="center">🧡 MODEL - SPRING</h1>

## :memo: Descrição
Com objetivo facilitar o processo em aplicações Java. O grupo parte da camada model construindo uma de suas tabelas principais a Categoria. Em sequência trabalha Produto e Usuario, conforme o pedido do cliente.

<br>

## :books: Funcionalidades
* <b>Funcionalidade</b>: classe responsável pela abstração de nossos objetos e tabelas em nossos banco de dados. Com os atributos do descrito no DER da atividade 2 do projeto integrador.

<br>

## :wrench: Tecnologias utilizadas
* ECLIPSE IDE;
* MYSQL;
* SPRING BOOT.

<br>

## :rocket: Apresentando o Código ➡ Categoria
Para rodar o repositório é necessário clonar o mesmo para que acompanhe outros detalhamentos. Em direção a tasks propostas parte desta camada importante se trata das annotation:
~~~Java

	@Entity
	@Table(name = "tb_categoria")
	public class Categoria {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;

		@NotBlank(message="O valor não pode Ser nulo")
		@Size(min = 20, max = 100, message = "O texto tem que conter de 50 a 500 caracteres")
		private String categoria;
	
		@NotBlank(message="O valor não pode Ser nulo")
		@Size(min = 10, max = 500, message = "O texto tem que conter de 10 a 500 caracteres")
		private String descricao;

		@NotBlank(message="O valor não pode Ser nulo")
		private double valor;
	
		@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("categoria")
		private List<Produto> produto;
  
~~~

<br>

## 🚥 ATRIBUTOS E O MOTIVO DAS ESCOLHAS

```

tb_categoria

categoria: referente ao item que representa um grupo de serviços que se relacionam.
descricao: descrição da categoria que será visualizada pelos usuários.
valor: referente ao serviço a ser prestado.

```

<hr size = "2"</hr>

<br>
<br>

## :rocket: Código ➡ Produto
Para rodar o repositório é necessário clonar o mesmo para que acompanhe outros detalhamentos. Em direção a tasks propostas a model de Produto se apresentará assim:
~~~Java

	@Entity
	@Table (name = "tb_produto")
	public class Produto {
		
		
		@Id
	   	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    	private long id;
		

		@NotBlank(message="O valor não pode Ser nulo")
		@Size(min = 10, max = 100, message = "O texto tem que conter de 10 a 100 caracteres")
		private String nomeServico;
		
		@NotBlank(message="O valor não pode Ser nulo")
		@Size(min = 50, max = 1000, message = "O texto tem que conter de 50 a 1000 caracteres")
		private String apresentacao;
		
		@ManyToOne
		@JsonIgnoreProperties("produto")
		private Categoria categoria;
~~~

<br>

## 🚥 ATRIBUTOS E O MOTIVO DAS ESCOLHAS

```

tb_produtos

idCategoria: tipo de serviço prestado.
idUser: refere-se ao usuário.
nomeServico: título referente ao serviço.
apresentacao: detalhes do serviço e seu prestador.

```
<br>

<hr size = "2"</hr>

## :rocket: Código ➡ Usuario
Para rodar o repositório é necessário clonar o mesmo para que acompanhe outros detalhamentos. Em direção a tasks propostas a model de Produto se apresentará assim:
~~~Java

	@Entity
	@Table (name = "tb_usuario")
	public class Usuario {
	
	
		@Id
    		@GeneratedValue(strategy = GenerationType.IDENTITY)
    		private long id;

		@NotBlank(message="O valor não pode Ser nulo")
		@Size(min = 10, max = 150, message = "O texto tem que conter de 10 a 150 caracteres")
		private String nome;
	
		@NotBlank(message="O valor não pode Ser nulo")
		@Size(min = 8, max = 50, message = "O texto tem que conter de 8 a 50 caracteres")
		private String email;
	
		@NotBlank(message="O valor não pode Ser nulo")
		@Size(min = 1, max = 1, message = "Voce deve selecionar uma das opções")
		private char tipoCadastro;
	
		@NotBlank(message="O valor não pode Ser nulo")
		@Size(min = 8, max = 20, message = "A senha tem que conter de 8 a 20 caracteres")
		private String senha;
~~~

<br>

## 🚥 ATRIBUTOS E O MOTIVO DAS ESCOLHAS

```

tb_user

nome: nome do usuário.
email: endereço eletrônico do usuário.
tipoCadastro: o tipo que define se é tomador ou prestador.
senha: escolhida pelo usuário para ter acesso a sua conta.

```
<br>

<hr size = "2"</hr>

<br>

## 🔺 NOSSAS ANOTAÇÕES:

* Tomador: é o conceito formal utilizado para expressar a relação de compra.
* Não se esqueça dos Getters and Setters: necessário para a segurança e determinar onde esta classe poderá ser manipulada.
<br>


## :soon: Implementação futura
* Relacionamento de Usuario e Produto.

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

<h1 align="center">💚 REPOSITORY - SPRING</h1>

## :memo: Descrição
Com objetivo facilitar o processo em aplicações Java. O grupo passa a trabalhar com interface repository a partir das tabelas estabelecidas. 

<br>

## :books: Funcionalidades
* <b>Funcionalidade</b>: responsável por estabelecer comunicação com banco de dados.


<br>

## :wrench: Tecnologias utilizadas
* ECLIPSE IDE;
* MYSQL;
* SPRING BOOT.

<br>

## :rocket: Apresentando o Código ➡ CategoriaRepository
Para rodar o repositório é necessário clonar o mesmo para que acompanhe outros detalhamentos. 
<br>
~~~Java

	public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
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

    public interface ProdutoRepository extends JpaRepository<Produto, Long>{
		public List<Produto> findAllBynomeServicoContainingIgnoreCase (String nomeServico);
	}
  
~~~

<br>

<hr size = "2"</hr>

<br>

## 🔺 NOSSAS ANOTAÇÕES:
 
* **Interface:** Uma face que faz a comunicação entre dois meios diferentes.
* **JpaRepository:** Um framework (_pacote de códigos prontos que podem ser utilizados no desenvolvimento de sites_) para facilitar a criaçao de repositório.
* **Long:** L maiúsculo, é o Wrapper (“envolver coisas” adicionando funcionalidades à mesma).
* **findAllBy:** Ao traduzirmos para português nos deparamos com "encontrar tudo por", de forma literal, se trata de método que busca um atributo, no nosso caso seria Descrição 
e Serviço.

<br>


## :soon: Implementação futura
* Criação de UsuarioRepository

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

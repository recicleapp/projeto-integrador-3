package br.com.recicle.educativo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.recicle.usuarios.UsuarioAdministrador;

/**
 * Classe de teste criada para garantir o funcionamento das principais operações
 * de postagem de conteúdo, realizadas pela classe {@link PostConteudo}.
 * 
 * @author Grupo Projeto Recicle
 */
public class PostConteudoTest {

	private UsuarioAdministrador administrador;
	
	private PostConteudo postagem;
	
	@Before
	public void setUp() {
		
		/* ========== Montagem do Cenário ========== */
		
		// criando um usuario administrador
		UsuarioAdministrador administrador = new UsuarioAdministrador("Raquel", "raquel@exemplo.com.br", "123456");
		
		this.administrador = administrador;
		
		// criando conteudo do post
		String tituloPost = "3 melhores dicas para você reciclar mais";
		String conteudoPost = "A reciclagem transforma coisas em outras, o que é quase mágico.";
		String categoriaPost = "Meio Ambiente";
				
		// cadastrando o post
		PostConteudo postagem = new PostConteudo(administrador, tituloPost, conteudoPost, categoriaPost);
		
		this.postagem = postagem;
	}
	
	/**
	 * Testa se a função retorna o titulo do post
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testGetTitulo() {
		
		/* ========== Execução ========== */
		String titulo = postagem.getTitulo();
		
		/* ========== Verificação ========== */
		assertEquals("3 melhores dicas para você reciclar mais", titulo);
		
	}
	
	/**
	 * Testa se a função altera o titulo do post
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testSetTitulo() {
		
		/* ========== Execução ========== */
		postagem.setTitulo("9 dicas incríveis para você reciclar mais");
		
		/* ========== Verificação ========== */
		assertEquals("9 dicas incríveis para você reciclar mais", postagem.getTitulo());
		
	}
	
	/**
	 * Testa se a função retorna a categoria do post
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testGetCategoria() {
		
		/* ========== Execução ========== */
		String categoria = postagem.getCategoria();
		
		/* ========== Verificação ========== */
		assertEquals("Meio Ambiente", categoria);
		
	}
	
	/**
	 * Testa se a função altera a categoria do post
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testSetCategoria() {
		
		/* ========== Execução ========== */
		postagem.setCategoria("Lixo Eletrônico");
		
		/* ========== Verificação ========== */
		assertEquals("Lixo Eletrônico", postagem.getCategoria());
		
	}
	
	/**
	 * Testa se a função retorna o conteudo do post
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testGetConteudo() {
		
		/* ========== Execução ========== */
		String conteudo = postagem.getConteudo();
		
		/* ========== Verificação ========== */
		assertEquals("A reciclagem transforma coisas em outras, o que é quase mágico.", conteudo);
		
	}
	
	/**
	 * Testa se a função altera o conteudo do post
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testSetConteudo() {
		
		/* ========== Execução ========== */
		postagem.setConteudo("Reciclar é fazer nossa parte para um mundo mais sustentavel.");
		
		/* ========== Verificação ========== */
		assertEquals("Reciclar é fazer nossa parte para um mundo mais sustentavel.", postagem.getConteudo());
		
	}
	
	/**
	 * Testa se a função retorna o autor do post
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testGetAutor() {
		
		/* ========== Execução ========== */
		UsuarioAdministrador autor = postagem.getAutor();
		
		/* ========== Verificação ========== */
		assertEquals(administrador, autor);
		
	}
	
	/**
	 * Testa se a função altera o autor do post
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testSetAutor() {
		
		/* ========== Execução ========== */
		
		// criando um novo usuario administrador
		UsuarioAdministrador novoAdministrador = new UsuarioAdministrador("Karla", "karla@exemplo.com.br", "123456");
		
		postagem.setAutor(novoAdministrador);
		
		/* ========== Verificação ========== */
		assertEquals(novoAdministrador, postagem.getAutor());
		
	}
	
}

package br.com.recicle.educativo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.recicle.usuarios.UsuarioAdministrador;

/**
 * Classe de teste criada para garantir o funcionamento das principais opera��es
 * de postagem de conte�do, realizadas pela classe {@link PostConteudo}.
 * 
 * @author Grupo Projeto Recicle
 */
public class PostConteudoTest {

	private UsuarioAdministrador administrador;
	
	private PostConteudo postagem;
	
	@Before
	public void setUp() {
		
		/* ========== Montagem do Cen�rio ========== */
		
		// criando um usuario administrador
		UsuarioAdministrador administrador = new UsuarioAdministrador("Raquel", "raquel@exemplo.com.br", "123456");
		
		this.administrador = administrador;
		
		// criando conteudo do post
		String tituloPost = "3 melhores dicas para voc� reciclar mais";
		String conteudoPost = "A reciclagem transforma coisas em outras, o que � quase m�gico.";
		String categoriaPost = "Meio Ambiente";
				
		// cadastrando o post
		PostConteudo postagem = new PostConteudo(administrador, tituloPost, conteudoPost, categoriaPost);
		
		this.postagem = postagem;
	}
	
	/**
	 * Testa se a fun��o retorna o titulo do post
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testGetTitulo() {
		
		/* ========== Execu��o ========== */
		String titulo = postagem.getTitulo();
		
		/* ========== Verifica��o ========== */
		assertEquals("3 melhores dicas para voc� reciclar mais", titulo);
		
	}
	
	/**
	 * Testa se a fun��o altera o titulo do post
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testSetTitulo() {
		
		/* ========== Execu��o ========== */
		postagem.setTitulo("9 dicas incr�veis para voc� reciclar mais");
		
		/* ========== Verifica��o ========== */
		assertEquals("9 dicas incr�veis para voc� reciclar mais", postagem.getTitulo());
		
	}
	
	/**
	 * Testa se a fun��o retorna a categoria do post
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testGetCategoria() {
		
		/* ========== Execu��o ========== */
		String categoria = postagem.getCategoria();
		
		/* ========== Verifica��o ========== */
		assertEquals("Meio Ambiente", categoria);
		
	}
	
	/**
	 * Testa se a fun��o altera a categoria do post
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testSetCategoria() {
		
		/* ========== Execu��o ========== */
		postagem.setCategoria("Lixo Eletr�nico");
		
		/* ========== Verifica��o ========== */
		assertEquals("Lixo Eletr�nico", postagem.getCategoria());
		
	}
	
	/**
	 * Testa se a fun��o retorna o conteudo do post
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testGetConteudo() {
		
		/* ========== Execu��o ========== */
		String conteudo = postagem.getConteudo();
		
		/* ========== Verifica��o ========== */
		assertEquals("A reciclagem transforma coisas em outras, o que � quase m�gico.", conteudo);
		
	}
	
	/**
	 * Testa se a fun��o altera o conteudo do post
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testSetConteudo() {
		
		/* ========== Execu��o ========== */
		postagem.setConteudo("Reciclar � fazer nossa parte para um mundo mais sustentavel.");
		
		/* ========== Verifica��o ========== */
		assertEquals("Reciclar � fazer nossa parte para um mundo mais sustentavel.", postagem.getConteudo());
		
	}
	
	/**
	 * Testa se a fun��o retorna o autor do post
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testGetAutor() {
		
		/* ========== Execu��o ========== */
		UsuarioAdministrador autor = postagem.getAutor();
		
		/* ========== Verifica��o ========== */
		assertEquals(administrador, autor);
		
	}
	
	/**
	 * Testa se a fun��o altera o autor do post
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testSetAutor() {
		
		/* ========== Execu��o ========== */
		
		// criando um novo usuario administrador
		UsuarioAdministrador novoAdministrador = new UsuarioAdministrador("Karla", "karla@exemplo.com.br", "123456");
		
		postagem.setAutor(novoAdministrador);
		
		/* ========== Verifica��o ========== */
		assertEquals(novoAdministrador, postagem.getAutor());
		
	}
	
}

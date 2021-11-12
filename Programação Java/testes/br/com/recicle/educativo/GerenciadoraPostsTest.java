package br.com.recicle.educativo;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import br.com.recicle.usuarios.UsuarioAdministrador;

/**
 * Classe de teste criada para garantir o funcionamento das principais operações
 * de gerenciamento de procedimentos, realizadas pela classe {@link GerenciadoraPosts}.
 * 
 * @author Grupo Projeto Recicle
 */
public class GerenciadoraPostsTest {

	PostConteudo post;
	
	GerenciadoraPosts postagens;
	
	@Before
	public void setUp() {
		
		/* ========== Montagem do Cenário ========== */
		
		// criando um usuario administrador
		UsuarioAdministrador administrador = new UsuarioAdministrador("Raquel", "raquel@exemplo.com.br", "123456");
		
		// criando conteudo do post
		String tituloPost = "3 melhores dicas para você reciclar mais";
		String conteudoPost = "A reciclagem transforma coisas em outras, o que é quase mágico.";
		String categoriaPost = "Meio Ambiente";
				
		// criando o post
		PostConteudo post = new PostConteudo(administrador, tituloPost, conteudoPost, categoriaPost);
		
		this.post = post;
		
		// criando objeto postagens
		GerenciadoraPosts postagens = GerenciadoraPosts.getInstancia();
		
		this.postagens = postagens;
	}
	
	/**
	 * Testa se a função cadastrou corretamente o post passado a ela
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testCadastraPost() {
		
		/* ========== Execução ========== */		
		postagens.cadastraPost(post);		
		Collection<PostConteudo> postCadastrado = postagens.getPost();		
		
		/* ========== Verificação ========== */	
		assertTrue(postCadastrado.contains(post));
		
	}
	
}

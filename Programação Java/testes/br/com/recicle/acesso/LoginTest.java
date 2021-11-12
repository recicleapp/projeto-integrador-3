package br.com.recicle.acesso;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.recicle.usuarios.UsuarioUtilizador;

/**
 * Classe de teste criada para garantir o funcionamento das principais operações
 * de entrada ou saida de usuarios na aplicação, realizadas pela classe {@link Login}.
 * 
 * @author Grupo Projeto Recicle
 */
public class LoginTest {
	
	private UsuarioUtilizador utilizador;
	
	private Sessao sessao;
	
	@Before
	public void setUp( ) {
		
		/* ========== Montagem do Cenário ========== */
		
		// criando um usuario utilizador
		UsuarioUtilizador utilizador = new UsuarioUtilizador("Antonio", "antonio@exemplo.com.br", "13579");
				
		this.utilizador = utilizador;
		
		
		// solicita a instancia de Sessao ativa
		this.sessao = Sessao.getInstancia();
	}

	/**
	 * Testa se o usuario logou com sucesso na aplicação
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testEntrar() {
		
		/* ========== Execução ========== */
		Login.entrar(utilizador, "antonio@exemplo.com.br", "13579");
		
		/* ========== Verificação ========== */
		assertTrue(sessao.isUsuarioLogado(utilizador));
		
	}
	
	
	/**
	 * Testa se foi negado o login do usuario devido a erro na senha
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testEntrarErroSenha() {
		
		/* ========== Execução ========== */
		Login.entrar(utilizador, "antonio@exemplo.com.br", "2468");
		
		/* ========== Verificação ========== */
		assertFalse(sessao.isUsuarioLogado(utilizador));
		
	}
	
	/**
	 * Testa se foi negado o login do usuario devido a erro no e-mail
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testEntrarErroEmail() {
		
		/* ========== Execução ========== */
		Login.entrar(utilizador, "antony@exemplo.com.br", "13579");
		
		/* ========== Verificação ========== */
		assertFalse(sessao.isUsuarioLogado(utilizador));
		
	}
	
	/**
	 * Testa se o usuario conseguiu realizar logout na aplicação
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testSair() {
		
		/* ========== Execução ========== */
		Login.entrar(utilizador, "antonio@exemplo.com.br", "13579");
		
		Login.sair(utilizador);
		
		
		/* ========== Verificação ========== */
		assertFalse(sessao.isUsuarioLogado(utilizador));
		
	}
}

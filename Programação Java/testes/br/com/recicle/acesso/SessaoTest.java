package br.com.recicle.acesso;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import br.com.recicle.usuarios.*;

/**
 * Classe de teste criada para garantir o funcionamento das principais opera��es
 * de controle de usuario, realizadas pela classe {@link Sessao}.
 * 
 * @author Grupo Projeto Recicle
 */
public class SessaoTest {
	
	private UsuarioAdministrador administrador;
	
	private UsuarioPontoDeColeta pontoDeColeta;
	
	private UsuarioUtilizador utilizador;
	
	private Sessao sessao;

	@Before
	public void setUp() {
		
		/* ========== Montagem do Cen�rio ========== */
	
		// criando um usuario administrador
		UsuarioAdministrador administrador = new UsuarioAdministrador("Raquel", "raquel@exemplo.com.br", "123456");
		
		this.administrador = administrador;
		
		// criando um usuario ponto de coleta
		UsuarioPontoDeColeta pontoDeColeta = new UsuarioPontoDeColeta("Reciclagem Santa Maria", "santamaria@exemplo.com.br", "senhaSuperDificil123");
		
		this.pontoDeColeta = pontoDeColeta;
		
		// criando um usuario utilizador
		UsuarioUtilizador utilizador = new UsuarioUtilizador("Antonio", "antonio@exemplo.com.br", "13579");
		
		this.utilizador = utilizador;
		
		
		// solicita a instancia de Sessao ativa
		this.sessao = Sessao.getInstancia();

	}
	
	/**
	 * Testa se a fun��o addUsuarioLogado adiciona um usuario ao controle de usuarios logados
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testAddUsuarioLogado() {
		
		/* ========== Execu��o ========== */	
		sessao.addUsuarioLogado(utilizador);
		
		/* ========== Verifica��o ========== */
		assertTrue(sessao.isUsuarioLogado(utilizador));

	}
	
	/**
	 * Testa se a fun��o isUsuarioLogado retorna true caso um usuario exista
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testIsUsuarioLogado() {
		
		/* ========== Execu��o ========== */
		sessao.addUsuarioLogado(administrador);
		
		boolean isUsuarioLogado = sessao.isUsuarioLogado(administrador);
		
		
		/* ========== Verifica��o ========== */
		assertTrue(isUsuarioLogado);

	}
	
	/**
	 * Testa se a fun��o isUsuarioLogado retorna false caso um usuario n�o exista
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testIsUsuarioNaoLogado() {
		
		/* ========== Execu��o ========== */
		
		// solicita uma nova instancia de Sessao
		sessao.addUsuarioLogado(pontoDeColeta);
		
		sessao.delUsuario(pontoDeColeta);
		
		boolean isUsuarioLogado = sessao.isUsuarioLogado(pontoDeColeta);
		
		
		/* ========== Verifica��o ========== */
		assertFalse(isUsuarioLogado);

	}
	
	/**
	 * Testa se a fun��o delUsuario remove um usuario especifico do controle de usuarios
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testDelUsuario() {
		
		/* ========== Execu��o ========== */
		sessao.addUsuarioLogado(utilizador);
		
		sessao.delUsuario(utilizador);
		
		
		/* ========== Verifica��o ========== */
		assertFalse(sessao.isUsuarioLogado(utilizador));

	}
	
	/**
	 * Testa se a fun��o retorna uma collection com mais de um usuario
	 * 
	 * @author Projeto Recicle
	 * 
	 */
	@Test
	public void testgetUsuariosLogados() {
		
		/* ========== Execu��o ========== */
		Collection<Usuario> usuariosLogados = sessao.getUsuariosLogados();
	
		
		/* ========== Verifica��o ========== */
		assertTrue(usuariosLogados instanceof Collection);
		assertTrue(usuariosLogados.size() > 0);
	}
}

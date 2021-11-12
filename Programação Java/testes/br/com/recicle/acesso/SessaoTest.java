package br.com.recicle.acesso;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import br.com.recicle.usuarios.*;

/**
 * Classe de teste criada para garantir o funcionamento das principais operações
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
		
		/* ========== Montagem do Cenário ========== */
	
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
	 * Testa se a função addUsuarioLogado adiciona um usuario ao controle de usuarios logados
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testAddUsuarioLogado() {
		
		/* ========== Execução ========== */	
		sessao.addUsuarioLogado(utilizador);
		
		/* ========== Verificação ========== */
		assertTrue(sessao.isUsuarioLogado(utilizador));

	}
	
	/**
	 * Testa se a função isUsuarioLogado retorna true caso um usuario exista
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testIsUsuarioLogado() {
		
		/* ========== Execução ========== */
		sessao.addUsuarioLogado(administrador);
		
		boolean isUsuarioLogado = sessao.isUsuarioLogado(administrador);
		
		
		/* ========== Verificação ========== */
		assertTrue(isUsuarioLogado);

	}
	
	/**
	 * Testa se a função isUsuarioLogado retorna false caso um usuario não exista
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testIsUsuarioNaoLogado() {
		
		/* ========== Execução ========== */
		
		// solicita uma nova instancia de Sessao
		sessao.addUsuarioLogado(pontoDeColeta);
		
		sessao.delUsuario(pontoDeColeta);
		
		boolean isUsuarioLogado = sessao.isUsuarioLogado(pontoDeColeta);
		
		
		/* ========== Verificação ========== */
		assertFalse(isUsuarioLogado);

	}
	
	/**
	 * Testa se a função delUsuario remove um usuario especifico do controle de usuarios
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testDelUsuario() {
		
		/* ========== Execução ========== */
		sessao.addUsuarioLogado(utilizador);
		
		sessao.delUsuario(utilizador);
		
		
		/* ========== Verificação ========== */
		assertFalse(sessao.isUsuarioLogado(utilizador));

	}
	
	/**
	 * Testa se a função retorna uma collection com mais de um usuario
	 * 
	 * @author Projeto Recicle
	 * 
	 */
	@Test
	public void testgetUsuariosLogados() {
		
		/* ========== Execução ========== */
		Collection<Usuario> usuariosLogados = sessao.getUsuariosLogados();
	
		
		/* ========== Verificação ========== */
		assertTrue(usuariosLogados instanceof Collection);
		assertTrue(usuariosLogados.size() > 0);
	}
}

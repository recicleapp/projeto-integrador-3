package br.com.recicle.usuarios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * Classe de teste criada para garantir o funcionamento das principais opera��es
 * dos usuarios do tipo utilizadores, realizadas pela classe {@link UsuarioUtilizador}.
 * 
 * @author Grupo Projeto Recicle
 */
public class UsuarioUtilizadorTest {
	
	private UsuarioPontoDeColeta pontoDeColeta;
	
	private UsuarioUtilizador utilizador;
	
	@Before
	public void setUp() {
		
		/* ========== Montagem do Cen�rio ========== */
		
		// criando um ponto de coleta
		UsuarioPontoDeColeta pontoDeColeta = new UsuarioPontoDeColeta("Reciclagem Santa Maria", "santamaria@exemplo.com.br", "senhaSuperDificil123");
				
		this.pontoDeColeta = pontoDeColeta;
		
		// criando um usuario utilizador
		UsuarioUtilizador utilizador = new UsuarioUtilizador("Antonio", "antonio@exemplo.com.br", "13579");
	
		this.utilizador = utilizador;

	}

	/**
	 * Testa se a fun��o retorna verdadeiro em caso de senha correta
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testVerificaSenhaVerdadeira() {

		/* ========== Execu��o ========== */		
		boolean consultaSenha = utilizador.verificaSenha("13579");
		
		/* ========== Verifica��o ========== */	
		assertTrue(consultaSenha);
		
	}

	
	/**
	 * Testa se a fun��o retorna falso em caso de senha incorreta
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testVerificaSenhaFalsa() {

		/* ========== Execu��o ========== */		
		boolean consultaSenha = utilizador.verificaSenha("2468");
		
		/* ========== Verifica��o ========== */	
		assertFalse(consultaSenha);
		
	}
	
	/**
	 * Testa se a fun��o getFavoritos retorna um arraylist com o ponto de coleta
	 * favoritado pelo usuario utilizador
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testSetFavoritos() {
		
		/* ========== Execu��o ========== */
		utilizador.setFavoritos(pontoDeColeta);
		
		ArrayList<PontoDeColetaFavoritado> favoritos = utilizador.getFavoritos();
		
		/* ========== Verifica��o ========== */
		assertTrue(favoritos instanceof ArrayList);
		
		assertEquals(pontoDeColeta.toString(), favoritos.get(0).toString());
		
	}
	
	
}

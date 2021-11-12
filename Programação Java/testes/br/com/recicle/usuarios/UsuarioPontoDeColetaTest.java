package br.com.recicle.usuarios;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Classe de teste criada para garantir o funcionamento das principais opera��es
 * dos usuarios parceiros, do tipo ponto de coleta, realizadas pela classe {@link UsuarioPontoDeColeta}.
 * 
 * @author Grupo Projeto Recicle
 */
public class UsuarioPontoDeColetaTest {
	
	private UsuarioPontoDeColeta pontoDeColeta;
	
	@Before
	public void setUp() {

		/* ========== Montagem do Cen�rio ========== */	
		
		// criando um usuario ponto de coleta
		UsuarioPontoDeColeta pontoDeColeta = new UsuarioPontoDeColeta("Reciclagem Santa Maria", "santamaria@exemplo.com.br", "senhaSuperDificil123");

		this.pontoDeColeta = pontoDeColeta;
	}
	
	/**
	 * Testa se a fun��o retorna verdadeiro em caso de senha correta
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testVerificaSenhaVerdadeira() {

		/* ========== Execu��o ========== */		
		boolean consultaSenha = pontoDeColeta.verificaSenha("senhaSuperDificil123");
		
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
		boolean consultaSenha = pontoDeColeta.verificaSenha("senhaFacil");
		
		/* ========== Verifica��o ========== */	
		assertFalse(consultaSenha);
		
	}
}

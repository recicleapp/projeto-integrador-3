package br.com.recicle.usuarios;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Classe de teste criada para garantir o funcionamento das principais operações
 * dos usuarios parceiros, do tipo ponto de coleta, realizadas pela classe {@link UsuarioPontoDeColeta}.
 * 
 * @author Grupo Projeto Recicle
 */
public class UsuarioPontoDeColetaTest {
	
	private UsuarioPontoDeColeta pontoDeColeta;
	
	@Before
	public void setUp() {

		/* ========== Montagem do Cenário ========== */	
		
		// criando um usuario ponto de coleta
		UsuarioPontoDeColeta pontoDeColeta = new UsuarioPontoDeColeta("Reciclagem Santa Maria", "santamaria@exemplo.com.br", "senhaSuperDificil123");

		this.pontoDeColeta = pontoDeColeta;
	}
	
	/**
	 * Testa se a função retorna verdadeiro em caso de senha correta
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testVerificaSenhaVerdadeira() {

		/* ========== Execução ========== */		
		boolean consultaSenha = pontoDeColeta.verificaSenha("senhaSuperDificil123");
		
		/* ========== Verificação ========== */	
		assertTrue(consultaSenha);
		
	}

	
	/**
	 * Testa se a função retorna falso em caso de senha incorreta
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testVerificaSenhaFalsa() {

		/* ========== Execução ========== */		
		boolean consultaSenha = pontoDeColeta.verificaSenha("senhaFacil");
		
		/* ========== Verificação ========== */	
		assertFalse(consultaSenha);
		
	}
}

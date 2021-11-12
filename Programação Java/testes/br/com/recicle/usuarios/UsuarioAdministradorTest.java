package br.com.recicle.usuarios;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


/**
 * Classe de teste criada para garantir o funcionamento das principais operações
 * dos usuarios do tipo administradores, realizadas pela classe {@link UsuarioAdministrador}.
 * 
 * @author Grupo Projeto Recicle
 */
public class UsuarioAdministradorTest {
	
	private UsuarioAdministrador administrador;
	
	@Before
	public void setUp() {
		
		/* ========== Montagem do Cenário ========== */	
		
		// criando um usuario administrador
		UsuarioAdministrador administrador = new UsuarioAdministrador("Raquel", "raquel@exemplo.com.br", "123456");
		
		this.administrador = administrador;
	}
	
	/**
	 * Testa se a função retorna verdadeiro em caso de senha correta
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testVerificaSenhaVerdadeira() {

		/* ========== Execução ========== */		
		boolean consultaSenha = administrador.verificaSenha("123456");
		
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
		boolean consultaSenha = administrador.verificaSenha("123");
		
		/* ========== Verificação ========== */	
		assertFalse(consultaSenha);
		
	}
}

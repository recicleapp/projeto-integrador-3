package br.com.recicle.operacoes;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import br.com.recicle.usuarios.UsuarioPontoDeColeta;

/**
 * Classe de teste criada para garantir o funcionamento das principais opera��es
 * de gerenciamento de pontos de coleta, realizadas pela classe {@link GerenciadoraPontosDeColeta}.
 * 
 * @author Grupo Projeto Recicle
 */
public class GerenciadoraPontosDeColetaTest {
	
	private UsuarioPontoDeColeta pontoColeta;
	
	private GerenciadoraPontosDeColeta pontosDeColeta;

	@Before
	public void setUp() {
		
		/* ========== Montagem do Cen�rio ========== */
		
		// criando um usuario ponto de coleta
		UsuarioPontoDeColeta pontoColeta = new UsuarioPontoDeColeta("Reciclagem Santa Maria", "santamaria@exemplo.com.br", "senhaSuperDificil123");

		this.pontoColeta = pontoColeta;
		
		// criando objeto de pontos de coleta
		GerenciadoraPontosDeColeta pontosDeColeta = GerenciadoraPontosDeColeta.getInstancia();
		
		this.pontosDeColeta = pontosDeColeta;
	}
	
	/**
	 * Testa se a fun��o cadastrou corretamente o ponto de coleta passado a ela
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testCadastraPontosDeColeta() {
		
		/* ========== Execu��o ========== */		
		pontosDeColeta.cadastraPontosDeColeta(pontoColeta);		
		Collection<UsuarioPontoDeColeta> pontoDeColetaCadastrado = pontosDeColeta.getPontosDeColeta();		
		
		/* ========== Verifica��o ========== */	
		assertTrue(pontoDeColetaCadastrado.contains(pontoColeta));
		
	}	
	
}

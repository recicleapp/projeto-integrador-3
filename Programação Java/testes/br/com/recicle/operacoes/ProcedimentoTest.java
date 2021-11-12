package br.com.recicle.operacoes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.recicle.usuarios.UsuarioPontoDeColeta;
import br.com.recicle.usuarios.UsuarioUtilizador;

/**
 * Classe de teste criada para garantir o funcionamento das principais opera��es
 * de gerenciamento de procedimentos na aplica��o, realizadas pela classe {@link Procedimento}.
 * 
 * @author Grupo Projeto Recicle
 */
public class ProcedimentoTest {
		
	Procedimento descarte;

	Procedimento doacao;

	@Before
	public void setUp() {
		
		/* ========== Montagem do Cen�rio ========== */
		
		// criando utilizador
		UsuarioUtilizador utilizador = new UsuarioUtilizador("Antonio", "antonio@exemplo.com.br", "13579");
		
		// criando ponto de coleta
		UsuarioPontoDeColeta pontoDeColeta = new UsuarioPontoDeColeta("Reciclagem Santa Maria", "santamaria@exemplo.com.br", "senhaSuperDificil123");
		
		// criando item para o procedimento
		Item bateria = new Item("0001", "Bateria de Litio");
		
		Item celular = new Item("0002", "Celular Samsung");
		
		// criando procedimento para descarte
		Procedimento descarte = new Procedimento(utilizador, pontoDeColeta, TipoProcedimento.DESCARTE, bateria);
		this.descarte = descarte;
		
		// criando procedimento para doa��o
		Procedimento doacao = new Procedimento(utilizador, pontoDeColeta, TipoProcedimento.DOACAO, celular);
		this.doacao = doacao;
	}
	
	/**
	 * Testa se a fun��o getItem retorna o item do procedimento 
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testGetItem() {
		
		/* ========== Execu��o ========== */
		Item itemDescartado = descarte.getItem();
		
		/* ========== Verifica��o ========== */
		assertEquals("Bateria de Litio", itemDescartado.getNomeItem());
		
	}
	
	
	/**
	 * Testa se a fun��o getPontodecoleta retorna o ponto de coleta 
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testGetPontodecoleta() {
		
		/* ========== Execu��o ========== */
		UsuarioPontoDeColeta pontoDeColeta = doacao.getPontodecoleta();
		
		/* ========== Verifica��o ========== */
		assertEquals("Reciclagem Santa Maria", pontoDeColeta.toString());
		
	}
	
}

package br.com.recicle.operacoes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Classe de teste criada para garantir o funcionamento das principais opera��es
 * com itens, realizadas pela classe {@link Item}.
 * 
 * @author Grupo Projeto Recicle
 */
public class ItemTest {
	
	private Item item;
	
	@Before
	public void setUp() {
		
		/* ========== Montagem do Cen�rio ========== */
		
		// criando um item
		Item item = new Item("0001", "Bateria de Litio");
		
		this.item = item;
	}
	
	/**
	 * Testa se o c�digo do item retornado � o mesmo do item criado
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void getCodigoItem() {
		
		/* ========== Execu��o ========== */
		String cod = item.getCodigoItem();
		
		/* ========== Verifica��o ========== */
		assertEquals("0001", cod);
	}
	
	
	/**
	 * Testa se a fun��o setCodigoItem alterou o c�digo do item indicado
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void setCodigoItem() {
		
		/* ========== Execu��o ========== */
		item.setCodigoItem("0003");
		
		/* ========== Verifica��o ========== */
		assertEquals("0003", item.getCodigoItem());
	}
	
	/**
	 * Testa se o nome do item retornado � o mesmo do item criado
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void getNomeItem() {
		
		/* ========== Execu��o ========== */
		String nome = item.getNomeItem();
		
		/* ========== Verifica��o ========== */
		assertEquals("Bateria de Litio", nome);
	}
	
	
	/**
	 * Testa se a fun��o setCodigoItem alterou o c�digo do item indicado
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void setNomeItem() {
		
		/* ========== Execu��o ========== */
		item.setNomeItem("Pilhas Descartaveis");
		
		/* ========== Verifica��o ========== */
		assertEquals("Pilhas Descartaveis", item.getNomeItem());
	}
}

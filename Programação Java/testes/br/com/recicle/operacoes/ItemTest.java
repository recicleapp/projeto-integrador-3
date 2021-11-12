package br.com.recicle.operacoes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Classe de teste criada para garantir o funcionamento das principais operações
 * com itens, realizadas pela classe {@link Item}.
 * 
 * @author Grupo Projeto Recicle
 */
public class ItemTest {
	
	private Item item;
	
	@Before
	public void setUp() {
		
		/* ========== Montagem do Cenário ========== */
		
		// criando um item
		Item item = new Item("0001", "Bateria de Litio");
		
		this.item = item;
	}
	
	/**
	 * Testa se o código do item retornado é o mesmo do item criado
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void getCodigoItem() {
		
		/* ========== Execução ========== */
		String cod = item.getCodigoItem();
		
		/* ========== Verificação ========== */
		assertEquals("0001", cod);
	}
	
	
	/**
	 * Testa se a função setCodigoItem alterou o código do item indicado
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void setCodigoItem() {
		
		/* ========== Execução ========== */
		item.setCodigoItem("0003");
		
		/* ========== Verificação ========== */
		assertEquals("0003", item.getCodigoItem());
	}
	
	/**
	 * Testa se o nome do item retornado é o mesmo do item criado
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void getNomeItem() {
		
		/* ========== Execução ========== */
		String nome = item.getNomeItem();
		
		/* ========== Verificação ========== */
		assertEquals("Bateria de Litio", nome);
	}
	
	
	/**
	 * Testa se a função setCodigoItem alterou o código do item indicado
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void setNomeItem() {
		
		/* ========== Execução ========== */
		item.setNomeItem("Pilhas Descartaveis");
		
		/* ========== Verificação ========== */
		assertEquals("Pilhas Descartaveis", item.getNomeItem());
	}
}

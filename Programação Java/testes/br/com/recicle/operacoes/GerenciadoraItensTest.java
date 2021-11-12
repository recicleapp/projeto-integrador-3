package br.com.recicle.operacoes;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

/**
 * Classe de teste criada para garantir o funcionamento das principais opera��es
 * de gerenciamento de itens na aplica��o, realizadas pela classe {@link GerenciadoraItens}.
 * 
 * @author Grupo Projeto Recicle
 */
public class GerenciadoraItensTest {
	
	private Item televisao;
	
	private GerenciadoraItens itens;

	@Before
	public void setUp() {
		
		/* ========== Montagem do Cen�rio ========== */
		
		// criando item
		Item televisao = new Item("cod-0001", "Televis�o");
		this.televisao = televisao;
		
		// criando objeto items
		GerenciadoraItens itens = GerenciadoraItens.getInstancia();
		
		this.itens = itens;
	}
	
	/**
	 * Testa se a fun��o cadastrou corretamente o item passado a ela
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testCadastraItem() {
		
		/* ========== Execu��o ========== */
		itens.cadastraItem(televisao);
		Collection<Item> itemCadastrado = itens.getItens();
		
		/* ========== Verifica��o ========== */	
		assertTrue(itemCadastrado.contains(televisao));
		
	}
	
}

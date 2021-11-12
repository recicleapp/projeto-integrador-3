package br.com.recicle.operacoes;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

/**
 * Classe de teste criada para garantir o funcionamento das principais operações
 * de gerenciamento de itens na aplicação, realizadas pela classe {@link GerenciadoraItens}.
 * 
 * @author Grupo Projeto Recicle
 */
public class GerenciadoraItensTest {
	
	private Item televisao;
	
	private GerenciadoraItens itens;

	@Before
	public void setUp() {
		
		/* ========== Montagem do Cenário ========== */
		
		// criando item
		Item televisao = new Item("cod-0001", "Televisão");
		this.televisao = televisao;
		
		// criando objeto items
		GerenciadoraItens itens = GerenciadoraItens.getInstancia();
		
		this.itens = itens;
	}
	
	/**
	 * Testa se a função cadastrou corretamente o item passado a ela
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testCadastraItem() {
		
		/* ========== Execução ========== */
		itens.cadastraItem(televisao);
		Collection<Item> itemCadastrado = itens.getItens();
		
		/* ========== Verificação ========== */	
		assertTrue(itemCadastrado.contains(televisao));
		
	}
	
}

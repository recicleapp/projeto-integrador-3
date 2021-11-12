package br.com.recicle.operacoes;

/**
 * Classe usada para auxiliar no gerenciamento de itens
 * 
 * @author Projeto Recicle
 *
 */
import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe usada para gerenciar itens no aplicativo
 * 
 * @author Projeto Recicle
 *
 */
public class GerenciadoraItens {

	private static GerenciadoraItens instancia;
	
	private Collection<Item> itens;
	
	private GerenciadoraItens() {
		this.itens = new ArrayList<Item>();
	}
	
	/**
	 * Método que cadastra itens no aplicativo
	 * @param nomeItem
	 */
	public void cadastraItem(Item nomeItem) {	
		this.itens.add(nomeItem);
	}
	
	/**
	 * Método que retorna os itens cadastrados no aplicativo
	 * @return itens
	 */
	public Collection<Item> getItens() {
		return this.itens;
	}
	
	public static synchronized GerenciadoraItens getInstancia() {
		if (instancia == null)
			instancia = new GerenciadoraItens();
		return instancia;
	}
}

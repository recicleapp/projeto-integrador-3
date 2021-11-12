package br.com.recicle.operacoes;

/**
 * Classe usada para definir a estrutura dos itens
 * 
 * @author Projeto Recicle
 *
 */
public class Item {
	private String codigoItem;
	
	private String nomeItem;
	
	public Item(String codigoItem, String nomeItem) {
		this.codigoItem = codigoItem;
		this.nomeItem = nomeItem;
	}

	/**
	 * Método que retorna o código do item
	 * @return codigo do item
	 */
	public String getCodigoItem() {
		return codigoItem;
	}

	/**
	 * Método que atualiza o código do item
	 * @param codigoItem código a ser utilizado na atualização do código do item
	 */
	public void setCodigoItem(String codigoItem) {
		this.codigoItem = codigoItem;
	}

	/**
	 * Método que retorna o nome do item
	 * @return nome do item
	 */
	public String getNomeItem() {
		return nomeItem;
	}

	/**
	 * Método que atualiza o nome do item
	 * @param nomeItem nome a ser utilizado na atualização do nome do item
	 */
	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}
		
	/**
	 * Método que retorna a representação textual de um item
	 * @return representação textual do item
	 */
	@Override
	public String toString() {
		return nomeItem;
	}

	
}

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
	 * M�todo que retorna o c�digo do item
	 * @return codigo do item
	 */
	public String getCodigoItem() {
		return codigoItem;
	}

	/**
	 * M�todo que atualiza o c�digo do item
	 * @param codigoItem c�digo a ser utilizado na atualiza��o do c�digo do item
	 */
	public void setCodigoItem(String codigoItem) {
		this.codigoItem = codigoItem;
	}

	/**
	 * M�todo que retorna o nome do item
	 * @return nome do item
	 */
	public String getNomeItem() {
		return nomeItem;
	}

	/**
	 * M�todo que atualiza o nome do item
	 * @param nomeItem nome a ser utilizado na atualiza��o do nome do item
	 */
	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}
		
	/**
	 * M�todo que retorna a representa��o textual de um item
	 * @return representa��o textual do item
	 */
	@Override
	public String toString() {
		return nomeItem;
	}

	
}

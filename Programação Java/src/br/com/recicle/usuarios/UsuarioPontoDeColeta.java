package br.com.recicle.usuarios;

import java.util.ArrayList;
import java.util.Collection;

import br.com.recicle.operacoes.Item;

/**
 * Classe usada para definir usuarios Ponto de Coleta
 * 
 * @author Projeto Recicle
 *
 */
public class UsuarioPontoDeColeta extends Usuario {
	
	String cnpj;
	
	String endereco;
	
	String descricao;
	
	String longitude;
	
	String latitude;
		
	Collection<Item> itens;

	public UsuarioPontoDeColeta(String nomeUsuario, String emailUsuario, String senhaUsuario) {
		super(nomeUsuario, emailUsuario, senhaUsuario);
		
		this.itens = new ArrayList<Item>();
	}
	
	/**
	 * M�todo que cadastra os itens trabalhados pelo usuario ponto de coleta
	 * @param item item trabalho pelo ponto de coleta
	 */
	public void cadastrarItem(Item item) {
		itens.add(item);
	}
	
	/**
	 * M�todo que retorna os itens trabalhos pelo usuario ponto de coleta
	 * @return itens trabalhados
	 */
	public Collection<Item> getItensTrabalhados() {
		return this.itens;
	}
	
	/**
	 * M�todo que verifica se o item passado como par�metro faz parte
	 * dos itens que o usuario ponto de coleta trabalha
	 * @param item
	 * @return
	 */
	public boolean contemItem(Item item) {

		if (itens.contains(item)) {
			return true;
		}
		
		return false;
	}
	
	
	/**
	 * M�todo que retorna o cnpj do usuario ponto de coleta
	 * @return cnpj do ponto de coleta
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * M�todo que atualiza o cnpj do usuario ponto de coleta
	 * @param cnpj cnpj a ser utilizado na atualiza��o do usuario ponto de coleta
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * M�todo que retorna o endere�o do usuario ponto de coleta
	 * @return endere�o do ponto de coleta
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * M�todo que atualiza o endere�o do usuario ponto de coleta
	 * @param endereco endere�o a ser utilizado na atualiza��o do usuario ponto de coleta
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * M�todo que retorna um texto de descri��o do usuario ponto de coleta
	 * @return descri��o sobre o ponto de coleta
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * M�todo que atualiza o texto descritivo do usuario ponto de coleta
	 * @param descricao texto a ser utilizado na atualiza��o da descri��o do usuario ponto de coleta
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * M�todo que retorna a coordenada geogr�fica referente a longitude do usuario ponto de coleta
	 * @return longitude do ponto de coleta no planeta
	 */
	public String getLongitude() {
		return longitude;
	}
	
	/**
	 * M�todo que atualiza a longitude geogr�fica do usuario ponto de coleta
	 * @param longitude coordenada geogr�fica a ser utilizado na atualiza��o do usuario ponto de coleta
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * M�todo que retorna a coordenada geogr�fica referente a latitude do usuario ponto de coleta
	 * @return latitude do ponto de coleta no planeta
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * M�todo que atualiza a latitude geogr�fica do usuario ponto de coleta
	 * @param latitude coordenada geogr�fica a ser utilizado na atualiza��o do usuario ponto de coleta
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * M�todo que retorna a representa��o textual de um ponto de coleta
	 * @return representa��o textual de um ponto de coleta
	 */
	@Override
	public String toString() {
		return super.getNome();
	}

}

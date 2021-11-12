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
	 * Método que cadastra os itens trabalhados pelo usuario ponto de coleta
	 * @param item item trabalho pelo ponto de coleta
	 */
	public void cadastrarItem(Item item) {
		itens.add(item);
	}
	
	/**
	 * Método que retorna os itens trabalhos pelo usuario ponto de coleta
	 * @return itens trabalhados
	 */
	public Collection<Item> getItensTrabalhados() {
		return this.itens;
	}
	
	/**
	 * Método que verifica se o item passado como parâmetro faz parte
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
	 * Método que retorna o cnpj do usuario ponto de coleta
	 * @return cnpj do ponto de coleta
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * Método que atualiza o cnpj do usuario ponto de coleta
	 * @param cnpj cnpj a ser utilizado na atualização do usuario ponto de coleta
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * Método que retorna o endereço do usuario ponto de coleta
	 * @return endereço do ponto de coleta
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * Método que atualiza o endereço do usuario ponto de coleta
	 * @param endereco endereço a ser utilizado na atualização do usuario ponto de coleta
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * Método que retorna um texto de descrição do usuario ponto de coleta
	 * @return descrição sobre o ponto de coleta
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Método que atualiza o texto descritivo do usuario ponto de coleta
	 * @param descricao texto a ser utilizado na atualização da descrição do usuario ponto de coleta
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Método que retorna a coordenada geográfica referente a longitude do usuario ponto de coleta
	 * @return longitude do ponto de coleta no planeta
	 */
	public String getLongitude() {
		return longitude;
	}
	
	/**
	 * Método que atualiza a longitude geográfica do usuario ponto de coleta
	 * @param longitude coordenada geográfica a ser utilizado na atualização do usuario ponto de coleta
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * Método que retorna a coordenada geográfica referente a latitude do usuario ponto de coleta
	 * @return latitude do ponto de coleta no planeta
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * Método que atualiza a latitude geográfica do usuario ponto de coleta
	 * @param latitude coordenada geográfica a ser utilizado na atualização do usuario ponto de coleta
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * Método que retorna a representação textual de um ponto de coleta
	 * @return representação textual de um ponto de coleta
	 */
	@Override
	public String toString() {
		return super.getNome();
	}

}

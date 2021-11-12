package br.com.recicle.usuarios;

/**
 * Classe usada para definir um ponto de coleta como um de
 * seus estabelecimentos favoritos
 * 
 * @author Projeto Recicle
 *
 */
public class PontoDeColetaFavoritado {
	
	private UsuarioPontoDeColeta favorito;
	
	public PontoDeColetaFavoritado(UsuarioPontoDeColeta pontoDeColeta) {
		this.favorito = pontoDeColeta;
	}
	
	/**
	 * M�todo que retorna o ponto de coleta favoritado
	 * @return ponto de coleta
	 */
	public UsuarioPontoDeColeta getFavorito() {
		return this.favorito;
	}
	
	/**
	 * M�todo que retorna a representa��o textual de um ponto de coleta favoritado
	 * @return representa��o textual de um ponto de coleta favoritado
	 */
	@Override
	public String toString() {
		return favorito.getNome();
	}

}

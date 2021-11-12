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
	 * Método que retorna o ponto de coleta favoritado
	 * @return ponto de coleta
	 */
	public UsuarioPontoDeColeta getFavorito() {
		return this.favorito;
	}
	
	/**
	 * Método que retorna a representação textual de um ponto de coleta favoritado
	 * @return representação textual de um ponto de coleta favoritado
	 */
	@Override
	public String toString() {
		return favorito.getNome();
	}

}

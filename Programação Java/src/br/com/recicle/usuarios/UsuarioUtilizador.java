package br.com.recicle.usuarios;

import java.util.ArrayList;

/**
 * Classe usada para definir utilizadores da aplica��o
 * 
 * @author Projeto Recicle
 *
 */
public class UsuarioUtilizador extends Usuario {
	
	String dataNascimento;
	
	ArrayList<PontoDeColetaFavoritado> favoritos = new ArrayList<PontoDeColetaFavoritado>();

	public UsuarioUtilizador(String nomeUsuario, String emailUsuario, String senhaUsuario) {
		super(nomeUsuario, emailUsuario, senhaUsuario);
	}
	
	/**
	 * M�todo que atualiza a lista de pontos de coleta favoritados pelo usuario utilizador
	 * @param pontoDeColeta pontos de coleta favoritado pelo usuario
	 */
	public void setFavoritos(UsuarioPontoDeColeta pontoDeColeta) {
		PontoDeColetaFavoritado favoritado = new PontoDeColetaFavoritado(pontoDeColeta);
		favoritos.add(favoritado);
	}
	
	/**
	 * M�todo que retorna a lista de pontos de coleta favoritados pelo usuario utilizador
	 * @return pontos de coleta
	 */
	public ArrayList<PontoDeColetaFavoritado> getFavoritos() {		
		return favoritos;
	}

	/**
	 * M�todo que retorna a data de nascimento do usuario utilizador
	 * @return data de nascimento
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * M�todo que atualiza a data de nascimento do usuario utilizador
	 * @return dataNascimento 
	 */
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	

}

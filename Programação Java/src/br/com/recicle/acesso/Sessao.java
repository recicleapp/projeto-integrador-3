package br.com.recicle.acesso;

import java.util.ArrayList;
import java.util.Collection;

import br.com.recicle.usuarios.Usuario;

/**
 * Classe usada para controle de quais usuarios est�o logados
 * 
 * @author Projeto Recicle
 *
 */
public class Sessao {
	
	private static Sessao instancia;
	
	private Collection<Usuario> usuariosLogados;
	
	private Sessao() {
		this.usuariosLogados = new ArrayList<Usuario>();
	}
	
	/**
	 * M�todo que adiciona um usuario ao controle de usuarios logados
	 * @param usuario usuario a ser adicionado ao controle de usuarios logados
	 */
	public void addUsuarioLogado(Usuario usuario) {	
		usuariosLogados.add(usuario);
	}
		
	/**
	 * M�todo que remove um usuario do controle de usuarios logados
	 * @param usuario usuario a ser removido do controle de usuarios logados
	 */
	public void delUsuario(Usuario usuario) {
		usuariosLogados.remove(usuario);
	}
	
	/**
	 * M�todo que retorna a lista de usu�rios logados na aplica��o
	 * @return usuarios logados
	 */
	public Collection<Usuario> getUsuariosLogados() {
		return this.usuariosLogados;
	}
	
	/**
	 * M�todo que verifica se um usuario especifico encontra-se logado
	 * @param usuario usuario a ser verificado no controle de usuarios logados
	 * @return true, se o usuario estiver logado
	 */
	public boolean isUsuarioLogado(Usuario usuario) {
		
		boolean logado = false;
			
		if (usuariosLogados.contains(usuario)) {
			logado = true;
		}
		
		return logado;
	}
	
	/**
	 * Verifica se ja existe uma instancia da classe Sessao.
	 * Retorna esse objeto caso exista, sen�o, cria uma nova instancia
	 * @return Objeto Sessao
	 */
	public static Sessao getInstancia() {
		if (instancia == null)
			instancia = new Sessao();
		return instancia;
	}
}

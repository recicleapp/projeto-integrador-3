package br.com.recicle.acesso;

import java.util.ArrayList;
import java.util.Collection;

import br.com.recicle.usuarios.Usuario;

/**
 * Classe usada para controle de quais usuarios estão logados
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
	 * Método que adiciona um usuario ao controle de usuarios logados
	 * @param usuario usuario a ser adicionado ao controle de usuarios logados
	 */
	public void addUsuarioLogado(Usuario usuario) {	
		usuariosLogados.add(usuario);
	}
		
	/**
	 * Método que remove um usuario do controle de usuarios logados
	 * @param usuario usuario a ser removido do controle de usuarios logados
	 */
	public void delUsuario(Usuario usuario) {
		usuariosLogados.remove(usuario);
	}
	
	/**
	 * Método que retorna a lista de usuários logados na aplicação
	 * @return usuarios logados
	 */
	public Collection<Usuario> getUsuariosLogados() {
		return this.usuariosLogados;
	}
	
	/**
	 * Método que verifica se um usuario especifico encontra-se logado
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
	 * Retorna esse objeto caso exista, senão, cria uma nova instancia
	 * @return Objeto Sessao
	 */
	public static Sessao getInstancia() {
		if (instancia == null)
			instancia = new Sessao();
		return instancia;
	}
}

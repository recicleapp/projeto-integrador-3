package br.com.recicle.acesso;

import br.com.recicle.usuarios.Usuario;

/**
 * Classe usada pelos usuarios para se logarem no sistema
 * 
 * @author Projeto Recicle
 *
 */
public class Login {
	
	/**
	 * Método que verifica se o usuario é cadastrado e realiza a adição
	 * do mesmo no controle de sessão
	 * 
	 * @param usuario usuario a ser adicionado ao controle de sessão
	 * @param email e-mail do usuario
	 * @param senha senha do usuario
	 * @return true, caso o usuario consiga se logar na aplicação
	 */
	public static boolean entrar(Usuario usuario, String email, String senha) {
		
		Sessao sessao = Sessao.getInstancia();
		
		boolean logado = false;
		
		if (usuario.verificaSenha(senha) && (usuario.getEmail().contains(email)) ) {
			sessao.addUsuarioLogado(usuario);
			logado = true;
		} 
		
		return logado;
			
	}
	
	/**
	 * Método que remove o usuario informado do controle de usuarios 
	 * logados na sessão
	 * 
	 * @param usuario usuario a ser removido do controle de sessão
	 * @return
	 */
	public static boolean sair(Usuario usuario) {
		
		Sessao sessao = Sessao.getInstancia();
		
		boolean logado = false;
		
		if(sessao.isUsuarioLogado(usuario)) {
			sessao.delUsuario(usuario);
			logado = true;
		}
				
		return logado;
	}
}

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
	 * M�todo que verifica se o usuario � cadastrado e realiza a adi��o
	 * do mesmo no controle de sess�o
	 * 
	 * @param usuario usuario a ser adicionado ao controle de sess�o
	 * @param email e-mail do usuario
	 * @param senha senha do usuario
	 * @return true, caso o usuario consiga se logar na aplica��o
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
	 * M�todo que remove o usuario informado do controle de usuarios 
	 * logados na sess�o
	 * 
	 * @param usuario usuario a ser removido do controle de sess�o
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

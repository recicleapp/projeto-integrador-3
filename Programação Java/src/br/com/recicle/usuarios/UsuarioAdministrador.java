package br.com.recicle.usuarios;

/**
 * Classe usada para definir usuarios administradores
 * 
 * @author Projeto Recicle
 *
 */
public class UsuarioAdministrador extends Usuario {
	
	String dataNascimento;

	public UsuarioAdministrador(String nomeUsuario, String emailUsuario, String senhaUsuario) {
		super(nomeUsuario, emailUsuario, senhaUsuario);
	}
	
	/**
	 * Método que retorna a data de nascimento do usuario administrador
	 * @return data de nascimento
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * Método que atualiza a data de nascimento do usuario administrador
	 * @return dataNascimento 
	 */
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}

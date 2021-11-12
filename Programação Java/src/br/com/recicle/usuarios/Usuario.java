package br.com.recicle.usuarios;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * Classe abstrata usada para definir usuarios
 * 
 * @author Projeto Recicle
 *
 */
public abstract class Usuario {
	
	private String nome;
	
	private String email;
	
	private String senha;
	
	private String telefone;
	
	public Usuario(String nomeUsuario, String emailUsuario, String senhaUsuario) {
		this.nome = nomeUsuario;
		this.email = emailUsuario;
		this.senha = getSHA512(senhaUsuario);
	}
	
	/**
	 * M�todo que retorna o nome do usuario
	 * @return nome do usuario
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * M�todo que atualiza o nome do usuario
	 * @param nomeUsuario nome a ser utilizado para atualizado no cadastro do usuario
	 */
	public void setNome(String nomeUsuario) {
		this.nome = nomeUsuario;
	}

	/**
	 * M�todo que retorna o e-mail do usuario
	 * @return e-mail do usuario
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * M�todo que atualiza o e-mail do usuario
	 * @param emailUsuario e-mail a ser utilizado para atualiza��o do cadastro do usuario
	 */
	public void setEmail(String emailUsuario) {
		this.email = emailUsuario;
	}
	
	/**
	 * M�todo que atualiza a senha do usuario
	 * @param senhaUsuario senha a ser utilizada para atualiza��o do cadastro do usuario
	 */
	public void setSenha(String senhaUsuario) {
		this.senha = getSHA512(senhaUsuario);
	}

	/**
	 * M�todo que retorna o telefone do usuario
	 * @return telefone do usuario
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * M�todo que atualiza o telefone do usuario
	 * @param telefoneUsuario numero de telefone a ser utilizada para atualiza��o do cadastro do usuario
	 */
	public void setTelefone(String telefoneUsuario) {
		this.telefone = telefoneUsuario;
	}
	
	/**
	 * Recebe uma senha e verifica se ela � igual a cadastrada pelo usuario
	 * 
	 * @param senha senha a ser testada
	 * @return true, se a senha corresponder a senha cadastrada
	 */
	public boolean verificaSenha(String senhaUsuario) {
		
		boolean sucesso = false;
		
		if(senha.equals(getSHA512(senhaUsuario))) {
			return true;
		}
				
		return sucesso;		
	}
	
	/**
	 * Recebe uma string e realiza opera��o de hash SHA-512 com base na mesma
	 * 
	 * @param senha string que ir� servir de entrada para a opera��o de hash
	 * @return hash SHA-512 criado a partir da string senha
	 */
	public static String getSHA512(String senha) {
		
		String hash = null;
		
		try {
			
		    MessageDigest digest = MessageDigest.getInstance("SHA-512");
		    digest.reset();
		    digest.update(senha.getBytes("utf8"));
		    hash = String.format("%0128x", new BigInteger(1, digest.digest()));
		
		} catch (Exception e) {
		
			e.printStackTrace();
		
		}
				
		return hash;
	}
	
	/**
	 * M�todo que retorna a representa��o textual de um usuario
	 * @return representa��o textual de um usuario
	 */
	@Override
	public String toString() {
		return nome;
	}

}

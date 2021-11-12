package br.com.recicle.operacoes;

import br.com.recicle.usuarios.Usuario;

/**
 * Classe usada para definir a estrutura das mensagens
 * 
 * @author Projeto Recicle
 *
 */
public class Mensagem {

	private Usuario remetente;
	
	private Usuario destinatario;
	
	private String conteudo;

	public Mensagem(Usuario remententeMensagem, Usuario destinatarioMensagem, String conteudoMensagem) {
		super();
		this.remetente = remententeMensagem;
		this.destinatario = destinatarioMensagem;
		this.conteudo = conteudoMensagem;
	}
	
	/**
	 * M�todo que retorna o conte�do da mensagem enviada
	 * @return conteudo
	 */
	public String getConteudo() {
		return this.conteudo;
	}
	
	/**
	 * M�todo que retorna a representa��o textual de uma mensagem
	 * @return representa��o textual de uma mensagem
	 */
	@Override
	public String toString() {		
		return conteudo;
	}

	/**
	 * M�todo que retorna o remetente da mensagem enviada
	 * @return remetent
	 */
	public Usuario getRemetente() {
		return remetente;
	}

	/**
	 * M�todo que retorna o destinat�rio da mensagem enviada
	 * @return destinatario
	 */
	public Usuario getDestinatario() {
		return destinatario;
	}
	
}

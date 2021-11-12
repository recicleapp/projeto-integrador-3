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
	 * Método que retorna o conteúdo da mensagem enviada
	 * @return conteudo
	 */
	public String getConteudo() {
		return this.conteudo;
	}
	
	/**
	 * Método que retorna a representação textual de uma mensagem
	 * @return representação textual de uma mensagem
	 */
	@Override
	public String toString() {		
		return conteudo;
	}

	/**
	 * Método que retorna o remetente da mensagem enviada
	 * @return remetent
	 */
	public Usuario getRemetente() {
		return remetente;
	}

	/**
	 * Método que retorna o destinatário da mensagem enviada
	 * @return destinatario
	 */
	public Usuario getDestinatario() {
		return destinatario;
	}
	
}

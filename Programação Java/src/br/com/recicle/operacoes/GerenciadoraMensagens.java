package br.com.recicle.operacoes;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe usada para auxiliar no gerenciamento de mensagens
 * 
 * @author Projeto Recicle
 *
 */
public class GerenciadoraMensagens {

	private static GerenciadoraMensagens instancia;
	
	private Collection<Mensagem> mensagens;
	
	private GerenciadoraMensagens() {
		this.mensagens = new ArrayList<Mensagem>();
	}

	/**
	 * Método que cadastra mensagens no aplicativo
	 * @param mensagem
	 */
	public void cadastraMensagens(Mensagem mensagem) {	
		this.mensagens.add(mensagem);
	}
	
	/**
	 * Método que retorna as mensagens cadastradas no aplicativo
	 * @return mensagens
	 */
	public Collection<Mensagem> getMensagens() {
		return this.mensagens;
	}

	public static synchronized GerenciadoraMensagens getInstancia() {
		if (instancia == null)
			instancia = new GerenciadoraMensagens();
		return instancia;
	}
}

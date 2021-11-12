package br.com.recicle.operacoes;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe usada para auxiliar no gerenciamento de procedimentos
 * 
 * @author Projeto Recicle
 *
 */
public class GerenciadoraProcedimentos {
	private static GerenciadoraProcedimentos instancia;

	private Collection<Procedimento> procedimentos;
	
	private GerenciadoraProcedimentos() {
		this.procedimentos = new ArrayList<Procedimento>();
	}

	/**
	 * Método que cadastra procedimentos no aplicativo
	 * @param procedimento
	 */
	public void cadastraProcedimento(Procedimento procedimento) {	
		this.procedimentos.add(procedimento);
	}	
	
	/**
	 * Método que retorna os procedimentos cadastrados no aplicativo
	 * @return procedimentos cadastrados
	 */
	public Collection<Procedimento> getProcedimentos() {
		return this.procedimentos;
	}
			
	public static synchronized GerenciadoraProcedimentos getInstancia() {
		if (instancia == null)
			instancia = new GerenciadoraProcedimentos();
		return instancia;
	}
}

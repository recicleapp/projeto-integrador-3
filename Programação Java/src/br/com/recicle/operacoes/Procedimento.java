package br.com.recicle.operacoes;

import br.com.recicle.usuarios.UsuarioPontoDeColeta;
import br.com.recicle.usuarios.UsuarioUtilizador;

/**
 * Classe usada para criar as operações de descarte ou doação
 * 
 * @author Projeto Recicle
 *
 */
public class Procedimento {

	private UsuarioUtilizador utilizador;
	
	private UsuarioPontoDeColeta pontodecoleta;
	
	private TipoProcedimento tipoProcedimento;
	
	private Item item;

	public Procedimento(UsuarioUtilizador utilizadorProcedimento, UsuarioPontoDeColeta pontodecoletaProcedimento,
			TipoProcedimento tipoProcedimento, Item itemProcedimento) {
		super();
		this.utilizador = utilizadorProcedimento;
		this.pontodecoleta = pontodecoletaProcedimento;
		this.tipoProcedimento = tipoProcedimento;
		this.item = itemProcedimento;
	}

	/**
	 * Método que retorna o usuario utilizador que criou o procedimento
	 * @return utilizador do procedimento
	 */
	public UsuarioUtilizador getUtilizador() {
		return utilizador;
	}

	/**
	 * Método que retorna o ponto de coleta escolhido para esse procedimento
	 * @return ponto de coleta selecionado para o procedimento
	 */
	public UsuarioPontoDeColeta getPontodecoleta() {
		return pontodecoleta;
	}

	/**
	 * Método que retorna o tipo de procedimento escolhido, podendo ser DESCARTE ou DOACAO
	 * @return tipo de procedimento dessa operacão
	 */
	public TipoProcedimento getTipoProcedimento() {
		return tipoProcedimento;
	}

	/**
	 * Método que retorna o tipo de item selecionado para esta operação
	 * @return tipo de item selecinado para essa operação
	 */
	public Item getItem() {
		return item;
	}
	
	/**
	 * Método que retorna a representação textual de um procedimento
	 * @return representação textual de um procedimento
	 */
	@Override
	public String toString() {		
		return "( " + "Usuario: " + utilizador.getNome() + ", Procedimento: " + tipoProcedimento.toString() + ", Item: " + item.getNomeItem() + ", Ponto de Coleta: " + pontodecoleta.getNome() + " )";
	}
}

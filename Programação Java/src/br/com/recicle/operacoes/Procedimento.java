package br.com.recicle.operacoes;

import br.com.recicle.usuarios.UsuarioPontoDeColeta;
import br.com.recicle.usuarios.UsuarioUtilizador;

/**
 * Classe usada para criar as opera��es de descarte ou doa��o
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
	 * M�todo que retorna o usuario utilizador que criou o procedimento
	 * @return utilizador do procedimento
	 */
	public UsuarioUtilizador getUtilizador() {
		return utilizador;
	}

	/**
	 * M�todo que retorna o ponto de coleta escolhido para esse procedimento
	 * @return ponto de coleta selecionado para o procedimento
	 */
	public UsuarioPontoDeColeta getPontodecoleta() {
		return pontodecoleta;
	}

	/**
	 * M�todo que retorna o tipo de procedimento escolhido, podendo ser DESCARTE ou DOACAO
	 * @return tipo de procedimento dessa operac�o
	 */
	public TipoProcedimento getTipoProcedimento() {
		return tipoProcedimento;
	}

	/**
	 * M�todo que retorna o tipo de item selecionado para esta opera��o
	 * @return tipo de item selecinado para essa opera��o
	 */
	public Item getItem() {
		return item;
	}
	
	/**
	 * M�todo que retorna a representa��o textual de um procedimento
	 * @return representa��o textual de um procedimento
	 */
	@Override
	public String toString() {		
		return "( " + "Usuario: " + utilizador.getNome() + ", Procedimento: " + tipoProcedimento.toString() + ", Item: " + item.getNomeItem() + ", Ponto de Coleta: " + pontodecoleta.getNome() + " )";
	}
}

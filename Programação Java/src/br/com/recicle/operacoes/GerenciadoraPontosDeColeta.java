package br.com.recicle.operacoes;

import java.util.ArrayList;
import java.util.Collection;

import br.com.recicle.usuarios.UsuarioPontoDeColeta;

/**
 * Classe usada para auxiliar no gerenciamento de pontos de coleta
 * 
 * @author Projeto Recicle
 *
 */
public class GerenciadoraPontosDeColeta {

	private static GerenciadoraPontosDeColeta instancia;

	private Collection<UsuarioPontoDeColeta> pontosColeta;
	
	private GerenciadoraPontosDeColeta() {
		this.pontosColeta = new ArrayList<UsuarioPontoDeColeta>();
	}

	/**
	 * Método que cadastra pontos de coleta no aplicativo
	 * @param pontoDeColeta
	 */
	public void cadastraPontosDeColeta(UsuarioPontoDeColeta pontoDeColeta) {
		this.pontosColeta.add(pontoDeColeta);
	}
	
	/**
	 * Método que retorna os pontos de coleta cadastrados no aplicativo
	 * @return pontos de coleta
	 */
	public Collection<UsuarioPontoDeColeta> getPontosDeColeta() {
		return this.pontosColeta;
	}
			
	/**
	 * Método que retorna os pontos de coleta cadastrados no aplicativo de acordo com o item trabalhado
	 * @param item item a ser usado como referencia na pesquisa
	 * @return lista de pontos de coleta por itens trabalhados
	 */
	public ArrayList<UsuarioPontoDeColeta> filtraPontosDeColetaPorItem(Item item) {
		ArrayList<UsuarioPontoDeColeta> lista = new ArrayList<UsuarioPontoDeColeta>();
		
		for (UsuarioPontoDeColeta ponto : pontosColeta) {
			if (ponto.contemItem(item)) {
				lista.add(ponto);
			}
		}
		
		return lista;
	}
	
	public static synchronized GerenciadoraPontosDeColeta getInstancia() {
		if (instancia == null)
			instancia = new GerenciadoraPontosDeColeta();
		return instancia;
	}
}

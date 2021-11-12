package br.com.recicle.operacoes;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import br.com.recicle.usuarios.UsuarioPontoDeColeta;
import br.com.recicle.usuarios.UsuarioUtilizador;

/**
 * Classe de teste criada para garantir o funcionamento das principais operações
 * de gerenciamento de procedimentos, realizadas pela classe {@link GerenciadoraProcedimentos}.
 * 
 * @author Grupo Projeto Recicle
 */
public class GerenciadoraProcedimentosTest {

	Procedimento descarte;
	
	GerenciadoraProcedimentos procedimentos;
	
	@Before
	public void setUp() {
		
		/* ========== Montagem do Cenário ========== */
		
		// criando utilizador
		UsuarioUtilizador utilizador = new UsuarioUtilizador("Antonio", "antonio@exemplo.com.br", "13579");
				
		// criando ponto de coleta
		UsuarioPontoDeColeta pontoDeColeta = new UsuarioPontoDeColeta("Reciclagem Santa Maria", "santamaria@exemplo.com.br", "senhaSuperDificil123");
				
		// criando item para o procedimento
		Item bateria = new Item("0001", "Bateria de Litio");
				
		// criando procedimento para descarte
		Procedimento descarte = new Procedimento(utilizador, pontoDeColeta, TipoProcedimento.DESCARTE, bateria);
		this.descarte = descarte;
		
		// criando gerenciadora de procedimentos
		GerenciadoraProcedimentos procedimentos = GerenciadoraProcedimentos.getInstancia();
		
		this.procedimentos = procedimentos;
	}
	
	/**
	 * Testa se a função cadastrou corretamente o procedimento passado a ela
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testCadastraProcedimento() {
		
		/* ========== Execução ========== */		
		procedimentos.cadastraProcedimento(descarte);		
		Collection<Procedimento> procedimentoCadastrado = procedimentos.getProcedimentos();		
		
		/* ========== Verificação ========== */	
		assertTrue(procedimentoCadastrado.contains(descarte));
		
	}
	
}

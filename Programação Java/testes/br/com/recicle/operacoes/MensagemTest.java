package br.com.recicle.operacoes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.recicle.usuarios.UsuarioPontoDeColeta;
import br.com.recicle.usuarios.UsuarioUtilizador;

/**
 * Classe de teste criada para garantir o funcionamento das principais opera��es
 * com mensagens, realizadas pela classe {@link Mensagem}.
 * 
 * @author Grupo Projeto Recicle
 */
public class MensagemTest {
	
	Mensagem mensagem;

	@Before
	public void setUp() {
		
		/* ========== Montagem do Cen�rio ========== */	
		
		// criando um usuario do tipo utilizador como remetente da mensagem
		UsuarioUtilizador remetente = new UsuarioUtilizador("Antonio", "antonio@exemplo.com.br", "13579");
		
		// criando um usuario do tipo ponto de coleta como destinat�rio da mensagem
		UsuarioPontoDeColeta destinatario = new UsuarioPontoDeColeta("Reciclagem Santa Maria", "santamaria@exemplo.com.br", "senhaSuperDificil123");
		
		// criando o conte�do da mensagem
		String conteudo = "Ol�, eu gostaria de agendar uma visita para coleta de um computador antigo.";
				
		// criando uma mensagem
		Mensagem mensagem = new Mensagem(remetente, destinatario, conteudo);
		
		this.mensagem = mensagem;
	}
	
	/**
	 * Testa se � possivel ler o conteudo da mensagem
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testGetConteudo() {
		
		/* ========== Execu��o ========== */
		String conteudoMensagem = mensagem.getConteudo();
		
		/* ========== Verifica��o ========== */
		assertEquals("Ol�, eu gostaria de agendar uma visita para coleta de um computador antigo.", conteudoMensagem);	
	}
}

















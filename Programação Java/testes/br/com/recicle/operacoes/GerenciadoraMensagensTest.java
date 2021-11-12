package br.com.recicle.operacoes;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import br.com.recicle.usuarios.UsuarioPontoDeColeta;
import br.com.recicle.usuarios.UsuarioUtilizador;

/**
 * Classe de teste criada para garantir o funcionamento das principais operações
 * de gerenciamento de mensagens na aplicação, realizadas pela classe {@link GerenciadoraMensagens}.
 * 
 * @author Grupo Projeto Recicle
 */
public class GerenciadoraMensagensTest {
	
	Mensagem msg;
	
	GerenciadoraMensagens mensagens;

	@Before
	public void setUp() {
		
		/* ========== Montagem do Cenário ========== */
		
		// criando usuario remetente
		UsuarioUtilizador remetente = new UsuarioUtilizador("Antonio", "antonio@exemplo.com.br", "13579");
		
		// criando usuario destinatario
		UsuarioPontoDeColeta destinatario = new UsuarioPontoDeColeta("Reciclagem Santa Maria", "santamaria@exemplo.com.br", "senhaSuperDificil123");
		
		// criando mensagem
		Mensagem msg = new Mensagem(remetente, destinatario, "Olá, qual o horario de funcionamento?");
		
		this.msg = msg;
		
		// criando objeto mensagens
		GerenciadoraMensagens mensagens = GerenciadoraMensagens.getInstancia();
		
		this.mensagens = mensagens;
	}
	
	/**
	 * Testa se a função cadastrou corretamente a mensagem passada a ela
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testCadastraMensagem() {
		
		/* ========== Execução ========== */		
		mensagens.cadastraMensagens(msg);		
		Collection<Mensagem> mensagemCadastrada = mensagens.getMensagens();		
		
		/* ========== Verificação ========== */	
		assertTrue(mensagemCadastrada.contains(msg));
		
	}
	
}

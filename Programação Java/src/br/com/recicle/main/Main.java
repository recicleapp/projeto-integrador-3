package br.com.recicle.main;

import java.util.ArrayList;

import br.com.recicle.acesso.Login;
import br.com.recicle.acesso.Sessao;
import br.com.recicle.educativo.GerenciadoraPosts;
import br.com.recicle.educativo.PostConteudo;
import br.com.recicle.operacoes.GerenciadoraItens;
import br.com.recicle.operacoes.GerenciadoraMensagens;
import br.com.recicle.operacoes.GerenciadoraPontosDeColeta;
import br.com.recicle.operacoes.GerenciadoraProcedimentos;
import br.com.recicle.operacoes.Item;
import br.com.recicle.operacoes.Mensagem;
import br.com.recicle.operacoes.Procedimento;
import br.com.recicle.operacoes.TipoProcedimento;
import br.com.recicle.usuarios.UsuarioAdministrador;
import br.com.recicle.usuarios.UsuarioPontoDeColeta;
import br.com.recicle.usuarios.UsuarioUtilizador;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * O m�todo abaixo roda uma pequena hist�ria criada para realizar um r�pido teste manual,
		 * entretanto, tamb�m foram criados testes unit�rios com auxilio da biblioteca JUnit
		 *
		 */
		new Main().pequenaHistoria();
	}
	
	public void pequenaHistoria() {
				
		/* Raquel � uma colaboradora no projeto Recicle */		
		UsuarioAdministrador raquel = new UsuarioAdministrador("Raquel", "raquel@recicle.com.br", "senhaSuperForte123");
		
		
		/* Para entrar na aplica��o ela usa seu e-mail e senha */
		Login.entrar(raquel, "raquel@recicle.com.br", "senhaSuperForte123");
		
		System.out.println("Usuarios logados na aplica��o: " + "\n" + Sessao.getInstancia().getUsuariosLogados() + "\n");
				
		
		/* Mas, ao meio-dia, ela se desloga para ir almo�ar */
		Login.sair(raquel);
		
		System.out.println("Usuarios logados na aplica��o: " + "\n" + Sessao.getInstancia().getUsuariosLogados() + "\n");
		
		
		
		/* Um dia, ap�s o almo�o, Raquel escreveu um post para a �rea de conteudo do aplicativo */
		
		// Para isso, ela teve de logar novamente
		Login.entrar(raquel, "raquel@recicle.com.br", "senhaSuperForte123");
		
		System.out.println("Usuarios logados na aplica��o: " + "\n" + Sessao.getInstancia().getUsuariosLogados() + "\n");
		
		// Ent�o, escreveu o post
		String tituloPost = "As 3 melhores dicas para voc� reciclar mais";
		String conteudoPost = "A reciclagem transforma coisas em outras, o que � quase m�gico.";
		String categoriaPost = "Meio Ambiente";
		
		PostConteudo postDaRaquel = new PostConteudo(raquel, tituloPost, conteudoPost, categoriaPost);
			
		// E, cadastrou o post no aplicativo
		GerenciadoraPosts posts = GerenciadoraPosts.getInstancia();
		posts.cadastraPost(postDaRaquel);
		System.out.println("Titulo dos posts cadastrados na aplica��o: " + "\n" + posts.getPost() + "\n");

		
		
		/* No dia seguinte, Raquel cadastrou 04 itens na aplica��o */
		GerenciadoraItens itens = GerenciadoraItens.getInstancia();

		// uma bateria
		Item bateria = new Item("cod-0001","Bateria");
		itens.cadastraItem(bateria);
			
		// uma televis�o
		Item televisao = new Item("cod-0002","Televis�o");
		itens.cadastraItem(televisao);
			
		// um celular
		Item celular = new Item("cod-0003","Celular");
		itens.cadastraItem(celular);
			
		// e pilhas
		Item pilha = new Item("cod-0004","Pilha");
		itens.cadastraItem(pilha);

		System.out.println("Lista de itens cadastrados na aplica��o: " + "\n" + itens.getItens() + "\n");

		
		/* No aplicativo Recicle, h� 04 pontos de coleta foram cadastrados (embora o numero de pontos de coleta esteja crescendo rapidamente) */
			
		// BH RECICLA
		UsuarioPontoDeColeta bhRecicla = new UsuarioPontoDeColeta("BH Recicla", "bhrecicla@exemplo.com.br", "123");
			
		// LIDER RESIDUOS
		UsuarioPontoDeColeta liderResiduos = new UsuarioPontoDeColeta("Lider Residuos", "liderresiduos@exemplo.com.br", "senhaSuperSegura");
			
		// RECICLAGEM SANTA MARIA
		UsuarioPontoDeColeta reciclagemSantaMaria = new UsuarioPontoDeColeta("Reciclagem Santa Maria", "santamaria@exemplo.com.br", "senha");
			
		// RECICLAGEM DOIS IM�OS
		UsuarioPontoDeColeta reciclagemDoisIrmaos = new UsuarioPontoDeColeta("Reciclagem Dois Irm�os", "doisirmaos@exemplo.com.br", "olaMundo");
			
		
		
		/* Ao realizar o cadastro, cada ponto indicou o tipo de material com que trabalha */
			
		// BH RECICLA informou que trabalha com pilhas e baterias
		bhRecicla.cadastrarItem(pilha);
		bhRecicla.cadastrarItem(bateria);
			
		// LIDER RESIDUOS informou que trabalha com celulares, televisores e baterias
		liderResiduos.cadastrarItem(celular);
		liderResiduos.cadastrarItem(televisao);
		liderResiduos.cadastrarItem(bateria);
			
		// RECICLAGEM SANTA MARIA informou que trabalha com pilhas e baterias
		reciclagemSantaMaria.cadastrarItem(pilha);
		reciclagemSantaMaria.cadastrarItem(celular);
			
		// e, RECICLAGEM DOIS IM�OS informou que trabalha com televisores e pilhas
		reciclagemDoisIrmaos.cadastrarItem(televisao);
		reciclagemDoisIrmaos.cadastrarItem(pilha);


		
		/* Essas informa��es sobre os pontos de coleta, obviamente, estavam sendo gerenciadas pelo aplicativo */
		GerenciadoraPontosDeColeta pontosDeColeta = GerenciadoraPontosDeColeta.getInstancia();
		
		pontosDeColeta.cadastraPontosDeColeta(bhRecicla);	
		pontosDeColeta.cadastraPontosDeColeta(liderResiduos);
		pontosDeColeta.cadastraPontosDeColeta(reciclagemSantaMaria);
		pontosDeColeta.cadastraPontosDeColeta(reciclagemDoisIrmaos);
		
		System.out.println("Lista de pontos de coleta cadastrados na aplica��o: " + "\n" + pontosDeColeta.getPontosDeColeta() + "\n");
		
		
		
		/* Com o tempo, o aplicativo come�ou a ganhar novos utilizadores, entre eles M�rcia */
		UsuarioUtilizador marcia = new UsuarioUtilizador("M�rcia", "marcia@eusoumarcia.com.br", "senha123456");
			
		/* Marcia, ap�s se cadastrar, se logou no aplicativo usando seu e-mail e senha */
		Login.entrar(marcia, "marcia@eusoumarcia.com.br", "senha123456");
		System.out.println("Usuarios logados na aplica��o: " + "\n" + Sessao.getInstancia().getUsuariosLogados() + "\n");

		
		/* Ela navegou um tempo pelo aplicativo e decidiu favoritar 02 pontos de coleta */
		
		// Favoritou BH Recicla
		marcia.setFavoritos(bhRecicla);
		
		// Favoritou Reciclagem Santa Maria
		marcia.setFavoritos(reciclagemSantaMaria);
		
		System.out.println("Pontos de coleta favoritados pela M�rcia: " + "\n" + marcia.getFavoritos() + "\n");
		
		
		
		/* Mas, marcia precisava descartar algumas pilhas, ent�o buscou por pontos de coleta desse mateiral no aplicativo */
		ArrayList<UsuarioPontoDeColeta> resultadoPesquisa = pontosDeColeta.filtraPontosDeColetaPorItem(pilha);		
		System.out.println("Resultado da pesquisa realizada pela M�rcia por pontos que recebem pilhas: " + "\n" + resultadoPesquisa + "\n");

		
		
		/* Ap�s a pesquisa, Marcia decidiu entrar em contato com o BH Recicla */
		String conteudoDaMensagem = "Ol�, me chamo M�rcia e gostaria de agendar coleta para pilhas.";
		
		// E a mensagem para o BH Recicla foi enviada
		Mensagem mensagem = new Mensagem(marcia, bhRecicla, conteudoDaMensagem);
		GerenciadoraMensagens caixaPostal = GerenciadoraMensagens.getInstancia();		
		caixaPostal.cadastraMensagens(mensagem);
		
		System.out.println("Mensagens cadastradas no sistema: " + "\n" + caixaPostal.getMensagens() + "\n");
		
		
		/* Ap�s conversas entre ela e o BH Recicla, Marcia ent�o realizou o procedimento de descarte pelo aplicativo */
		Procedimento descartarPilha = new Procedimento(marcia, bhRecicla, TipoProcedimento.DESCARTE, pilha);
		
		GerenciadoraProcedimentos procedimento = GerenciadoraProcedimentos.getInstancia();	
		procedimento.cadastraProcedimento(descartarPilha);
		
		System.out.println("Controle/Hist�rico de procedimentos no aplicativo: " + "\n" + procedimento.getProcedimentos() + "\n");
		

		
		/* E, resolveu tamb�m realizar o procedimento de doa��o de um celular no app tamb�m*/
		Procedimento doarCelular = new Procedimento(marcia, reciclagemSantaMaria, TipoProcedimento.DOACAO, celular);
		procedimento.cadastraProcedimento(doarCelular);

		System.out.println("Controle/Hist�rico de procedimentos no aplicativo: " + "\n" + procedimento.getProcedimentos() + "\n");
		

		/* Ap�s concluir as opera��es, Marcia foi ao cinema e se deslogou do aplicativo Recicle */
		Login.sair(marcia);
		
		System.out.println("Usuarios logados na aplica��o: " + "\n" + Sessao.getInstancia().getUsuariosLogados() + "\n");
		
	}
		
}

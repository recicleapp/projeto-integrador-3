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
		 * O método abaixo roda uma pequena história criada para realizar um rápido teste manual,
		 * entretanto, também foram criados testes unitários com auxilio da biblioteca JUnit
		 *
		 */
		new Main().pequenaHistoria();
	}
	
	public void pequenaHistoria() {
				
		/* Raquel é uma colaboradora no projeto Recicle */		
		UsuarioAdministrador raquel = new UsuarioAdministrador("Raquel", "raquel@recicle.com.br", "senhaSuperForte123");
		
		
		/* Para entrar na aplicação ela usa seu e-mail e senha */
		Login.entrar(raquel, "raquel@recicle.com.br", "senhaSuperForte123");
		
		System.out.println("Usuarios logados na aplicação: " + "\n" + Sessao.getInstancia().getUsuariosLogados() + "\n");
				
		
		/* Mas, ao meio-dia, ela se desloga para ir almoçar */
		Login.sair(raquel);
		
		System.out.println("Usuarios logados na aplicação: " + "\n" + Sessao.getInstancia().getUsuariosLogados() + "\n");
		
		
		
		/* Um dia, após o almoço, Raquel escreveu um post para a área de conteudo do aplicativo */
		
		// Para isso, ela teve de logar novamente
		Login.entrar(raquel, "raquel@recicle.com.br", "senhaSuperForte123");
		
		System.out.println("Usuarios logados na aplicação: " + "\n" + Sessao.getInstancia().getUsuariosLogados() + "\n");
		
		// Então, escreveu o post
		String tituloPost = "As 3 melhores dicas para você reciclar mais";
		String conteudoPost = "A reciclagem transforma coisas em outras, o que é quase mágico.";
		String categoriaPost = "Meio Ambiente";
		
		PostConteudo postDaRaquel = new PostConteudo(raquel, tituloPost, conteudoPost, categoriaPost);
			
		// E, cadastrou o post no aplicativo
		GerenciadoraPosts posts = GerenciadoraPosts.getInstancia();
		posts.cadastraPost(postDaRaquel);
		System.out.println("Titulo dos posts cadastrados na aplicação: " + "\n" + posts.getPost() + "\n");

		
		
		/* No dia seguinte, Raquel cadastrou 04 itens na aplicação */
		GerenciadoraItens itens = GerenciadoraItens.getInstancia();

		// uma bateria
		Item bateria = new Item("cod-0001","Bateria");
		itens.cadastraItem(bateria);
			
		// uma televisão
		Item televisao = new Item("cod-0002","Televisão");
		itens.cadastraItem(televisao);
			
		// um celular
		Item celular = new Item("cod-0003","Celular");
		itens.cadastraItem(celular);
			
		// e pilhas
		Item pilha = new Item("cod-0004","Pilha");
		itens.cadastraItem(pilha);

		System.out.println("Lista de itens cadastrados na aplicação: " + "\n" + itens.getItens() + "\n");

		
		/* No aplicativo Recicle, há 04 pontos de coleta foram cadastrados (embora o numero de pontos de coleta esteja crescendo rapidamente) */
			
		// BH RECICLA
		UsuarioPontoDeColeta bhRecicla = new UsuarioPontoDeColeta("BH Recicla", "bhrecicla@exemplo.com.br", "123");
			
		// LIDER RESIDUOS
		UsuarioPontoDeColeta liderResiduos = new UsuarioPontoDeColeta("Lider Residuos", "liderresiduos@exemplo.com.br", "senhaSuperSegura");
			
		// RECICLAGEM SANTA MARIA
		UsuarioPontoDeColeta reciclagemSantaMaria = new UsuarioPontoDeColeta("Reciclagem Santa Maria", "santamaria@exemplo.com.br", "senha");
			
		// RECICLAGEM DOIS IMÃOS
		UsuarioPontoDeColeta reciclagemDoisIrmaos = new UsuarioPontoDeColeta("Reciclagem Dois Irmãos", "doisirmaos@exemplo.com.br", "olaMundo");
			
		
		
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
			
		// e, RECICLAGEM DOIS IMÃOS informou que trabalha com televisores e pilhas
		reciclagemDoisIrmaos.cadastrarItem(televisao);
		reciclagemDoisIrmaos.cadastrarItem(pilha);


		
		/* Essas informações sobre os pontos de coleta, obviamente, estavam sendo gerenciadas pelo aplicativo */
		GerenciadoraPontosDeColeta pontosDeColeta = GerenciadoraPontosDeColeta.getInstancia();
		
		pontosDeColeta.cadastraPontosDeColeta(bhRecicla);	
		pontosDeColeta.cadastraPontosDeColeta(liderResiduos);
		pontosDeColeta.cadastraPontosDeColeta(reciclagemSantaMaria);
		pontosDeColeta.cadastraPontosDeColeta(reciclagemDoisIrmaos);
		
		System.out.println("Lista de pontos de coleta cadastrados na aplicação: " + "\n" + pontosDeColeta.getPontosDeColeta() + "\n");
		
		
		
		/* Com o tempo, o aplicativo começou a ganhar novos utilizadores, entre eles Márcia */
		UsuarioUtilizador marcia = new UsuarioUtilizador("Márcia", "marcia@eusoumarcia.com.br", "senha123456");
			
		/* Marcia, após se cadastrar, se logou no aplicativo usando seu e-mail e senha */
		Login.entrar(marcia, "marcia@eusoumarcia.com.br", "senha123456");
		System.out.println("Usuarios logados na aplicação: " + "\n" + Sessao.getInstancia().getUsuariosLogados() + "\n");

		
		/* Ela navegou um tempo pelo aplicativo e decidiu favoritar 02 pontos de coleta */
		
		// Favoritou BH Recicla
		marcia.setFavoritos(bhRecicla);
		
		// Favoritou Reciclagem Santa Maria
		marcia.setFavoritos(reciclagemSantaMaria);
		
		System.out.println("Pontos de coleta favoritados pela Márcia: " + "\n" + marcia.getFavoritos() + "\n");
		
		
		
		/* Mas, marcia precisava descartar algumas pilhas, então buscou por pontos de coleta desse mateiral no aplicativo */
		ArrayList<UsuarioPontoDeColeta> resultadoPesquisa = pontosDeColeta.filtraPontosDeColetaPorItem(pilha);		
		System.out.println("Resultado da pesquisa realizada pela Márcia por pontos que recebem pilhas: " + "\n" + resultadoPesquisa + "\n");

		
		
		/* Após a pesquisa, Marcia decidiu entrar em contato com o BH Recicla */
		String conteudoDaMensagem = "Olá, me chamo Márcia e gostaria de agendar coleta para pilhas.";
		
		// E a mensagem para o BH Recicla foi enviada
		Mensagem mensagem = new Mensagem(marcia, bhRecicla, conteudoDaMensagem);
		GerenciadoraMensagens caixaPostal = GerenciadoraMensagens.getInstancia();		
		caixaPostal.cadastraMensagens(mensagem);
		
		System.out.println("Mensagens cadastradas no sistema: " + "\n" + caixaPostal.getMensagens() + "\n");
		
		
		/* Após conversas entre ela e o BH Recicla, Marcia então realizou o procedimento de descarte pelo aplicativo */
		Procedimento descartarPilha = new Procedimento(marcia, bhRecicla, TipoProcedimento.DESCARTE, pilha);
		
		GerenciadoraProcedimentos procedimento = GerenciadoraProcedimentos.getInstancia();	
		procedimento.cadastraProcedimento(descartarPilha);
		
		System.out.println("Controle/Histórico de procedimentos no aplicativo: " + "\n" + procedimento.getProcedimentos() + "\n");
		

		
		/* E, resolveu também realizar o procedimento de doação de um celular no app também*/
		Procedimento doarCelular = new Procedimento(marcia, reciclagemSantaMaria, TipoProcedimento.DOACAO, celular);
		procedimento.cadastraProcedimento(doarCelular);

		System.out.println("Controle/Histórico de procedimentos no aplicativo: " + "\n" + procedimento.getProcedimentos() + "\n");
		

		/* Após concluir as operações, Marcia foi ao cinema e se deslogou do aplicativo Recicle */
		Login.sair(marcia);
		
		System.out.println("Usuarios logados na aplicação: " + "\n" + Sessao.getInstancia().getUsuariosLogados() + "\n");
		
	}
		
}

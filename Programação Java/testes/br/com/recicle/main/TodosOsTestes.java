package br.com.recicle.main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.com.recicle.usuarios.*;
import br.com.recicle.educativo.*;
import br.com.recicle.acesso.*;
import br.com.recicle.operacoes.*;

/**
 * Classe criada apra facilitar a executa de todos os testes desenvolvidos
 * para o app Recicle.
 * 
 * @author Grupo Projeto Recicle
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ LoginTest.class, SessaoTest.class, GerenciadoraPostsTest.class, PostConteudoTest.class,
	GerenciadoraItensTest.class, GerenciadoraMensagensTest.class,GerenciadoraPontosDeColetaTest.class,
	GerenciadoraProcedimentosTest.class, ItemTest.class, MensagemTest.class, ProcedimentoTest.class,
	PontoDeColetaFavoritadoTest.class, UsuarioAdministradorTest.class, UsuarioPontoDeColetaTest.class,
	UsuarioUtilizadorTest.class })
public final class TodosOsTestes {}

package br.com.recicle.usuarios;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Classe de teste criada para garantir o funcionamento das principais operações
 * com a ação de favoritar pontos de coleta, realizadas pela classe {@link PontoDeColetaFavoritado}.
 * 
 * @author Grupo Projeto Recicle
 */
public class PontoDeColetaFavoritadoTest {
	
	UsuarioPontoDeColeta pontoDeColeta;

	PontoDeColetaFavoritado favorito;

	@Before
	public void setUp() {
		
		/* ========== Montagem do Cenário ========== */
		
		// criando um ponto de coleta
		UsuarioPontoDeColeta pontoDeColeta = new UsuarioPontoDeColeta("Reciclagem Santa Maria", "santamaria@exemplo.com.br", "senhaSuperDificil123");
		
		this.pontoDeColeta = pontoDeColeta;
		
		// criando um favorito
		PontoDeColetaFavoritado favorito = new PontoDeColetaFavoritado(pontoDeColeta);
		
		this.favorito = favorito;
	}
	
	/**
	 * Testa se é retornado o mesmo usuario favoritado na montagem do cenário
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testGetFavorito() {
		
		/* ========== Execução ========== */
		UsuarioPontoDeColeta pontoDeColetaFavoritado = favorito.getFavorito();
				
		/* ========== Verificação ========== */
		assertEquals(pontoDeColeta, pontoDeColetaFavoritado);
	}
}

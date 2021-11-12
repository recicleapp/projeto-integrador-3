package br.com.recicle.usuarios;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Classe de teste criada para garantir o funcionamento das principais opera��es
 * com a a��o de favoritar pontos de coleta, realizadas pela classe {@link PontoDeColetaFavoritado}.
 * 
 * @author Grupo Projeto Recicle
 */
public class PontoDeColetaFavoritadoTest {
	
	UsuarioPontoDeColeta pontoDeColeta;

	PontoDeColetaFavoritado favorito;

	@Before
	public void setUp() {
		
		/* ========== Montagem do Cen�rio ========== */
		
		// criando um ponto de coleta
		UsuarioPontoDeColeta pontoDeColeta = new UsuarioPontoDeColeta("Reciclagem Santa Maria", "santamaria@exemplo.com.br", "senhaSuperDificil123");
		
		this.pontoDeColeta = pontoDeColeta;
		
		// criando um favorito
		PontoDeColetaFavoritado favorito = new PontoDeColetaFavoritado(pontoDeColeta);
		
		this.favorito = favorito;
	}
	
	/**
	 * Testa se � retornado o mesmo usuario favoritado na montagem do cen�rio
	 * 
	 * @author Projeto Recicle
	 */
	@Test
	public void testGetFavorito() {
		
		/* ========== Execu��o ========== */
		UsuarioPontoDeColeta pontoDeColetaFavoritado = favorito.getFavorito();
				
		/* ========== Verifica��o ========== */
		assertEquals(pontoDeColeta, pontoDeColetaFavoritado);
	}
}

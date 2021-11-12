package br.com.recicle.educativo;

import br.com.recicle.usuarios.UsuarioAdministrador;

/**
 * Classe usada para definir os posts
 * 
 * @author Projeto Recicle
 *
 */
public class PostConteudo {
	
	UsuarioAdministrador autor;
	
	String titulo;
	
	String conteudo;
	
	String categoria;
	
	public PostConteudo(UsuarioAdministrador autorPost, String tituloPost, String conteudoPost, String categoriaPost) {
		this.autor = autorPost;
		this.titulo = tituloPost;
		this.conteudo = conteudoPost;
		this.categoria = categoriaPost;
	}
	
	/**
	 * Método que retorna o titulo do post
	 * @return titulo do post
	 */
	public String getTitulo() {
		return this.titulo;
	}
	
	/**
	 * Método que atualiza o titulo do post
	 * @param tituloPost titulo a ser utilizado para atualização do titulo do post
	 */
	public void setTitulo(String tituloPost) {
		this.titulo = tituloPost;
	}
	
	/**
	 * Método que retorna a categoria do post
	 * @return categoria do post
	 */
	public String getCategoria() {
		return this.categoria;
	}
	
	/**
	 * Método que atualiza a categoria do post
	 * @param categoriaPost categoria a ser utilizada para atualização da categoria do post
	 */
	public void setCategoria(String categoriaPost) {
		this.categoria = categoriaPost;
	}
	
	/**
	 * Método que retorna o conteudo do post
	 * @return conteudo do post
	 */
	public String getConteudo() {
		return this.conteudo;
	}
	
	/**
	 * Método que atualiza o conteudo do post
	 * @param conteudoPost conteúdo a ser utilizado para a atualização do conteúdo do post
	 */
	public void setConteudo(String conteudoPost) {
		this.conteudo = conteudoPost;
	}
	
	/**
	 * Método que retorna o autor do post
	 * @return autor do post
	 */
	public UsuarioAdministrador getAutor() {
		return this.autor;
	}
	
	/**
	 * Método que atualiza o autor do post
	 * @param autorPost usuario administrador a ser utilizado para atualização do autor do post
	 */
	public void setAutor(UsuarioAdministrador autorPost) {
		this.autor = autorPost;
	}
	
	
	/**
	 * Método que retorna a representação textual de um post
	 * @return representação textual de um post
	 */
	@Override
	public String toString() {
		return titulo;
	}
}

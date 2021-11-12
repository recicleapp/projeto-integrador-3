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
	 * M�todo que retorna o titulo do post
	 * @return titulo do post
	 */
	public String getTitulo() {
		return this.titulo;
	}
	
	/**
	 * M�todo que atualiza o titulo do post
	 * @param tituloPost titulo a ser utilizado para atualiza��o do titulo do post
	 */
	public void setTitulo(String tituloPost) {
		this.titulo = tituloPost;
	}
	
	/**
	 * M�todo que retorna a categoria do post
	 * @return categoria do post
	 */
	public String getCategoria() {
		return this.categoria;
	}
	
	/**
	 * M�todo que atualiza a categoria do post
	 * @param categoriaPost categoria a ser utilizada para atualiza��o da categoria do post
	 */
	public void setCategoria(String categoriaPost) {
		this.categoria = categoriaPost;
	}
	
	/**
	 * M�todo que retorna o conteudo do post
	 * @return conteudo do post
	 */
	public String getConteudo() {
		return this.conteudo;
	}
	
	/**
	 * M�todo que atualiza o conteudo do post
	 * @param conteudoPost conte�do a ser utilizado para a atualiza��o do conte�do do post
	 */
	public void setConteudo(String conteudoPost) {
		this.conteudo = conteudoPost;
	}
	
	/**
	 * M�todo que retorna o autor do post
	 * @return autor do post
	 */
	public UsuarioAdministrador getAutor() {
		return this.autor;
	}
	
	/**
	 * M�todo que atualiza o autor do post
	 * @param autorPost usuario administrador a ser utilizado para atualiza��o do autor do post
	 */
	public void setAutor(UsuarioAdministrador autorPost) {
		this.autor = autorPost;
	}
	
	
	/**
	 * M�todo que retorna a representa��o textual de um post
	 * @return representa��o textual de um post
	 */
	@Override
	public String toString() {
		return titulo;
	}
}

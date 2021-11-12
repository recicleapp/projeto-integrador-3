package br.com.recicle.educativo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe usada para auxiliar no gerenciamento de posts
 * 
 * @author Projeto Recicle
 *
 */
public class GerenciadoraPosts {
	private static GerenciadoraPosts instancia;
	
	private Collection<PostConteudo> posts;
	
	private GerenciadoraPosts() {
		this.posts = new ArrayList<PostConteudo>();
	}
		
	/**
	 * Método que cadastra posts no aplicativo
	 * @param post
	 */
	public void cadastraPost(PostConteudo post) {	
		this.posts.add(post);
	}
		
	/**
	 * Método que retorna os posts cadastrados no aplicativo
	 * @return posts cadastrados
	 */
	public Collection<PostConteudo> getPost() {
		return this.posts;
	}
			
	public static synchronized GerenciadoraPosts getInstancia() {
		if (instancia == null)
			instancia = new GerenciadoraPosts();
		return instancia;
	}
}

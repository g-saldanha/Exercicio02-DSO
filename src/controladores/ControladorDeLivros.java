package controladores;

import java.util.ArrayList;

import entidades.Livro;

public class ControladorDeLivros {

	private ArrayList<Livro> livros;


	public boolean cadastraLivro(Livro livro) {
		return false;
	}

	public boolean removeLivro(Livro livro) {
		return false;
	}

	public ArrayList<Livro> listarLivros() {
		Livro livro1 = new Livro(null, "resumo", "teste1", null, "genero", "12");
		this.livros.add(livro1);
		for (Livro livro : this.livros) {
			System.out.println(livro.getTitulo());
		}
		return this.livros;

	}
}

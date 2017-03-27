package controladores;

import java.util.ArrayList;

import entidades.Livro;

public class ControladorDeLivros {
	private ArrayList<Livro> livros;
	private Livro livro = new Livro(null, null, null, null, null, null);

	public ControladorDeLivros(Livro livro) {
		this.livro = livro;
	}




	public boolean cadastraLivro(Livro livro) {
		if (livro != null) {
			this.livros.add(livro);
			return true;
		} else {
			return false;
		}

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

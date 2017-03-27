package telas;

import java.util.Scanner;

import controladores.ControladorDeLivros;
import entidades.Livro;
import entidades.Pessoa;

public class TelaLivros {
	private Scanner teclado;
	private ControladorDeLivros owner;

	public TelaLivros(ControladorDeLivros owner) {
		this.teclado = new Scanner(System.in);
		this.owner = owner;
	}



	public void exibeTelaLivros() {
		System.out.println("----------SisLivros----------");
		System.out.println("1 - Inclui Livro");
		System.out.println("2 - Remove Livro");
		System.out.println("3 - Lista Livros");
		System.out.println("9 - Retorna ao menu Principal");
		System.out.println("Digite...");
		int opcao = this.teclado.nextInt();
		switch (opcao) {
		case 1:
			this.incluiLivro();
		case 3:
			this.pedeLivros();
			break;

		default:
			break;
		}

	}

	public void pedeLivros() {
		this.owner.listarLivros();


	}

	public void incluiLivro() {
		String titulo = this.pedeTituloLivro();
		System.out.println("Digite o resumo do livro");
		String resumo = this.teclado.next();
		System.out.println("Digite o genero do livro");
		String genero = this.teclado.next();
		System.out.println("Digite a faixa etária");
		String faixaEtaria = this.teclado.next();
		System.out.println("Digite o Autor");
		Pessoa autor = this.pedePessoa();
		System.out.println("Digite o personagem principal");
		Pessoa personagemPrincipal = this.pedePessoa();
		Livro livroIncluido = new Livro(autor, resumo, titulo, personagemPrincipal, genero, faixaEtaria);
		this.owner.cadastraLivro(livroIncluido);
	}

	public void tiraLivro() {

	}

	public String pedeTituloLivro() {
		System.out.println("Digite o Título do Livro");
		String tituloDoLivro = this.teclado.next();
		return tituloDoLivro;
	}

	public Pessoa pedePessoa() {
		String nome = this.teclado.next();
		Pessoa pessoa = new Pessoa(nome);
		return pessoa;
	}

}

package telas;

import java.util.Scanner;

public class TelaPrincipal  {





	public static void exibeTelaPrincipal() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Bem vindo ao Sistema de Livros, voc� deseja?");
		System.out.println("1 - Cadastrar Amigo");
		System.out.println("2 - Cadastrar Livro");
		System.out.println("3 - Emprestimos");
		System.out.println("9 - Sair");
		System.out.println("Digite a opcao desejada:");

		int opcao = teclado.nextInt();
		switch (opcao) {
		case 1:
			TelaAmigos telaAmigos = new TelaAmigos();
			telaAmigos.exibeTelaAmigos();
			break;
		case 2:
			TelaLivros telaLivros = new TelaLivros();
			telaLivros.exibeTelaLivros();
			break;
		case 3:
			TelaEmprestimos telaEmprestimos = new TelaEmprestimos();
			telaEmprestimos.exibeTelaEmprestimos();
			break;
		case 9:

			break;
		default:
			break;
		}
	}



	public void sair() {

	}

	public void retornar() {
		exibeTelaPrincipal();
	}

}

package telas;

import java.util.Scanner;
import controladores.*;
import telas.*;

public class TelaPrincipal extends TelaAmigos {
	
	

		

	public static void exibeTelaPrincipal() {	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bem vindo ao Sistema de Livros, voc� deseja?");
		System.out.println("1 - Cadastrar Amigo");
		System.out.println("2 - Cadastrar Livro");
		System.out.println("3 - Registrar Empr�stimo");
		System.out.println("9 - Sair");
		System.out.println("Digite a op��o desejada:");
		
		int opcao = teclado.nextInt();
		switch (opcao) {
		case 1:
			exibeTelaAmigos();
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 9:
			
			break;	
		default:
			break;
		}		
	}

	

	public void sair() {

	}

}

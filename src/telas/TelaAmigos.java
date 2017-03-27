package telas;
import java.util.ArrayList;
import java.util.Scanner;

import controladores.ControladorAmigo;
import entidades.Amigo;

public class TelaAmigos {

	/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */




	/**
	 *
	 * @author 08801473931
	 */

	    private Scanner teclado;
	    private ControladorAmigo owner;

	    public TelaAmigos(ControladorAmigo owner) {
	        this.teclado = new Scanner(System.in);
	        this.owner = owner;
	    }

	    int opcao = 0;
	    public void exibeTelaAmigos() {

	        do {


	        System.out.println("-------------- SisAmigo -------------");
	        System.out.println("1 - Cadastra Amigo");
	        System.out.println("2 - Exclui Amigo");
	        System.out.println("3 - Altera Amigo");
	        System.out.println("4 - Lista Amigos");
	        System.out.println("5 - Retorna");
	        System.out.println("Escolha a opcao: ");
	        this.opcao = this.teclado.nextInt();


	        switch(this.opcao) {

	            case 1:
	                this.cadastraAmigo();
	                break;

	            case 4:
	                this.listaAmigos();
	                break;
	            case 3:
	                 this.alteraAmigo();
	                break;
	            case 2:
	                this.excluiAmigo();
	                break;

	        }


	        } while (this.opcao != 0);


	    }

	    private void cadastraAmigo() {

	    		String nome = this.pedeNomeAmigo();

	            int telefone = this.pedeTelefoneAmigo();

	            String email = this.pedeEmailAmigo();

	            Amigo amigo = new Amigo(nome, telefone, email);

	            this.owner.cadastraAmigo(amigo);

	    }

	   public void exibeListaAmigos(ArrayList<Amigo> listaAmigos) {

	       for (Amigo amigo : listaAmigos) {
	           System.out.println("cadastraAmigoAmigo: "+ amigo.getNome());
	           System.out.println("codigo Amigo: "+ amigo.getTelefone());
	           System.out.println("codigo Amigo: "+ amigo.getEmail());
	       }
	    }

	    private  void listaAmigos() {
	        this.owner.listarAmigos();
	    }

	    private  void excluiAmigo() {
	       String nomeParaExcluir = this.pedeNomeAmigo();

	      if (this.owner.removerAmigo(nomeParaExcluir)) {
	          System.out.println("Amigo excluido com sucesso!!");
	      } else {
	          System.out.println("Não foi possivel excluir o amigo");
	      }

	    }

	    private int pedeTelefoneAmigo() {
	       System.out.println("Digite o Telefone: ");
	       int codigo = this.teclado.nextInt();
	       return codigo;
	    }

	    private String pedeEmailAmigo() {
		       System.out.println("Digite o Email: ");
		       String email = this.teclado.next();
		       return email;
	    }


	    private void alteraAmigo() {

	        String nomeParaAlterar = this.pedeNomeAmigo();

	        int telefoneParaAlterar = this.pedeTelefoneAmigo();

	        String emailParaAlterar = this.pedeEmailAmigo();

	        this.owner.alteraAmigo(nomeParaAlterar, telefoneParaAlterar, emailParaAlterar);

	    }

	    private String pedeNomeAmigo() {
	        System.out.println("Digite o nome: ");
	        String nome = this.teclado.next();
	        return nome;
	    }



	}


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
	    
	    private static Scanner teclado;
	    private ControladorAmigo owner;
	    
	    public void TelaAmigo(ControladorAmigo owner) {
	        this.teclado = new Scanner(System.in);
	        this.owner = owner;
	    }
	    static int opcao = 0;
	    public static void exibeTelaAmigos() {
	        
	        do {
	        
	        
	        System.out.println("-------------- SisAmigo -------------");
	        System.out.println("1 - Cadastra Amigo");
	        System.out.println("2 - Exclui Amigo");
	        System.out.println("3 - Altera Amigo");
	        System.out.println("4 - Lista Amigos");
	        System.out.println("5 - Retorna");
	        System.out.println("Escolha a opcao: ");
	        opcao = teclado.nextInt();
	        
	        
	        switch(opcao) {
	            
	            case 1:
	                cadastraAmigo();
	                break;
	                
	            case 4:
	                listaAmigos();
	                break;
	            case 3:
	                 alteraAmigo();              
	                break;
	            case 2:
	                excluiAmigo();
	                break;
	   
	        }
	        
	        
	        } while (opcao != 0);      
	        
	        
	    }

	    private void cadastraAmigo() {
	    	
	    		String nome = pedeNomeAmigo();
	            
	            int telefone = pedeTelefoneAmigo();
	            
	            String email = pedeEmailAmigo();
	            
	            Amigo amigo = new Amigo(nome, telefone, email);
	            
	            owner.incluiAmigo(amigo);
	            
	    }

	   public void exibeListaAmigos(ArrayList<Amigo> listaAmigos) {
	        
	       for (Amigo amigo : listaAmigos) {
	           System.out.println("Amigo: "+ amigo.getNome());
	           System.out.println("codigo Amigo: "+ amigo.getTelefone());
	           System.out.println("codigo Amigo: "+ amigo.getEmail());
	       }
	    }

	    private void listaAmigos() {
	        owner.listaAmigos();
	    }

	    private void excluiAmigo() {      
	       String nomeParaExcluir = pedeNomeAmigo(); 
	       
	      if (owner.excluiAmigoPeloCodigo(nomeParaExcluir)) {
	          System.out.println("Amigo excluido com sucesso!!");
	      } else {
	          System.out.println("Não foi possivel excluir o amigo");
	      }

	    }
	    
	    private int pedeTelefoneAmigo() {
	       System.out.println("Digite o Telefone: ");
	       int codigo = teclado.nextInt(); 
	       return codigo;
	    }
	    
	    private String pedeEmailAmigo() {
		       System.out.println("Digite o Email: ");
		       String email = teclado.next(); 
		       return email;
	    }
	    

	    private void alteraAmigo() {
    
	        String nomeParaAlterar = pedeNomeAmigo();
	        
	        int telefoneParaAlterar = pedeTelefoneAmigo();
	        
	        String emailParaAlterar = pedeEmailAmigo();
		    	        
	        owner.alteraAmigoPeloCodigo(nomeParaAlterar, telefoneParaAlterar, emailParaAlterar);
	        
	    }

	    private String pedeNomeAmigo() {
	        System.out.println("Digite o nome: ");
	        String nome = teclado.next();
	        return nome;
	    }
	    
	    
	    
	}


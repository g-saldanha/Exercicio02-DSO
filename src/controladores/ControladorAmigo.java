package controladores;

import java.util.ArrayList;

import entidades.Amigo;
import entidades.Pessoa;


public class ControladorAmigo extends Amigo {

	public ControladorAmigo(Pessoa nome, int telefone, String email) {

		// TODO Auto-generated constructor stub
	}

	private ArrayList<Amigo> amigos;

	public boolean cadastraAmigo(String nome) {
		return false;
	}

	public boolean removerAmigo(String nome) {
		return false;
	}

	public ArrayList<Amigo> listarAmigo() {
		return this.amigos;
	}

	public void incluiAmigo(Amigo amigo) {


	}

	public void listaAmigos() {
		// TODO Auto-generated method stub

	}

	public void alteraAmigoPeloCodigo(String nomeParaAlterar, int telefoneParaAlterar, String emailParaAlterar) {
		// TODO Auto-generated method stub

	}

	public boolean excluiAmigoPeloCodigo(String nomeParaExcluir) {
		// TODO Auto-generated method stub
		return false;
	}

}

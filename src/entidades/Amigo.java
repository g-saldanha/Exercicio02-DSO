package entidades;

public class Amigo {

	private Pessoa nome;

	private int telefone;

	private String email;
	
	public Amigo(Pessoa nome, int telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public Pessoa getNome() {
		return nome;
	}

	public void setNome(Pessoa nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

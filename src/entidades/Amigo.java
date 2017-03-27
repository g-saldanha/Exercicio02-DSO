package entidades;

public class Amigo {

	private Pessoa nome;

	private int telefone;

	private String email;

	public Amigo(String nome, int telefone, String email) {
		this.nome = new Pessoa(nome);
		this.telefone = telefone;
		this.email = email;
	}

	public Pessoa getNome() {
		return this.nome;
	}

	public void setNome(Pessoa nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return this.telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

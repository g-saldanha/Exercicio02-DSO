package entidades;

public class Livro {

	private String titulo;

	private String resumo;

	private Pessoa autor;

	private Pessoa personagemPrincipal;

	private String genero;

	private String faixaEtaria;

	private boolean estaLocado;

	private Pessoa quemLocou;

	public Livro(Pessoa autor, String resumo, String titulo, Pessoa personagemPrincipal, String genero, String faixaEtaria) {
		this.autor = autor;
		this.resumo = resumo;
		this.titulo = titulo;
		this.personagemPrincipal = personagemPrincipal;
		this.genero = genero;
		this.faixaEtaria = faixaEtaria;
		this.estaLocado = false;
		this.quemLocou = null;
	}



	public String getTitulo() {
		return this.titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public boolean isEstaLocado() {
		return this.estaLocado;
	}

	public void setEstaLocado(boolean estaLocado) {
		this.estaLocado = estaLocado;
	}

	public Pessoa getQuemLocou() {
		return this.quemLocou;
	}

	public void setQuemLocou(Pessoa quemLocou) {
		this.quemLocou = quemLocou;
	}

}

package at2;

public class Titulo {
	
	private String nome;
	private int temporadas;
	
	public Titulo(String nome,int temporadas) {
		this.nome = nome;
		this.temporadas = temporadas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	
	public String toString() {
		return "nome = "+nome+"temporadas = "+temporadas;
	}
}

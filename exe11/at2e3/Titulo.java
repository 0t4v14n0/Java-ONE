package at2e3;

public class Titulo implements Comparable<Titulo> {
	
	private String nome;
	
	public Titulo(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Nome do Titulo: "+nome+"\n";
	}

	@Override
	public int compareTo(Titulo outroTitulo) {
		return this.getNome().compareTo(outroTitulo.getNome());
	}
}

package exe5;

public class Aluno {
	
	private String nome;
	private double notas;
	private int quantidadeNotas = 1;
	
	public Aluno(String nome,double notas) {
		this.nome = nome;
		this.notas = notas;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addNotas(double notas) {
		this.notas += notas;
		this.quantidadeNotas++;
	}
	
	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}
	
	public double media() {
		return notas / quantidadeNotas;
	}
	
	public String toString() {
		return "Aluno: "+nome+" Media: "+media();
	}

}

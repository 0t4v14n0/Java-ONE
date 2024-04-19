package at2e3;

public class Animal {
	
	private String nome;
	private int idade;
	private double peso;
	private String sexo;
	
	public Animal(String nome,int idade,double peso,String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String toString() {
		return "Nome: "+nome+" idade: "+idade+" peso: "+peso+" sexo: "+sexo;
	}

}

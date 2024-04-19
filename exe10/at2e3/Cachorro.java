package at2e3;

public class Cachorro extends Animal {
	
	private String raca;

	public Cachorro(String nome, int idade, double peso, String sexo, String raca) {
		super(nome, idade, peso, sexo);
		this.raca = raca;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}

}

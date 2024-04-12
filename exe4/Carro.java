package exe4;

public class Carro {
	
	private String modelo;
	private int ano;
	private String cor;
	
	public Carro(String modelo,int ano,String cor) {
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}
	
	public double retornaIdade() {
		return 2024 - ano;
	}
	
	public String toString() {
		return "Carro do Modelo: "+modelo+"do ano: "+ano+"da cor: "+cor+"idade do carro: "+retornaIdade();
	}

}

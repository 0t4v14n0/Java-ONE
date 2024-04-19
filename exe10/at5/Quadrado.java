package at5;

public class Quadrado implements Forma {
	
	public double valor;
	
	public Quadrado(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcularArea() {
		return valor * valor;
	}

}

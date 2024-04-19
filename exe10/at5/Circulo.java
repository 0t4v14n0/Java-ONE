package at5;

public class Circulo implements Forma{
	
	public double valor;
	
	public Circulo(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcularArea() {
		return Math.PI * valor;
	}

}

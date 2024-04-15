package at2;

public class Main {

	public static void main(String[] args) {
		
		CalculoGeometrico cg = new CalculadoraSalaRetangular();
		
		int altura = 10;
		int largura = 20;
		
		int area = cg.calcularArea(altura, largura);
		int perimetro = cg.calcularPerimetro(altura, largura);
		
		System.out.println("Valor da area: "+area);
		System.out.println("Valor do perimetro: "+perimetro);
	}

}

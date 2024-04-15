package at2;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
	public int calcularArea(int altura,int largura) {
		int area = altura * largura;
		return area;
	}
	
	public int calcularPerimetro(int altura,int largura) {
		int perimetro = altura + largura;
		return perimetro;
	}
}

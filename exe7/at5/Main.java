package at5;

public class Main {

	public static void main(String[] args) {
		
		boolean fisico = false;
		
		Calculavel cv = new Livro("A volta","Dom Pedro",256,26.99);
		
		Calculavel pf = new ProdutoFisico("A volta", "Dom Pedro", 256, 26.99);
		
		if(fisico) {
			System.out.println("Valor do livro fisico com taxa de entrega: "+pf.calcularPrecoFinal());
		}else {
			System.out.println("Valor do livro online ja com descontos: "+cv.calcularPrecoFinal());
		}
	}

}

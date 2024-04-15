package at3;

public class TabuadaMultiplicacao implements Tabuada {
	public void mostrarTabuada(int numero) {
		for (int i = 1; i<=10; i++) {
			System.out.println(numero+" X "+i+" = "+(numero * i));
		}
	}
}

package at4;

public class NumerosPrimos {
	
	public void verificarPrimalidade(int a){
		boolean tf = VerificadorPrimo.verificarSeEhPrimo(a);
		listarPrimos(tf,a);
	}
	
	public static void listarPrimos(boolean tf, int a){
		if(tf == true) {
			System.out.println("o numero: "+a+" e primo");
		}else {
			System.out.println("o numero: "+a+" nao e primo");
		}
	}

}

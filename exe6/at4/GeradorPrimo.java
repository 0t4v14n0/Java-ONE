package at4;
import java.util.Random;

public class GeradorPrimo extends NumerosPrimos {
	
	public void gerarProximoPrimo() {
		
		Random gerador = new Random();
		
		int a = gerador.nextInt(0, 100);
		
		verificarPrimalidade(a);
		
	}

}

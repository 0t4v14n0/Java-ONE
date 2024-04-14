package at4;

public class VerificadorPrimo extends NumerosPrimos {
	
	public static boolean verificarSeEhPrimo(int a) {
		
        if (a <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
            	return false;
            }
        }

        return true;
		
	}

}

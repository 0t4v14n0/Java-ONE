package at1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
    	System.out.println("numero 1");
    	int numero1 = Integer.parseInt(scanner.nextLine());
    	
    	System.out.println("numero 2");
    	int numero2 = Integer.parseInt(scanner.nextLine());
    	
		try {
			
			int resultado = numero1/numero2;
			System.out.println("Resultado: " + resultado);
			
		}catch(Exception e) {
			System.out.println("ERRO " + e);
		}

	}

}

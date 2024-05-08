package at2;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// https://api.bitpreco.com/btc-brl/ticker
		
		Scanner leitura = new Scanner(System.in);
		
		do {
			
	        System.out.println("Digite um sigla de cripto para busca: ");
	        String busca = leitura.nextLine();
			
			if (busca.equals("sair") || busca.equals("Sair") || busca.equals("exit") || busca.equals("Exit")) {
				break;
			}
			else {
				
				APICripito api = new APICripito();
				
				Cripto resposta = api.busca(busca);
				
				System.out.println(resposta);
							
			}
			
		} while(true);
		
		leitura.close();

	}

}

package at3;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Scanner leitura = new Scanner(System.in);
		
		do {
			
	        System.out.println("Digite uma receita: ");
	        String busca = leitura.nextLine();
			
			if (busca.equals("sair") || busca.equals("Sair") || busca.equals("exit") || busca.equals("Exit")) {
				break;
			}
			else {
				
				APIReceita api = new APIReceita();
				
				Receita resposta = api.busca(busca);
				
				System.out.println(resposta);
							
			}
			
		}while(true);
		
		leitura.close();

	}

}

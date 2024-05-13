package at3;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		try {
			
			System.out.println("Digite nome do usuario: ");
	        String nome = leitura.nextLine();
	        
	        APIGithub consu = new APIGithub();
	        
			Usuario user = consu.busca(nome);
			
			System.out.println(user);
			
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

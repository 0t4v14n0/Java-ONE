package at2;

import java.util.Scanner;

public class Main {
	
    static void validarSenha(String senha) throws SenhaException {
        if (senha.length() < 8) {
            throw new SenhaException("A senha deve ter pelo menos 8 caracteres");
        }
    }

	public static void main(String[] args){
		
		try {
			
			Scanner scanner = new Scanner(System.in);
			
	    	System.out.println("Senha: ");
	    	String senha = scanner.nextLine();
	    	
	    	validarSenha(senha);
			
		}catch(SenhaException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}

package com.cep;

import java.io.IOException;
import java.util.Scanner;
import com.cep.util.ApiCEP;
import com.cep.util.Cep;
import com.cep.util.GerarArquivo;

public class Main {
    
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	do {
    		
        	System.out.println("Buscar CEP ou sair");
    		String cep = scanner.nextLine();
    		
    		if (cep.equals("sair") || cep.equals("Sair") || cep.equals("exit") || cep.equals("Exit")) {
    			
    			break;
                
    		}
    		else {
    			
                ApiCEP apiCEP = new ApiCEP();
                
                try {
                	
                    Cep novoCep = apiCEP.consultarEnderecoPeloCEP(cep);
                    System.out.println(novoCep);
                    GerarArquivo gerador = new GerarArquivo();
                    gerador.salvaJson(novoCep);
                    
                } catch (IOException | InterruptedException e) {
                    System.err.println("Não foi possível obter o endereço a partir desse CEP.");
                    e.printStackTrace();
                }
                
    		}
    		
    	}while(true);
    
    }
}

package com.viso;

import java.math.BigInteger;
import java.util.Scanner;

import com.viso.util.Bandeira;
import com.viso.util.Erro;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		int tentativas = 3;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			//numero teste VISA 4123456789101112131415
			System.out.println("--------------");
			System.out.println("-_BANCO_LURA_-");
			System.out.println("--------------");
			
			//PEGAR VALOR PARA A VALIDACAO DO NUMERO DO CARTAO E COLETA DA BANDEIRA
			System.out.println("Numero do Cartao:");
			String numero = scanner.nextLine();
			
	        try {
	        	
	        	BigInteger bigInteger = new BigInteger(numero);
	            System.out.println("Número do cartão digitado: " + bigInteger);
	            
	            Bandeira numeroCartao = new Bandeira(bigInteger);
	            
	        	if (numeroCartao.getValidacao() == true) {
	        		System.out.println(numeroCartao.getBandeira());
	        	}
	        	else {
	        		
	        		Erro.quantidadeErro();
	        		
		        	if(Erro.getTentativas() == 0) {
		        		break;
		        	}
	        	}        
	                      
	        } catch (NumberFormatException e) {
	        	
	        	Erro.quantidadeErro();
	        	
	        	if(Erro.getTentativas() == 0) {
	        		break;
	        	}
	        }
			
		}while(true);

	}

}

package com.viso;

import java.math.BigInteger;
import java.util.Scanner;

import com.viso.util.Bandeira;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
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
	            
	        	if (numeroCartao.getValidacao()) {
	        		System.out.println(numeroCartao.getBandeira());
	        	}
	        	else {
	        		
	        	}
	            
	            break;
	            
	                      
	        } catch (NumberFormatException e) {// tudo ok...
	        	
	        	tentativas--;
	        	// se acabar as tentativas FIM...
	        	if(tentativas == 0) {
	        		System.out.println("FIM...");
	        		break;
	        	}
	        	
	            System.out.println("Erro: o numero do cartao inserido nao e valido.");
	            System.out.println("Voce tem mais: "+tentativas+" tentativas.");
	            System.out.println("Em 3 segundos uma nova tentativa.");
	            
	            // time sleep de 3 segundos.
	            Thread.sleep(3000);
	            
	            //limpar a tela usando for com prints vazios.
	            for(int i = 0; i <= 1;i++){
	            	System.out.println("");
	            }
	            
	        }
			
		}while(true);

	}

}

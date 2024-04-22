package com.viso.util;

public class Erro{
	
	static int tentativas = 3;
	
	public static int getTentativas() {
		return tentativas;
	}
	
	public static void quantidadeErro() throws InterruptedException{
		
		tentativas--;
		
		// se acabar as tentativas FIM...
		if(tentativas == 0) {
			System.out.println("FIM...");
		}
		else {
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
	}
}

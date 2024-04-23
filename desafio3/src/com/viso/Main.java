package com.viso;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import com.viso.util.Bandeira;
import com.viso.util.Compra;
import com.viso.util.Erro;

public class Main {
	
	public static void main(String[] args) throws Exception {
	
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Compra> listaProdutos = new ArrayList<>();
		
		do {
			
			//numero teste VISA 4123456789101112131415
			System.out.println("--------------");
			System.out.println("-_BANCO_LURA_-");
			System.out.println("--------------");
			
			//PEGAR VALOR PARA A VALIDACAO DO NUMERO DO CARTAO E COLETA DA BANDEIRA
			System.out.println("Nome do cliente:");
			String nome = scanner.nextLine();
			System.out.println("Numero do Cartao:");
			String numero = scanner.nextLine();
			
	        try {
	        	int a = 2;
	        	BigInteger bigInteger = new BigInteger(numero);
	            //System.out.println("Número do cartão digitado: " + bigInteger);

	            
	            Bandeira numeroCartao = new Bandeira(bigInteger);
	            
	        	if (numeroCartao.getValidacao() == true) {
	        		System.out.println(numeroCartao.getBandeira());
	        		
	        		
		        	do {
		        		
		        		System.out.println("Opcoes: ");
		        		System.out.println("");
		        		System.out.println("1 - Comprar ");
		        		System.out.println("2 - Visualizar extrato ");
		        		System.out.println("3 - Emitir Fatura");
		        		System.out.println("4 - Sair");
		        		
		        		int opcao = Integer.parseInt(scanner.nextLine());
		        		
		                switch (opcao) {
		                case 1:
		                	
		                	if(calcularTotalCompras(listaProdutos) < Compra.getLimite()) {
		                		
			                    System.out.println("");
			    	            System.out.println("Nome do item da compra: ");
			    	            String item = scanner.nextLine();
			    	            System.out.println("Preco: ");
			    	            double preco = Double.parseDouble(scanner.nextLine());
			    	            System.out.println("Quantidade: ");
			    	            int quantidade = Integer.parseInt(scanner.nextLine());
			    	            
			    	            if((calcularTotalCompras(listaProdutos) + (preco * quantidade)) < Compra.getLimite()) {
			    	            	System.out.println("Compra feita com exito... ");
				    	            Compra compra = new Compra(item,preco,quantidade);
				    	            listaProdutos.add(compra);
				    	            pausa();
			    	            }
			    	            else {
			    	            	System.out.println("Passou do limite... ");
			    	            	pausa();
			    	            }
			    	            
		                	}
		                	else {
		                		System.out.println("Passou do limite... ");
		                		pausa();
		                	}		                		             
		    	            
		                    break;
		                    
		                case 2:
		                	System.out.println("Extarto Bancario ");
		                    System.out.println("Nome "+nome);
		                    System.out.println("Bandeira: "+numeroCartao.getBandeira()+" numero:  "+numeroCartao.getNumeroCartao());
		                    System.out.println("Fatura: "+calcularTotalCompras(listaProdutos));
		                    pausa();
		                    break;
		                case 3:
		                	
		                	Collections.sort(listaProdutos, Comparator.comparingDouble(Compra::totalProduo).reversed());
		                	
		                    System.out.println("FATURA BANCO LURA");
		                    System.out.println("-----------------");
		                    System.out.println("CLIENTE : "+nome);
		                    System.out.println("Bandeira: "+numeroCartao.getBandeira()+" numero:  "+numeroCartao.getNumeroCartao());
		                    System.out.println("Numero  : "+numeroCartao.getNumeroCartao());
		                    System.out.println("-----------------");
		                    for (Compra cp : listaProdutos) {
		                    	System.out.println(cp.toString()+" Preco Total"+cp.totalProduo());
		                    }
		                    System.out.println("-----------------");
		                    pausa();
		                    break;
		                case 4:
		                	System.out.println("Fim...");
		                	pausa();
		                    a = 0;
		                    break;
		                }
		        		
		        	} while(a != 0);
		        	break;
		        	
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

	public static double calcularTotalCompras(ArrayList<Compra> compras) {
        double total = 0.0;
        for (Compra compra : compras) {
            total += compra.totalProduo();
        }
        return total;
    }
	
	public static void pausa() throws InterruptedException {
		Thread.sleep(3000);
	}

	private <T extends Object> double totalProduo(T t1) {
		return 0;
	}

}

package bancodesafio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(007,"James Bond", 12000.0, "Corrente");
		
		int a = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("Operações          \r\n"
									  			+ "\r\n"
							 + "1- Consultar saldos\r\n"
							 + "2- Receber valor   \r\n"
							 + "3- Transferir valor\r\n"
							 + "4- Dados da conta  \r\n"
							 + "5- Sair            \r\n"
							 					+ "\r\n"
							 + "Digite a opção desejada:");
			
			int opicao = Integer.parseInt( scanner.nextLine());
			
	        switch(opicao){
            case 1:
            	System.out.println("Saldo Atual: R$"+cliente.getSaldo());
                break;
            case 2:
            	System.out.println("Quanto a receber ? ");
            	double add = Double.parseDouble(scanner.nextLine());
            	cliente.setSaldo(cliente.getSaldo() + add);
            	System.out.println("Tudo certo...");
                break;
            case 3:
            	System.out.println("Transferir quanto ?");
            	double tira = Double.parseDouble(scanner.nextLine());
            	if(tira > cliente.getSaldo()) {
            		System.out.println("Nao tem saldo em conta...");
            	}else {
            		cliente.setSaldo(cliente.getSaldo() - tira);
            	}
                break;
            case 4:
            	System.out.println(cliente.toString());
            	break;
            case 5:
            	System.out.println("vlw, vlw, cessa dog...");
            	a=4;
                break;
	        }
			
		}while(a != 4);
		
		scanner.close();

	}

}

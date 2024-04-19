/*
- 6 - Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de contas bancárias
com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.
*/

package at6;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		double a = 0;
		String saida = "";
		
		ArrayList<ContaBancaria> listaBancaria = new ArrayList<>();
		
		ContaBancaria conta1 = new ContaBancaria("Otaviano",5,3.70);
		ContaBancaria conta2 = new ContaBancaria("formigao",6,600.70);
		ContaBancaria conta3 = new ContaBancaria("feiura",7,773.70);
		ContaBancaria conta4 = new ContaBancaria("kyureni",8,554443.70);
		ContaBancaria conta5 = new ContaBancaria("Pasiot",7,773.70);
		
		listaBancaria.add(conta1);
		listaBancaria.add(conta2);
		listaBancaria.add(conta3);
		listaBancaria.add(conta4);
		listaBancaria.add(conta5);
		
		for (ContaBancaria conta : listaBancaria) {
			if(conta.getSaldo() > a) {
				a = conta.getSaldo();
				saida = "Nome: "+conta.getNome()+" numero da conta: "+conta.getNumeroConta()+" com o maior saldo de: "+conta.getSaldo();
			}
		}
		
		//maior valor
		System.out.println(saida);
				
	}

}

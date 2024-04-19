/*
- 1 Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.

- 2 No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.

- 3 Adicione pelo menos três pessoas à lista utilizando o método add.

- 4 Imprima o tamanho da lista utilizando o método size.

- 5 Imprima a primeira pessoa da lista utilizando o método get.

- 6 Imprima a lista completa

*/

package at1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Pessoa> listaPessoa = new ArrayList<>();
		
		Pessoa pessoa = new Pessoa("Kaua",18);
		Pessoa pessoa2 = new Pessoa("Tonho",22);
		Pessoa pessoa3 = new Pessoa("Dada",44);
		Pessoa pessoa4 = new Pessoa("Peu",27);
		
		listaPessoa.add(pessoa);
		listaPessoa.add(pessoa2);
		listaPessoa.add(pessoa3);
		listaPessoa.add(pessoa4);
		
		System.out.println(listaPessoa.size());
		
		System.out.println(listaPessoa.get(0));
		
		System.out.println("Lista de"+listaPessoa.size()+" Pessoas:");
		
        for (Pessoa pessoas : listaPessoa) {
            System.out.println(pessoas);
        }
	}

}

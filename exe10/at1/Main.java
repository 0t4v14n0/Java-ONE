package at1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Pessoa> listaProdutos = new ArrayList<>();
		
		Pessoa pessoa1 = new Pessoa("formigao");
		Pessoa pessoa2 = new Pessoa("dog");
		Pessoa pessoa3 = new Pessoa("ayel");
		Pessoa pessoa4 = new Pessoa("feiura");
		
		listaProdutos.add(pessoa1);
		listaProdutos.add(pessoa2);
		listaProdutos.add(pessoa3);
		listaProdutos.add(pessoa4);
		
		for (Pessoa pessoa : listaProdutos) {
			System.out.println(pessoa.toString());
			System.out.println();
		}
	}

}

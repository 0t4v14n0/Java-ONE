package at4;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		double a = 0;
		
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		
		Produto produto1 = new Produto("Ovo",17.70);
		Produto produto2 = new Produto("camisa",33.70);
		Produto produto3 = new Produto("pao",3.70);
		Produto produto4 = new Produto("papa",5.70);
		
		listaProdutos.add(produto1);
		listaProdutos.add(produto2);
		listaProdutos.add(produto3);
		listaProdutos.add(produto4);
		
		for (Produto produto : listaProdutos) {
			a += produto.getPreco();
		}

		System.out.println("preco medio: "+ a /listaProdutos.size());
		
		
	}
}

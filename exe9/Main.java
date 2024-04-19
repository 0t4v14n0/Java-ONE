/*
- 1 - Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList.

- 2 -Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.

- 3 -Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto. Em seguida, imprima a lista de produtos utilizando
o método System.out.println().

- 4 - Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos. Em seguida, crie objetos Produto utilizando 
esse novo construtor.

- 5 -Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor que utilize o construtor da classe mãe (super)
 para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel e imprima seus valores.
*/

package at1;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		
		Produto produto1 = new Produto("Ovo",17.70,3);
		Produto produto2 = new Produto("Frango",24.40,2);
		Produto produto3 = new Produto("Aroz",7.80,3);
		Produto produto4 = new Produto("Pasta De Dente",5.50,2);
		Produto produto5 = new Produto("Azeite",20.20,1);
		
		listaProdutos.add(produto1);
		listaProdutos.add(produto2);
		listaProdutos.add(produto3);
		listaProdutos.add(produto4);
		listaProdutos.add(produto5);
		
		System.out.println("Quantidade de Produtos: "+listaProdutos.size()+" Primeiro Produto:"+listaProdutos.get(0));
		
		System.out.println(listaProdutos);
		
		ArrayList<ProdutoPerecivel> listaProdutosPerecivel = new ArrayList<>();
		
		ProdutoPerecivel Perecivel1 = new ProdutoPerecivel("Ovo",15.70,3,"21/04/2028");
		ProdutoPerecivel Perecivel2 = new ProdutoPerecivel("Frango",20.40,2,"21/04/2028");
		ProdutoPerecivel Perecivel3 = new ProdutoPerecivel("Aroz",7.20,3,"21/04/2028");
		
		listaProdutosPerecivel.add(Perecivel1);
		listaProdutosPerecivel.add(Perecivel2);
		listaProdutosPerecivel.add(Perecivel3);
		
		System.out.println(listaProdutosPerecivel);
		
		
	}

}

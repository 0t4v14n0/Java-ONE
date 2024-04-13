/*

- 1 Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico).
Implemente métodos getters e setters para os atributos privados.

- 2 Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e
modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

- 3 Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar 
e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

- 4 Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e
modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.

- 5 Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e
modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.

*/

package exe5;

public class Main {

	public static void main(String[] args) {
		
		// - 1
		ContaBancaria contaBancaria = new ContaBancaria(1,1.320,"Olavo");
		
		// - 2
		IdadePessoa idadePessoa = new IdadePessoa("Olavo",18);
		
		// - 3
		Produto produto = new Produto("Pasta de dente",5.50);
		
		// - 4
		Aluno aluno = new Aluno("Olavo de caraio",5.90);
		
		// - 5
		Livro livro = new Livro("Codigo limpo","Robert Cecil Martin");
		
		
		// - 1 exibe o conteudo
		System.out.println(contaBancaria);
		
		// - 2 maior de idade ?
		System.out.println(idadePessoa.maiorIdade());
		
		// - 3 desconto em produto
		System.out.println(produto);
		
		// - 4 media de notas
		aluno.addNotas(8.8);
		System.out.println(aluno);
		
		// - 5
		System.out.println(livro);
		
	}

}

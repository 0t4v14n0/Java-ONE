package exe4;

import java.util.Scanner;

/*
1 - Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.

2 - Crie uma classe Calculadora com um método que recebe um número como parâmetro
e retorna o dobro desse número.

3 - Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao
e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e 
calcular a média de avaliações.

4 - Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha
técnica e calcular a idade do carro.

5 - Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.

6 - Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o
método para exibir as informações.
 * */

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// - 1 
		
		Pessoa.apresentacao();
		
		// - 2
		
		System.out.println("Numero para dobrar: ");
		int dobra = Integer.parseInt( scanner.nextLine());
		System.out.println("Numero para dobrar: "+Calculadora.multiplicacao(dobra));
		
		// - 3
		
		Musica musica = new Musica("Magaiver","CHUKNORIS",1988,7.5,1);
		
		musica.avaliacao(8.8);
		
		System.out.println(musica);
		
		// - 4
		
		Carro carro = new Carro("Magaiver",1988,"CHUKNORIS");
		
		carro.retornaIdade();
		
		// - 5
		
		Aluno aluno = new Aluno("Otaviano",23);
		
		System.out.println(aluno);
		
		scanner.close();

	}

}

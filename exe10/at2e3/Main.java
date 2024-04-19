/*
1 - Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.

2 - Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo correto antes de fazer o casting.
*/

package at2e3;

public class Main {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Negao", 7, 35.300, "Masculino", "RND");
		
		Animal animal = (Animal) dog;
		
		System.out.println(animal);
		
        if (animal instanceof Cachorro) {
            Cachorro dogNovo = (Cachorro) animal;
            System.out.println("Raça do cachorro: " + dogNovo.getRaca());
        }
	}
}

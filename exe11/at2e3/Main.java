/*
1 - Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.

2 - Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.

3 - No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.

4 - Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList. Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.

5 - Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo.
*/

package at2e3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Titulo> listaTitulos = new ArrayList<>();
		
		Titulo titulo1 = new Titulo("Osvaldo");
		Titulo titulo2 = new Titulo("Psvaldo");
		Titulo titulo3 = new Titulo("Vsvaldo");
		Titulo titulo4 = new Titulo("Dsvaldo");
		Titulo titulo5 = new Titulo("Asvaldo");
		
		listaTitulos.add(titulo1);
		listaTitulos.add(titulo2);
		listaTitulos.add(titulo3);
		listaTitulos.add(titulo4);
		listaTitulos.add(titulo5);
		
		System.out.println(listaTitulos);
		System.out.println();
		
		Collections.sort(listaTitulos);
		
		System.out.println("ORDENADA");
		System.out.println(listaTitulos);

	}

}

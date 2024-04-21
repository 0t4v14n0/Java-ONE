/*
1 - Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList. Adicione elementos e
imprima a lista, mostrando que é possível trocar facilmente a implementação.
 
2 - Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo.
*/

package at4e5;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Listas {

    public static void main(String[] args) {
    	
        List<String> lista;

        lista = new ArrayList<>();
        lista.add("maca");
        lista.add("banana");
        lista.add("laranja");

        System.out.println("ArrayList:");
        System.out.println(lista);

        lista = new LinkedList<>();
        lista.add("cachorro");
        lista.add("gato");
        lista.add("passaro");

        System.out.println("LinkedList:");
        System.out.println(lista);
    }
}

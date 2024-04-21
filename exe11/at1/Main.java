package at1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    	
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(5);
        numeros.add(8);
        numeros.add(3);

        System.out.println("Lista antes da ordenação:");
        System.out.println(numeros);

        Collections.sort(numeros);

        System.out.println("\nLista após a ordenação crescente:");
        System.out.println(numeros);
    }
}
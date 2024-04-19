/*
- 1 -Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por exemplo,
Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para
calcular e imprimir a área de cada forma. 
*/

package at5;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// criando a lista de formas
		ArrayList<Forma> listaCalcular = new ArrayList<>();
		
		//add os valores a lista
		listaCalcular.add(new Circulo(18.0));
		listaCalcular.add(new Quadrado(20));
		listaCalcular.add(new Circulo(12.0));
		listaCalcular.add(new Circulo(77.0));
		listaCalcular.add(new Quadrado(26));
		listaCalcular.add(new Quadrado(33.30));
		
		// for repeticao
        for (Forma forma : listaCalcular) {
        	//testando objeto se e da classe
            if (forma instanceof Circulo) {// se for de circulo
                System.out.println("Area do Circulo: " + forma.calcularArea());
            } else{// se nao for Circulo
                System.out.println("Area do Quadrado: " + forma.calcularArea());
            }
        }
		
	}

}

/*
1 - Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo",
 caso contrário, exiba "Número negativo".

2 - Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são
 iguais, diferentes, o primeiro é maior ou o segundo é maior.

3 - Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
 Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

4 - Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

5 - Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e
exiba uma mensagem correspondente.

6 - Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
*/


import java.util.Scanner;

public class Main {

    public static void areas() {
        Scanner scanner = new Scanner(System.in);

        int valor = 0;
        String nome = "";
        double resu = 0;

        System.out.println("1 - Área do quadrado " +
                          " 2 - Área do círculo");
        int escolha = Integer.parseInt(scanner.nextLine());

        if (escolha == 2) {
            nome = "do Raio";
        } else  {
            nome = "da Base ou altura";
        }

        System.out.println("Qual é o valor " + nome + " ?");
        valor = Integer.parseInt(scanner.nextLine());
        if(escolha == 2){
            resu = Calcular.calcularAreaCirculo(valor);
        }else{
            resu = Calcular.calcularAreaQuadrado(valor);
        }
        System.out.println("Resultado "+nome+" "+ valor +" : "+resu);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o valor?");
        int valor = Integer.parseInt(scanner.nextLine());
        if (valor > 0) {
            System.out.println("VALOR POSITIVO!");
        } else {
            System.out.println("VALOR NEGATIVO!");
        }

        System.out.println("Digite o primeiro valor:");
        int valor1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o segundo valor:");
        int valor2 = Integer.parseInt(scanner.nextLine());

        if (valor1 > valor2) {
            System.out.println("O primeiro valor " + valor1 + " é maior que o segundo valor " + valor2);
        } else if (valor1 < valor2) {
            System.out.println("O primeiro valor " + valor1 + " é menor que o segundo valor " + valor2);
        } else {
            System.out.println("Os valores " + valor1 + " e " + valor2 + " são iguais");
        }

        areas();

        System.out.println("Tabuada do numero :");
        int tabu = Integer.parseInt(scanner.nextLine());

        Calcular.tabuada(tabu);

        System.out.println("Testar numero  :");
        int impaoupar = Integer.parseInt(scanner.nextLine());

        if (impaoupar % 2 == 0) {
            System.out.println(impaoupar + " é par.");
        } else {
            System.out.println(impaoupar + " é ímpar.");
        }

        System.out.println("Numero para fatorar :");
        int fato = Integer.parseInt(scanner.nextLine());

        Calcular.fatoracao(fato);

        scanner.close();
    }
}

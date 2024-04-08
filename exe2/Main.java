//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*

1 - Crie um programa que realize a média de duas notas decimais e exiba o resultado.

2 - Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da
variável double para int e imprima o resultado.

3 - Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
Atribua valores a essas variáveis e concatene-as em uma mensagem.

4 - Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o
resultado em uma mensagem.

5 - Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa
variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão
do valor em dólares para reais e imprima o resultado formatado.

6 - Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
representando o preço original de um produto. Em seguida, declare uma variável do tipo double
percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        double a = 1.77, b = 0.66;

        System.out.println("Resultado : "+ Calculos.media(a,b));

        double c = 1.99;int d = 10;

        System.out.println("Resultado : " + ((int) (c) + d));

        // 'aspas simples para caracteres' "duplas para Strings"...

        char letra = 'O'; String palavra = "la Mundo";

        System.out.println(letra + palavra);

        double precoProduto = 99.90; int quantidade = 5;

        System.out.println("Resultado valor total dos produtos : "+ Calculos.mult(precoProduto,quantidade));

        Scanner scanner = new Scanner(System.in);

        double valorEmDolares = 4.99;

        System.out.println("Quanto dolares ?");
        int dolar = Integer.parseInt( scanner.nextLine());

        System.out.println("$"+dolar+" Para reais "+Calculos.div(dolar,valorEmDolares));

        scanner.close();

        double precoOriginal = 77; double percentualDesconto = 10;

        System.out.println("Valor do produto = $"+precoOriginal+" Desconto de "+percentualDesconto+"% Preco ja com desconto: "+Calculos.desconto(precoOriginal,percentualDesconto));
    }
}

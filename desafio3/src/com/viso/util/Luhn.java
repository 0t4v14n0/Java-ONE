package com.viso.util;

public class Luhn {
	
    public static int somaDigitos(int numero) {
        if(numero < 9) {
            return numero;
        } else {
            return ( 1 + (numero % 10) );
        }
    }
	
    public static boolean checkValidade(String numeroCartao) {
    	
        int somaPar=0;
        int somaImpar=0;
        int aux=0;

        //PARES
        for( int j=numeroCartao.length()-2; j>=0; j=j-2 ) {
            aux = Integer.parseInt(numeroCartao.charAt(j)+"");
            somaPar = somaPar +  somaDigitos(aux*2);
        }

        //IMPARES
        for( int i=numeroCartao.length()-1; i>=0; i=i-2) {
            aux = Integer.parseInt(numeroCartao.charAt(i)+"");
            somaImpar = somaImpar +  aux;
        }

        if( ( (somaPar+somaImpar)%10 ) == 0 ) {
            return true;
        } else {
            return false;
        }

    }

}

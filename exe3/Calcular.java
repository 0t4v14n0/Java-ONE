public class Calcular {

    public static double calcularAreaQuadrado(int lado) {
        return lado * lado;
    }

    public static double calcularAreaCirculo(int raio) {
        return Math.PI * raio * raio;
    }

    public static void tabuada(int n){
        for (int i = 1; i < 11; i++) {
            int valor = n * i;
            System.out.println(n+" X "+i+" = "+valor);
        }
    }

    public static void fatoracao(int n){
        int resu = n;
        for (int i = n - 1; i > 0; i--) {
            resu = resu * i;
            System.out.println("!"+resu);
        }
    }

}

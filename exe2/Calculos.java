public class Calculos {
    public static double media(double a, double b){
        return a / b;
    }

    public static double mult(double a, int b){
        return a * b;
    }

    public static double div(int  a, double b){
        return a / b;
    }

    public static double desconto(double  a, double b){
        return (a - (a * (b/100)));
    }
}

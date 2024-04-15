package exe7;

public class Main {

	public static void main(String[] args) {
        ConversaoFinanceira conversor = new ConversorMoeda();
        double valorEmDolar = 100.0;
        double valorEmReal = conversor.converterDolarParaReal(valorEmDolar);;
        System.out.println("Valor em dólar: " + valorEmDolar);
        System.out.println("Valor em real: " + valorEmReal);
	}

}

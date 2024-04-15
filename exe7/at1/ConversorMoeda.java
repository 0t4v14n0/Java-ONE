package exe7;

public class ConversorMoeda implements ConversaoFinanceira {
	
	public double converterDolarParaReal(double dolar) {
		double real = dolar * 5;
		return real;
	}
}

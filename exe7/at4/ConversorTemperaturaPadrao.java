package at4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

	public void celsiusParaFahrenheit(int celsius) {
		double fahrenheit = (celsius * 1.8) + 32;
		System.out.println("Valor de celsius: "+celsius+" para Fahrenheit: "+fahrenheit);
	}
	
	public void fahrenheitParaCelsius(double fahrenheit) {
		double celsius = 0.55555555555 * (fahrenheit - 32);
		System.out.println("Valor de fahrenheit: "+fahrenheit+" para celsius: "+(int)celsius);
	}
}

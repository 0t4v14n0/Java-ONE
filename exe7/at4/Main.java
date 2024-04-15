package at4;

public class Main {

	public static void main(String[] args) {
		ConversorTemperatura tp = new ConversorTemperaturaPadrao();
		
		int celsius = 33;
		double fahrenheit = 150;
		
		tp.celsiusParaFahrenheit(celsius);
		tp.fahrenheitParaCelsius(fahrenheit);
	}

}

package proyecto;

import java.util.HashMap;

public class ConversorDeTemperatura extends Conversor {
	
	public static String[] unidadesDeTemperatura = 
		{"Celsius",
		"Fahrenheit",
		"Kelvin"
	};
	
	
	public static double ConvertirFahrenheitACelsius(double f) {
		return (f - 32)/1.8;
	}
	
	public static double ConvertirKelvinACelsius(double k) {
		return (k-273.15);
	}
	
	public static double ConvertirFahrenheitAKelvin(double f) {
		return ConvertirFahrenheitACelsius(f)+273.15;
	}
	
	public static double ConvertirCelsiusAKelvin(double c) {
		return c+273.15;
	}
	
	public static double ConvertirCelsiusAFahrenheit(double c) {
		return (c*1.8)+32;
	}
	
	public static double ConvertirKelvinAFahrenheit(double k) {
		return (1.8 * (k-273.15) )+32; 
	}
}

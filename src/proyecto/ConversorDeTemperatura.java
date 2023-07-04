package proyecto;

import java.util.HashMap;

public class ConversorDeTemperatura extends Conversor {
	
	public static String[] unidadesDeTemperatura = 
		{"Celsius",
		"Fahrenheit",
		"Kelvin"
	};
	
	public static HashMap<String, String> SimbolosDeUnidades = new HashMap<String, String>() {private static final long serialVersionUID = 1L;
	{
        put(unidadesDeTemperatura[0], "°C");
    	put(unidadesDeTemperatura[1], "°F");
        put(unidadesDeTemperatura[2], "K");
    }};	
	
	public static double ConversionDeTemperatura(String unidadInicial, String unidadFinal, double conversionInicial) {
		double conversionFinal=0.0;
		if(unidadInicial.equals(unidadFinal)) {
			System.out.println("No puedes convertir unidades iguales");
			return 0;
		}
		switch(unidadInicial) {
			case "Celsius":
				if(unidadFinal.equals("Fahrenheit")) {
					conversionFinal = ConvertirCelsiusAFahrenheit(conversionInicial);
				}
				else {
					conversionFinal = ConvertirCelsiusAKelvin(conversionInicial);
				}
			break;
			case "Fahrenheit":
				if(unidadFinal.equals("Celsius")) {
					conversionFinal = ConvertirFahrenheitACelsius(conversionInicial);
				}
				else {
					conversionFinal = ConvertirFahrenheitAKelvin(conversionInicial);
				}
			break;
			case "Kelvin":
				if(unidadFinal.equals("Celsius")) {
					conversionFinal = ConvertirKelvinACelsius(conversionInicial);
				}
				else {
					conversionFinal = ConvertirKelvinAFahrenheit(conversionInicial);
				}
			break;
		}
		return conversionFinal;
	}
	
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

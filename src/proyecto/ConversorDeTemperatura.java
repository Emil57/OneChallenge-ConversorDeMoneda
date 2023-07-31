package proyecto;

import java.util.HashMap;

import javax.swing.JOptionPane;

/**
 * Clase para convertir temperatura. Aqui se encuentran los metodos e interfaces para convertir temperatura
 * @author DimasEmiliano
 *
 */
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
	
    
    /**
     * Método para decodificar que tipo de conversion se llevara a cabo.
     * @param unidadInicial
     * @param unidadFinal
     * @param conversionInicial
     * @return valor de conversión
     */
	public static double ConversionDeTemperatura(String unidadInicial, String unidadFinal, double conversionInicial) {
		double conversionFinal=0.0;
		if(unidadInicial.equals(unidadFinal)) {
    		JOptionPane.showMessageDialog(null, "No puedes convertir monedas iguales.","Advertencia", JOptionPane.WARNING_MESSAGE);
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
	
	/**
	 * Convierte Fahrenheit a Celsius
	 * @param f
	 * @return valor de conversion
	 */
	public static double ConvertirFahrenheitACelsius(double f) {
		return (f - 32)/1.8;
	}
	
	/**
	 * Convierte grados Kelvin a Celsius
	 * @param k
	 * @return conversion final
	 */
	public static double ConvertirKelvinACelsius(double k) {
		return (k-273.15);
	}
	
	/**
	 * Convierte grados Fahrenheit a Kelvin
	 * @param f
	 * @return 
	 */
	public static double ConvertirFahrenheitAKelvin(double f) {
		return ConvertirFahrenheitACelsius(f)+273.15;
	}
	
	/**
	 * Convierte grados Celsius a Kelvin
	 * @param c
	 * @return
	 */
	public static double ConvertirCelsiusAKelvin(double c) {
		return c+273.15;
	}
	
	/**
	 * Convierte grados Celsius a Fahrenheit
	 * @param c
	 * @return
	 */
	public static double ConvertirCelsiusAFahrenheit(double c) {
		return (c*1.8)+32;
	}
	
	/**
	 * Convierte grados Kelvin a Fahrenheit
	 * @param k
	 * @return
	 */
	public static double ConvertirKelvinAFahrenheit(double k) {
		return (1.8 * (k-273.15) )+32; 
	}
}

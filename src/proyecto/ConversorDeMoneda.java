package proyecto;
import java.util.HashMap;

public class ConversorDeMoneda extends Conversor {	
	
	public static String[] monedas = {"MXN", 
			"USD", 
			"Euro", 
			"Libras Esterlinas", 
			"Yen Japones",
			"Won sul-coreano"
			};
	public static HashMap<String, Double> TiposDeCambioParaMXN = new HashMap<String, Double>() {{
        put(monedas[1], 17.1);
        put(monedas[2], 18.7);
        put(monedas[3], 21.7);
        put(monedas[4], 0.12);
        put(monedas[5], 0.013);
    }};
		
    public static double Convertir(String monedaInicial, String monedaFinal, double valorInicial) {
		double valorFinal = TiposDeCambioParaMXN.get(monedaInicial)/TiposDeCambioParaMXN.get(monedaInicial)*valorInicial;
		
		return Math.round(valorFinal*100.0/100.0); //redondear a dos decimales
	}

}

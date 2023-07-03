package proyecto;
import java.util.HashMap;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ConversorDeMoneda extends Conversor {	
	
	public static String[] monedas = {"MXN", 
			"USD", 
			"Euros", 
			"Libras Esterlinas", 
			"Yen Japones",
			"Won sul-coreano"
			};
	public static HashMap<String, Double> TiposDeCambioParaMXN = new HashMap<String, Double>() {{
        put(monedas[1], 17.05);
        put(monedas[2], 18.61);
        put(monedas[3], 21.7);
        put(monedas[4], 0.12);
        put(monedas[5], 0.013);
    }};
		
    public static double Convertir(String monedaInicial, String monedaFinal, double valorInicial) {
     	double valorFinal = 0;
    	if(monedaInicial.equals(monedaFinal)) {
    		JOptionPane.showMessageDialog(null, "No puedes convertir monedas iguales.","Advertencia", JOptionPane.WARNING_MESSAGE);
            return 0;
    	}
    	else if(monedaInicial.equals("MXN")) {
    		valorFinal = valorInicial/TiposDeCambioParaMXN.get(monedaFinal);
    	}
    	else if(monedaFinal.equals("MXN")) {
    		valorFinal = valorInicial*TiposDeCambioParaMXN.get(monedaInicial);
    	}
    	else {
    	     valorFinal = TiposDeCambioParaMXN.get(monedaInicial)/TiposDeCambioParaMXN.get(monedaFinal)*valorInicial;
    	}
		
    	 DecimalFormat df = new DecimalFormat("#.##");
         valorFinal = Double.parseDouble(df.format(valorFinal));
    	
		return valorFinal; //redondear a dos decimales
	}

}

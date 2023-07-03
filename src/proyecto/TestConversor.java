package proyecto;
import javax.swing.JOptionPane;

public class TestConversor {

	public static void main(String[] args) {
        double valor=0;

	    // Show a simple message dialog box
	    JOptionPane.showMessageDialog(null, "Bienvenido al Conversor de Moneda", "Conversor", JOptionPane.INFORMATION_MESSAGE);
        String selectorDeConversor = (String) JOptionPane.showInputDialog(null, "¿Que vas a convertir?", "Menu Principal", JOptionPane.WARNING_MESSAGE, null, Conversor.opciones, Conversor.opciones[0]);
        String monedaInicial = (String) JOptionPane.showInputDialog(null, "Elige la moneda que vas a convertir", "Menu", JOptionPane.WARNING_MESSAGE, null,ConversorDeMoneda.monedas, ConversorDeMoneda.monedas);
        String concatenacion = monedaInicial + " convertir a";
        String monedaFinal = (String) JOptionPane.showInputDialog(null, concatenacion, "Menu", JOptionPane.WARNING_MESSAGE, null,ConversorDeMoneda.monedas, ConversorDeMoneda.monedas[0]);
        try {
            valor = Double.valueOf(JOptionPane.showInputDialog(null, "Ingresa el valor"));

        } catch(NumberFormatException ex) {
        		ex.getMessage();
        		ex.printStackTrace();
        		JOptionPane.showMessageDialog(null, "Cuidado. Ingresa solo números.","Advertencia", JOptionPane.WARNING_MESSAGE);
        		valor = 0;
        }
        
        double resultado = ConversorDeMoneda.Convertir(monedaInicial, monedaFinal, valor);
        System.out.println(resultado);
	    JOptionPane.showMessageDialog(null, "Tienes $" + resultado, "Resultado", JOptionPane.PLAIN_MESSAGE);

	}

}

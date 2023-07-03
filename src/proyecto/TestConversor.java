package proyecto;
import javax.swing.JOptionPane;

public class TestConversor {

	public static void main(String[] args) {
	    // Show a simple message dialog box
	    JOptionPane.showMessageDialog(null, "Bienvenido al Conversor de Moneda", "Conversor", JOptionPane.INFORMATION_MESSAGE);


        String selectorDeConversor = (String) JOptionPane.showInputDialog(null, "¿Que vas a convertir?", "Menu Principal", JOptionPane.WARNING_MESSAGE, null, Conversor.opciones, Conversor.opciones[0]);
        
        // Show the input dialog with the combo box
        String monedaInicial = (String) JOptionPane.showInputDialog(null, "Selecciona la moneda que vas a convertir", "Menu", JOptionPane.WARNING_MESSAGE, null,ConversorDeMoneda.monedas, ConversorDeMoneda.monedas);
        
        String monedaFinal = (String) JOptionPane.showInputDialog(null, "Elige la moneda en que se convierte", "Menu", JOptionPane.WARNING_MESSAGE, null,ConversorDeMoneda.monedas, ConversorDeMoneda.monedas[0]);

        try {
            double valor = Double.valueOf(JOptionPane.showInputDialog(null, "Elige la moneda en que se convierte"));

        } catch(NumberFormatException ex) {
        		ex.getMessage();
        		ex.printStackTrace();
        }

        // Check the selected choice
        if (monedaInicial != null) {
            System.out.println("Selected option: " + monedaInicial);
        } else {
            System.out.println("No option selected");
        }
	}


}

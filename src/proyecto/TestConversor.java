package proyecto;
import javax.swing.JOptionPane;

public class TestConversor {

	public static void main(String[] args) {
	    // Show a simple message dialog box
	    JOptionPane.showMessageDialog(null, "Bienvenido al Conversor de Moneda", "Conversor", JOptionPane.INFORMATION_MESSAGE);
	    
	    String[] monedas = {"MXN", 
		    					"Dolar USD", 
		    					"Euro", 
		    					"Libras Esterlinas", 
		    					"Yen Japones",
		    					"Won sul-coreano"
	    						};

	    String[] opciones = {"Moneda",
    							"Temperatura"	    		
	    						};
        String selectorDeConversor = (String) JOptionPane.showInputDialog(null, "¿Que vas a convertir?", "Menu Principal", JOptionPane.WARNING_MESSAGE, null, opciones, opciones[0]);

	    
        // Show the input dialog with the combo box
        String monedaInicial = (String) JOptionPane.showInputDialog(null, "Selecciona la moneda que vas a convertir", "Menu", JOptionPane.WARNING_MESSAGE, null, monedas, monedas[0]);

        
        String monedaFinal = (String) JOptionPane.showInputDialog(null, "Elige la moneda en que se convierte", "Menu", JOptionPane.WARNING_MESSAGE, null, monedas, monedas[0]);

        double valor = Double.valueOf(JOptionPane.showInputDialog(null, "Elige la moneda en que se convierte"));

        
        
        // Check the selected choice
        if (monedaInicial != null) {
            System.out.println("Selected option: " + monedaInicial);
        } else {
            System.out.println("No option selected");
        }
	}


}

package proyecto;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class TestConversor {

	public static void main(String[] args) {
		Conversor conversor = new Conversor();
		String concatenacion = " ";
		DecimalFormat df = new DecimalFormat("#.##");

        boolean check = true;
        do {
        	// Show a simple message dialog box
    	    JOptionPane.showMessageDialog(null, "Bienvenido al Conversor de Moneda", "Conversor", JOptionPane.INFORMATION_MESSAGE);
            String tipoDeConversor = (String) JOptionPane.showInputDialog(null, "¿Que tipo de conversion deseas hacer?", "Menu Principal", JOptionPane.PLAIN_MESSAGE, null, Conversor.opciones, Conversor.opciones[0]);
            
            switch(tipoDeConversor) {
            	case "Moneda":
            		 conversor.unidadInicial = (String) JOptionPane.showInputDialog(null, "Elige la moneda que vas a convertir", "Menu de tipo cambio", JOptionPane.PLAIN_MESSAGE, null,ConversorDeMoneda.monedas, ConversorDeMoneda.monedas);
                     concatenacion = conversor.unidadInicial + " convertir a";
                     conversor.unidadFinal = (String) JOptionPane.showInputDialog(null, concatenacion, "Menu", JOptionPane.PLAIN_MESSAGE, null,ConversorDeMoneda.monedas, ConversorDeMoneda.monedas[0]);
                     
                     try {
                         conversor.valorParaConvertir = Double.valueOf(JOptionPane.showInputDialog(null, "Ingresa el valor"));
                     } catch(NumberFormatException ex) {
                     		ex.getMessage();
                     		ex.printStackTrace();
                     		JOptionPane.showMessageDialog(null, "Cuidado. Ingresa solo números.","Advertencia", JOptionPane.WARNING_MESSAGE);
                     		conversor.valorParaConvertir = 0;
                     }
                     if(conversor.valorParaConvertir!=0) {
                    	conversor.valorConvertido = ConversorDeMoneda.Convertir(conversor.unidadInicial, conversor.unidadFinal, conversor.valorParaConvertir);                         
                        conversor.valorConvertido = Double.parseDouble(df.format(conversor.valorConvertido));
                    	concatenacion = ConversorDeMoneda.SimbolosMonetarios.get(conversor.unidadInicial) 
                 	    		+ conversor.valorParaConvertir 
                 	    		+ " --> " 
                 	    		+ ConversorDeMoneda.SimbolosMonetarios.get(conversor.unidadFinal) 
                 	    		+ conversor.valorConvertido;
                     }  
        		break;
            	
            	case "Temperatura":
            		conversor.unidadInicial = (String) JOptionPane.showInputDialog(null, "¿Que vas a convertir?", "Menu temperatura", JOptionPane.PLAIN_MESSAGE, null,ConversorDeTemperatura.unidadesDeTemperatura, ConversorDeTemperatura.unidadesDeTemperatura[0]);
	                concatenacion = conversor.unidadInicial + " convertir a";
	                conversor.unidadFinal = (String) JOptionPane.showInputDialog(null, concatenacion, "Menu temperatura", JOptionPane.PLAIN_MESSAGE, null,ConversorDeTemperatura.unidadesDeTemperatura, ConversorDeTemperatura.unidadesDeTemperatura[0]);
	                
	                try {
                        conversor.valorParaConvertir = Double.valueOf(JOptionPane.showInputDialog(null, "Ingresa el valor"));
                    } catch(NumberFormatException ex) {
                    		ex.getMessage();
                    		ex.printStackTrace();
                    		JOptionPane.showMessageDialog(null, "Cuidado. Ingresa solo números.","Advertencia", JOptionPane.WARNING_MESSAGE);
                    		conversor.valorParaConvertir = 0;
                    }
	                
	                if(conversor.valorParaConvertir!=0) {
		                conversor.valorConvertido = ConversorDeTemperatura.ConversionDeTemperatura(conversor.unidadInicial, conversor.unidadFinal, conversor.valorParaConvertir);
		                conversor.valorConvertido = Double.parseDouble(df.format(conversor.valorConvertido));
		                concatenacion = conversor.valorParaConvertir 
                	    		+ " "
                	    		+ ConversorDeTemperatura.SimbolosDeUnidades.get(conversor.unidadInicial)  
                	    		+ " --> " 
                	    		+ conversor.valorConvertido 
                	    		+ " "
                 	    		+ ConversorDeTemperatura.SimbolosDeUnidades.get(conversor.unidadFinal);
                    }
        		break;
            }
            
            JOptionPane.showMessageDialog(null, concatenacion, "Resultado", JOptionPane.PLAIN_MESSAGE); 
    	    int ciclo = JOptionPane.showConfirmDialog(null, "¿Deseas hacer otra conversion?", "Conversor de Moneda",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (ciclo == JOptionPane.NO_OPTION) {
            	break;
            }
            
        }while(check);
	    
	}
		
}

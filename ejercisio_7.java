
package programas_basic;

import javax.swing.JOptionPane;

public class ejercisio_7 {
    public static void main(String[] args) {
        
        String radio_text = JOptionPane.showInputDialog("Ingrese el radio de la esfera:");

        // Convertir el radio de String a double
        double radio = Double.parseDouble(radio_text);

        // Calcular el volumen de la esfera
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        // Mostrar el volumen de la esfera utilizando JOptionPane
        JOptionPane.showMessageDialog(null,
                "El volumen de la esfera es: " + Math.round(volumen* 1000.0) / 1000.0);
    }
}

        
        
        
        

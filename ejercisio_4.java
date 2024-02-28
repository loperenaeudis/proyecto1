
package programas_basic;

import javax.swing.JOptionPane;

public class ejercisio_4 {
    public static void main(String[] args) {
    double pi = Math.PI; 
    // Pedir al usuario que introduzca un número
    String rad = JOptionPane.showInputDialog("Por favor,\n ingrese el radio:");
    // Convertir el número ingresado de String a double
    double data_1 = Double.parseDouble(rad);
    
    double L_circunf = 2*(pi)*(data_1);
    double A_circunf = pi * Math.pow(data_1, 2);
    
    // Mostrar los resultados
        String mensaje = 
                "Longitud de la circunferencia:   " + Math.round(L_circunf* 1000.0) / 1000.0+ 
              "\nÁrea de la circunferencia:     " + Math.round(A_circunf* 1000.0) / 1000.0;
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}

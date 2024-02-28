
package programas_basic;

import javax.swing.JOptionPane;
public class ejercisio_3 {
    public static void main(String[] args) {
    String data_1 = JOptionPane.showInputDialog("Ingrese \n la cantidad en grado centigrado :");
    // Convertir el número ingresado de String a int
    int cent = Integer.parseInt(data_1); 
    
    double fahren=32+(9.0*(cent/5.0));
    //double fahren = (9.0/5.0) * cent + 32; // Corrección de la fórmula
    
    String mensaje = "grados centigrados : " + cent +"°C: "+ "\ngrados fahrenheint: " +fahren+" °F";

    // Mostrar el mensaje utilizando JOptionPane
    JOptionPane.showMessageDialog(null, mensaje);
    }
    
}

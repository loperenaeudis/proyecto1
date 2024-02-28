
package programas_basic;

import javax.swing.JOptionPane;
public class ejercisio_1 {
    public static void main(String[] args) {
    // Pedir al usuario que introduzca su nombre
    String nombre = JOptionPane.showInputDialog("Por favor, introduce tu nombre:");
    // Crear el mensaje de saludo
    String mensaje = "Buenos días, " + nombre + "!";
    // Mostrar el mensaje utilizando JOptionPane
    JOptionPane.showMessageDialog(null, mensaje);

    }       
}






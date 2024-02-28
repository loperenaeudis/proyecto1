package programas_basic;

import javax.swing.JOptionPane;

public class ejercisio_2 {
    public static void main(String[] args) {
    // Pedir al usuario que introduzca un número
    String num = JOptionPane.showInputDialog("Por favor, ingrese un número:");

    // Convertir el número ingresado de String a int
    int data_1 = Integer.parseInt(num);

    // Calcular el doble y el triple del número ingresado
    int doble = data_1 * 2;
    int triple = data_1 * 3;
    // Crear el mensaje con el número ingresado, su doble y su triple
    String mensaje = "Número ingresado: " + data_1 + "\nDoble: " + doble + "\nTriple: " + triple;

    // Mostrar el mensaje utilizando JOptionPane
    JOptionPane.showMessageDialog(null, mensaje);
    }
}

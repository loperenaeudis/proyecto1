/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas_basic;
import javax.swing.JOptionPane;
public class ejercisio_8 {
    public static void main(String[] args) {

        // Pedir al usuario que ingrese el valor del artículo
        String valorArticuloStr = JOptionPane.showInputDialog("Ingrese el valor del artículo:");

        // Convertir el valor del artículo de String a double
        double val_art = Double.parseDouble(valorArticuloStr);

        // Calcular el IVA del 16%
        double iva = val_art * 0.16;

        // Mostrar el valor del artículo y el valor del IVA utilizando JOptionPane
        String mensaje = "Valor del artículo: $" + val_art
                + "\nValor del IVA (16%): $" + iva 
                ;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

        
  


package programas_basic;

import javax.swing.JOptionPane;
public class ejercisio_5 {
    public static void main(String[] args) {
    int data_1;
    double mt_sg;

    String recorrido = JOptionPane.showInputDialog(" ingrese los km/h :");
    data_1 = Integer.parseInt(recorrido);
    
/*para convertir una velocidad de km/h a m/s, simplemente multiplica la velocidad en km/h por 
(KM/H)*1000/3600 que es equivalente a(KM/H)*5/18
*/  
    mt_sg=data_1*(5.0/18.0);

    String mensaje = "De km/h: " + data_1 +
                    "\n" + mt_sg+ " A m/s : ";
    // Mostrar el mensaje utilizando JOptionPane
    JOptionPane.showMessageDialog(null, mensaje);
    
    
    }
    
}

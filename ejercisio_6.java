
package programas_basic;

import javax.swing.JOptionPane;

public class ejercisio_6 {
    public static void main(String[] args) {

   String cats = JOptionPane.showInputDialog("Ingrese la longitud del primer cateto:"); 
   double cat_1 = Double.parseDouble(cats);
   
   String cateto2Str = JOptionPane.showInputDialog("Ingrese la longitud del segundo cateto:");
   double cat_2 = Double.parseDouble(cateto2Str);

   double hipot = Math.sqrt(cat_1 * 2 +cat_2 *2);

   // Mostrar la longitud de la hipot utilizando JOptionPane
   JOptionPane.showMessageDialog(null, "La longitud de la hipotenusa es\n " +Math.round(hipot* 1000.0) / 1000.0);    
        
        
        
        
        
    }
    
}

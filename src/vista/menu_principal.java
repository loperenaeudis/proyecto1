/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modulo.barco_buque;

/**
 *
 * @author ESTUDIANTES
 */
public class menu_principal {
    public static void main(String[] args) {
        barco_buque barco_1 = new barco_buque(7000, 8000);
        System.out.println(barco_1.cargar_contenedor(100, 200, 300));
        System.out.println(barco_1.cargar_contenedor(100, 300, 600));
        System.out.println(barco_1.cargar_contenedor(200, 400, 500));
        System.out.println(barco_1.area_Disponible());
        System.out.println(barco_1.peso_Permitido());
        System.out.println(barco_1.valor_carga());
        System.out.println(barco_1.contenedores_cargados());
        
    }
    
}

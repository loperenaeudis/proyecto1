
package modulo;

import java.time.LocalDate;


public class barco_buque {

    private double area;
    private String estado="arribado";
    private double limite_peso;
    private LocalDate fecha_arribo;
    private LocalDate fecha_zarpado;
    private double Valor_contenedor;
    private int cantidad;

    public barco_buque(double area, double limite_peso) {
        this.area = area;
        this.limite_peso = limite_peso;
    }

        
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getLimite_peso() {
        return limite_peso;
    }

    public void setLimite_peso(double limite_peso) {
        this.limite_peso = limite_peso;
    }

    public LocalDate getFecha_arribo() {
        return fecha_arribo;
    }

    public void setFecha_arribo(LocalDate fecha_arribo) {
        this.fecha_arribo = fecha_arribo;
    }

    public LocalDate getFecha_zarpado() {
        return fecha_zarpado;
    }

    public void setFecha_zarpado(LocalDate fecha_zarpado) {
        this.fecha_zarpado = fecha_zarpado;
    }

    public double getValor_contenedor() {
        return Valor_contenedor;
    }

    public void setValor_contenedor(double Valor_contenedor) {
        this.Valor_contenedor = Valor_contenedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    //               metodos                   //
    
    public String cargar_contenedor(double area, double limite_peso, double Valor_contenedor) {  
        String resultado = " ";
        if (this.estado.equalsIgnoreCase("arribado")){
            if (area>this.area){
                resultado=" SE SUPERO EL ARREA DEL BUQUE";
                
            }else{
                if (limite_peso>this.limite_peso){
                    resultado="se supero el limite de carga";
                }else{
                    this.area -= area;
                    this.limite_peso -= limite_peso;
                    this.Valor_contenedor += Valor_contenedor;
                    this.cantidad ++ ;
                    resultado = "el contenedor se ha cargado :___EXITOSAMENTE ___ ";
    
                }
                
            }
        }else{
            resultado= "esta navegando el buque";
        }
        return resultado;
     }
    
    public String area_Disponible(){
        return "el area disponible es de :"+this.area;
    }
    public String peso_Permitido(){
        return "el peso disponible es de :"+this.limite_peso;
    }
    public String valor_carga(){
        return  "el valor de la carga es de :"+this.Valor_contenedor;
    }
      public String contenedores_cargados (){
        return  "la cantidad de contenedores  es de :"+this.cantidad;
    }    
            
                
    
        
        
    }
     
    


   

 
            
    


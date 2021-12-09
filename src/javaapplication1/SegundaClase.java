
package javaapplication1;


public class SegundaClase {
    
    SegundaClase(int codigo_producto,int codigo_cliente,String nombre_cliente,float calificacion_cliente){
        this.codigo_producto = codigo_producto;
        this.codigo_cliente = codigo_cliente;
        this.nombre_cliente = nombre_cliente;
        this.calificacion_cliente = calificacion_cliente;
        //this para diferenciar entre parámetro y atributos puesto que tienen exactamente el mismo nombre.
    }
    SegundaClase(){
        
    }
    int codigo_producto;
    int codigo_cliente;
    String nombre_cliente;
    float calificacion_cliente;
    final int variable_numerica = 250;
    
    public static int variablenumerica(int num){
            int operacion=num*250;
        return operacion;
    }
    
}

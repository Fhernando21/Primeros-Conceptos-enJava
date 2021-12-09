
package javaapplication1;


public class MiPrimeraClase {
    
    //Contructor.
    
    /*MiPrimeraClase(String nombrecliente,float calificacioncliente,int codigocliente){
        
     this.nombrecliente = nombrecliente; 
     this.calificacioncliente = calificacioncliente;
     this.codigocliente = codigocliente;
    }*/
    
    
    
    int extensiontguate = 108000;
    String capital = "Ciudad de Guatemala";
    String moneda = "Quetzal Guatemalteco";     //Propiedades o también variables.
    final float cambiodolar = 7.70f;
    String continente = "América";
    private String idioma;
  
    public String getIdioma(){
        return idioma;
    }
    public void setIdioma(String i){
        idioma=i;
    }
   
    void numdep(int n){
    
        switch(n){
            case 1 -> System.out.println("Guatemala");
            case 2 -> System.out.println("Sacatepequez");               //Métodos o funciones.
            case 3 -> System.out.println("Petén");
            case 4 -> System.out.println("Escuintla");
            default -> System.out.println("El número no existe.");               
       }
    
    }    
}        
        
        
        
        
    
    


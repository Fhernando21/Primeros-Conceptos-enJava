
package javaapplication1;

public class TercerClase {
    private String libro;
    private String autor;
    final String pais = "Francia";
    private int año;
    
    TercerClase(String li,String au,int year){
        libro = li;
        autor = au;       
        año = year;
        
        
    }
    /*public  void setLibro(String li){
        this.libro=li;
    }*/
    public String getLibro(){
    
        return libro;
    }
    public String getAutor(){
        return autor;
    }
    public String getPais(){
        return pais;
    }
    public int getAño(){
        return año;
    }    
        
       
        
    
    
    
    
}

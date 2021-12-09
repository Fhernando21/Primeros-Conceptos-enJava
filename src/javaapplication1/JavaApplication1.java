
package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido");
        System.out.println("Ingrese el nombre de su mascota:");
        Scanner Nombremascota = new Scanner(System.in);
        int codmascota=Nombremascota.nextInt();
        
        switch(codmascota){
          case 101 -> System.out.println("Su mascota aún no esta lista.");               
               
          case 102 -> System.out.println("Su mascota está lista.");    
               
          default -> System.out.println("El código ingresado es inválido.");               
        }
        /*short a = 200;
        if (a>10 && a<100){
            System.out.println("El número está dentro del rango.");
            
        }else{
            System.out.println("El número no está dentro del rango.");
        }
        */
               
       String color = "rojo";
       String numero = switch(color){
           case "verde","rojo","azul" -> "uno";
           case "violeta","amarillo","gris"-> "dos";
           default -> "tres";
       };
       System.out.println(numero);
       
       /*int varible1 = 2;
       
       while (varible1<=11){
           System.out.println("hola");
           varible1+=2;
       }
       for (int varible2=5; varible2<10; varible2++){
           
           if (varible2==7){
               continue;
               
           }
           System.out.println(varible2);
       }
        
       
       float a = 1.5f;
       do {
           System.out.println(a);
           a+=3;
           
       }while (a<=10);
       */
       //String palabra = "fhernando";
       System.out.println("fhernando".length());//Otra manera de encontrar la longitud de un string.
       int[] Primermatriz = new int[6];
               Primermatriz[0] = 10; //Índice 0
               Primermatriz[1] = 20; //Índice 1
               Primermatriz[2] = 30;
               Primermatriz[3] = 40;
               Primermatriz[4] = 50;
               Primermatriz[5] = 60;
        System.out.println(Primermatriz[2]);
        System.out.println(Primermatriz.length);
        
        int[] Segundamatriz = {5,10,48,50,97,11,22};//Esto es una matriz literal.
        System.out.println(Segundamatriz[4]);
        int mutiplicacion = Primermatriz.length*Segundamatriz.length;//Valor 42.
        
        /*if (!(mutiplicacion>=40)){//Se invierte el resultado.
            System.out.println("Primera opción");   
        }else{
            System.out.println("Segunda opción");
        }
        */
        
        for (int matrizen_bucle = 5; matrizen_bucle<mutiplicacion;matrizen_bucle+=5){
            if (matrizen_bucle==25){
                continue;//Se salta el valor 25.
            
            }               
            System.out.println(matrizen_bucle);
        }
        /*
        El tipo de dato de la variable "iteracionporvalordematriz" es compatible con
        el tipo de dato de la matriz "Segundamatriz".
        */              
        for (int iteracionporvalordematriz: Segundamatriz){//: puede entenderse como "dentro".
                System.out.println(iteracionporvalordematriz);
        
        }
        Object[] prueba = new Object [4];
            prueba[0] = 1245;
            prueba[1] = "josé";     //Object permite una matriz con diferentes tipos.
            prueba[2] = 124.25f;
            prueba[3] = false;
            
        System.out.println(prueba[2]);
                    
        String[][] matrizbidemensional = {{"Bogotá","Santiago","Caracas"},
                                           {"Ottawa","Ciudad de México","San José"},//3x3
                                           {"Washington","Managua","Sao Paulo"}};
             
        System.out.println(matrizbidemensional[0][1]);
        
        MiPrimeraClase ejemplo = new MiPrimeraClase();//Se crea una instacia/objeto de la clase.
        String ejemplosssss = ejemplo.moneda;
        System.out.println(ejemplosssss);
        
        int territorio = ejemplo.extensiontguate;
        if(territorio<200000){
            System.out.println("Es un país pequeño.");                
        }else{
            System.out.println("Es un país grande.");
        }
        System.out.println("Yo vivo en el departamento de:");  
        
        //MiPrimeraClase milocacion = new MiPrimeraClase();
        ejemplo.numdep(2);
        
        ejemplo.setIdioma("Español");
        System.out.println(ejemplo.getIdioma());
                
        //Uso de la SegunadaClase.
        
        SegundaClase segclase = new SegundaClase(1001,15121,"Javier Robles",8.50f);
        System.out.println(segclase.nombre_cliente);
        //int contante = segclase.variable_numerica;
        int valor2 = 2;
        int resultado= valor2 * segclase.variable_numerica;
        System.out.println(resultado);
        if (segclase.calificacion_cliente>5.0f){
            System.out.println("El cliente"+segclase.nombre_cliente+" es de bajo riesgo.");
        
        }else{
            System.out.println("El cliente"+segclase.nombre_cliente+" es de alto riesgo.");
        }   
        
        System.out.println(SegundaClase.variablenumerica(250));
        TercerClase descripcion = new TercerClase("J. B. Fellens y L. P. Dufour", "Los Tres Mosqueteros.",1844);
        
        System.out.println(descripcion.getAutor()+descripcion.getAño());
        
        System.out.println(descripcion.getLibro());
        
        int acount = 100000;
        
        for (int mes = 1; mes<4; mes++){
            acount = acount - ((acount*10)/100);
            //System.out.println(acount); 
            
        }
        System.out.println(acount);      
        System.out.println("A partir de aquí, trabajando con Git.");      
        System.out.println("Eliminar esta línea.");
            
                
                
    }          
    
    
}


package busquedalineal;

import java.util.Scanner;


public class BusquedaLineal {

    public static void main(String[] args) {
        
       Scanner valor=new Scanner(System.in);
       int [] numeros={100,200,300,400,500,600,700,800,900,1000};
       int NumeroBuscado=1000;
       int lugar=0;
       int resultado=0;
       
       System.out.println("ingresa el numero que quieres buscar");
       NumeroBuscado= valor.nextInt();
       while(lugar <numeros.length){
           if(numeros[lugar]== NumeroBuscado)
           {
               resultado=lugar;
               break;
           }else{
               lugar++;
           }
       }
       if(resultado==(numeros.length+1)){
           System.out.println("El numero "+NumeroBuscado+"No fue encontrado en \npocision ["+resultado+"]") ;
       }else{
           System.out.println("El numero "+NumeroBuscado+" fue encontrado en \npocision ["+resultado+"]") ;
       }
       
    }
    
}

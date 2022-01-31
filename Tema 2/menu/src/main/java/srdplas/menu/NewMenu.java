package srdplas.menu;
import java.util.Scanner;
/**
 *
 * @author srdpl
 */
public class Menu {
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
        
       while(!salir){
            
           System.out.println("1. Opcion 1");
           System.out.println("2. Opcion 2");
           System.out.println("3. Opcion 3");
           System.out.println("4. Salir");
            
           System.out.println("Elige una opcion");
           opcion = sn.nextInt();
           
           if (opcion==opcion) 
           {
               System.out.println("Hola Javi vuelve a elegir una opcion");    
           }
       }    
       }
}

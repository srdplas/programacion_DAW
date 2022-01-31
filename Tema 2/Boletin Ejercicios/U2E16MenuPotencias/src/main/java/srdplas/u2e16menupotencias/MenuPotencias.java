
package srdplas.u2e16menupotencias;
import java.util.Scanner;
/**
 *
 * @author srdplas
 */
public class MenuPotencias {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        double numero;
        int opcion;
        System.out.println("MENU DE POTENCIAS");
        System.out.println("1. Calcular el cuadrado");
        System.out.println("2. Calcular el cubo");
        System.out.println("3. Calcular la raiz cuadrada");
       
        System.out.println("");
        System.out.println("Dime un numero real");
        numero=sn.nextDouble();
        System.out.println("Escoge una opcion.");
        opcion=sn.nextInt();
        if(opcion<=3){
            switch(opcion){
            
            case 1: System.out.println(Math.pow(numero, 2));
            break;
            case 2: System.out.println(Math.pow(numero, 3));
            break;
            case 3: System.out.println(Math.pow(numero, 1/2));
            break;
               
        }
        
        }else System.out.println("Opcion Incorrecta");
       
        }   
        
        
    }
    
    
    


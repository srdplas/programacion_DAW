
package es.iessoterhernandez.daw.endes.u2e2extrabucles;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author srdplas
 */
public class PruebaAdivinaNumero {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sn = new Scanner(System.in);
        int intento;
        boolean acierto = false;
        int adivina = (int)(rnd.nextDouble()*100+1);
        
        
        
        while(!acierto){
        System.out.println("Dime un numero");
        intento=sn.nextInt();
            
        if(adivina==intento){
            System.out.println("Acertaste!!");
            acierto =true;
        }
        if(adivina>intento){
           System.out.println("El numero a adivinar es mayor que "+intento);
        }
        if(adivina<intento){
            System.out.println("El numero a adivinar es menor que "+intento);
        }
        
        }
    }
}

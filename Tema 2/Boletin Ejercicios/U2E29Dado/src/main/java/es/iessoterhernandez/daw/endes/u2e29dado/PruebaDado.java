
package es.iessoterhernandez.daw.endes.u2e29dado;
import java.util.Scanner;
/**
 *
 * @author srdplas
 */
public class PruebaDado {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Dado d = new Dado();
        int numTirada=0;
        System.out.println("¿Que número te gustaría que saliese en el dado?");
        int tiradas = sn.nextInt();
     
        
        while(tiradas<1||tiradas>6){
            System.out.println("Introduce un numero entre el 1 y el 6");
            tiradas=sn.nextInt();
            
        }
        int contador=0;
        do{
            numTirada=d.tirada();
            System.out.println("Ha salido en el dado el "+numTirada);
            contador++;
            
        }while(tiradas!=numTirada);
        System.out.println("EL dado ha acerdado en el numero "+contador);
        
        
        
    }
}

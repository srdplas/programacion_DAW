
package srdplas.u2e30dadotriple6;
import java.util.Scanner;
/**
 *
 * @author srdplas
 */
public class PruebaDado {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Dado d = new Dado();
        int numTirada;
        System.out.println("¿Que número te gustaría que saliese en el dado?");
       
     
        
       
        int contador=0;
        while(contador<3){
            numTirada=d.tirada();
            System.out.println("Ha salido en el dado el "+numTirada);
            if(numTirada==6){
            contador++;
            }
        }
        System.out.println("EL dado ha saido el 6 tres veces");
        
        
        
    }
}

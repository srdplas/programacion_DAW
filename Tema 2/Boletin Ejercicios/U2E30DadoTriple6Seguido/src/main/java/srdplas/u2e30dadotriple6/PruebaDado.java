
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
       
       
     
        
       
        int contador=0;
        while(contador<3){
            numTirada=d.tirada();
            System.out.println("Ha salido en el dado el "+numTirada);
            if(numTirada!=6){
                contador=0;
            }else contador++;
        }
        System.out.println("Ha salido el 6 "+ contador+ " veces Seguidas");
        
        
        
    }
}

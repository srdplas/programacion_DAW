
package srdplas.u2e31candado;
import java.util.Scanner;
/**
 *
 * @author srdpl
 */
public class RevientaCandado {
    public static void main(String[] args) {
        CandadoNumerico cn = new CandadoNumerico();
        Scanner sn = new Scanner(System.in);
        int abierto =0;
        int pin;
        
        System.out.println("Introduce tu numero Secreto entre el 0 y el 9999");
        pin=sn.nextInt();
        cn.setNumSecreto(pin);
        
            
        while(!(pin>=0&&pin<=9999)){
            System.out.println("Introduce un numero valido");
            pin=sn.nextInt();
            cn.setNumSecreto(pin);
        }
        
        do{
            cn.intentaAbrir(abierto);
            
            abierto++;
            if(cn.intentaAbrir(abierto)==false){
                System.out.println("Probando PIN: "+abierto+" no se abre");
            }else System.out.println("Probando PIN: "+abierto+" Se abrió");
        }while(cn.intentaAbrir(abierto)==false);
       
        //Introduciendo manualmente la clave
        
       
        
        cn.setNumSecreto((int)(Math.random()*9999+1));  
        abierto=0;
        
        do{
            cn.intentaAbrir(abierto);
            
            abierto++;
            if(cn.intentaAbrir(abierto)==false){
                System.out.println("Probando PIN: "+abierto+" no se abre");
            }else System.out.println("Probando PIN: "+abierto+" Se abrió");
        }while(cn.intentaAbrir(abierto)==false);
        
    }
}

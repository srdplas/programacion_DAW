
package srdplas.u2e28paresdescendientes;
import java.util.Scanner;
/**
 *
 * @author srdpl
 */
public class PruebaParesDescendientes {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Dime un numero entre el 0 y el 100");
        int numero;
        boolean bucle=true;
        while(bucle){
        
        numero=sn.nextInt();
        if(numero>=0&&numero<=100){
            for(numero>=0; numero--){
                    numero--;
                    if(numero%2==0){
                        System.out.println(numero);
                    }
                    
            }
        }else System.out.println("Numero Incorrecto vuelva a introducirlo");
        }
    }
}

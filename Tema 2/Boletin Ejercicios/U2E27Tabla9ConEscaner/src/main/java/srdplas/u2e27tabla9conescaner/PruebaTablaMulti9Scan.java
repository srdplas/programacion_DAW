package srdplas.u2e27tabla9conescaner;
import java.util.Scanner;
/**
 *
 * @author srdpl
 */
public class PruebaTablaMulti9Scan {
    public static void main(String[] args) {
         Scanner sn = new Scanner(System.in);
        int contador=0;
        int tabla;
        System.out.println("Indique la tabla que desea imprimir");
        tabla=sn.nextInt();
        
        while(contador<=10){
            int resultado=contador*tabla;
            System.out.println(contador+" x "+ tabla +" = "+ resultado);
            contador++;
        }
    }
}

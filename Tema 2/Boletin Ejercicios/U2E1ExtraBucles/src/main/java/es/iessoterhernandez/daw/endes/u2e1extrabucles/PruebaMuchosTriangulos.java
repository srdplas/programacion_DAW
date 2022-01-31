
package es.iessoterhernandez.daw.endes.u2e1extrabucles;

import java.util.Scanner;

/**
 *
 * @author srdplas
 */
public class PruebaMuchosTriangulos {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        System.out.println("¿Cuantos triangulos quieres Imprimir?");
        int cantidad=sn.nextInt();
        
        System.out.println("¿Cual es el tamaño del triangulo?");
        int tamanio=sn.nextInt();
        
        for(int numTriangulo=0; numTriangulo<=cantidad; numTriangulo++){
            for(int dimension=0; dimension<=tamanio; dimension++){
                for(int i=1; i<=dimension;i++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}


package es.iessoterhernandez.daw.endes.u2e39busqueda;

import java.util.Scanner;

/**
 *
 * @author srdplas
 */
public class PruebBusqueda {
    public static void main(String[] args) {
    int array[] = new int[2000];
    int num_find;
    int x=-1;
    Scanner sn = new Scanner(System.in);
    
    for(int i=0; i<array.length; i++){
        int numero = (int)(Math.random()*1001);
        array[i] = numero;
        
    } // Bucle para introduccir los valores en posiciones del array
    
        System.out.println("¿Que numero te interesa buscar?");
        num_find=sn.nextInt();
        
    for(int i=0; i<array.length; i++){
        int y =array[i];
        if(y==num_find){
            x=i;
            System.out.println("Numero encontrado en la posicion "+i);
            break;
        }
    }if(x==-1){
                System.out.println("Numero no encontrado");
            }  
       
    }
}
    


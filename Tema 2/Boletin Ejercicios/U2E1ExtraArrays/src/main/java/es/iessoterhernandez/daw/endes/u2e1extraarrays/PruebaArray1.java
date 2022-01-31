
package es.iessoterhernandez.daw.endes.u2e1extraarrays;

/**
 *
 * @author srdplas
 */
public class PruebaArray1 {
    public static void main(String[] args) {
        int arrayEnteros[] = new int[100];
        int Array[] = new int[100];
        int suma = 0;
        for(int i=0; i<arrayEnteros.length; i++){
            arrayEnteros[i]=(int)(Math.random()*-1000-1);
        }
        for(int i=0; i<arrayEnteros.length; i++){
            System.out.println(arrayEnteros[i]);
            suma += arrayEnteros[i]; 
        }
        System.out.println("La suma de todos los elementos del array es "+suma);
    }
}

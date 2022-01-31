
package es.iessoterhernandez.daw.endes.u2e3extraarrays;

import java.util.Scanner;

/**
 *
 * @author srdplas
 */
public class PruebaArray {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int notaBaja=100;
        int matriculados=0;
        int pos=-1;
        int pos2=-1;
        int notaAlta=0;
        double media=0;
        
        
        System.out.println("Cuantos alumnos/as hay matriculados en una clase?");
        matriculados=sn.nextInt();
        System.out.println("-----------------");
        
        int alumnos[]= new int[matriculados];
        
        for(int i=0; i<alumnos.length;i++){
            alumnos[i]=(int)(Math.random()*101);
            media+=alumnos[i];
            System.out.println("["+i+"]"+alumnos[i]);
        } // Asignamos las notas aleatorias del 0-100 y vemos la posicion del array con su valor
         
        for(int i=0; i<alumnos.length; i++){ 
            if(alumnos[i]<notaBaja){
                notaBaja=alumnos[i];
                pos2=i;
            }
        }//Vemos el contenido del array, notaBaja se iguala si es menor a esta y pos a la posicion de esta

        for(int i=0; i<alumnos.length; i++){ 
            if(alumnos[i]>notaAlta){
                notaAlta=alumnos[i];
                pos=i;
            }
        } //Vemos el contenido del array, notaAlta se iguala si es mayor a esta y pos a la posicion de esta
            double mediaAritmetica=media/matriculados;
            System.out.println("La nota mas baja es "+notaBaja+" y está en la posicion "+pos2+" del array");
            System.out.println("La nota mas Alta es "+notaAlta+" y está en la posicion "+pos+" del array");
            System.out.printf("%-12s%1.2f", "La nota media de la clase es ", mediaAritmetica);
        
    }
}

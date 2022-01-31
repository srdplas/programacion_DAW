
package es.iessoterhernandez.daw.endes.u2e2extraarray;

import java.util.Scanner;

/**
 *
 * @author srdplas
 */
public class PruebaNotas {
    public static void main(String[] args) {
        int matriculados =10;
        int notas[] = new int[matriculados];
        double media =0;
        
        
        
        Scanner sn = new Scanner(System.in);
        for(int i=0; i<notas.length; i++){
            System.out.println("Introduce las notas del alumno");
            notas[i]=sn.nextInt();
            media+=notas[i];
        }
        double mediaAritmetica= media/matriculados;
        System.out.println("La media aritmetica de todas las notas es: "+mediaAritmetica);
    }
}

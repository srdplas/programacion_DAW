
package srdplas.u2.e0.persona;
import java.util.Scanner;
/**
 *
 * @author srdpl
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el nombre");
        p1.setNombre(sc.nextLine());
        System.out.println("Introduce edad");
        p1.setEdad(sc.nextInt());
        System.out.println("Estimado ");
        if (p1.getEdad()>=18) 
        {
            System.out.println("Don");
        }
        System.out.println(p1.getNombre());
    }
}

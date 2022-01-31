
package srdplas.u2.e4.persona;
import java.util.Scanner;
/**
 *
 * @author srdpl
 */
public class PruebaPersonaCondicional {
    public static void main(String[] args) {
        PersonaCondicional p1 = new PersonaCondicional();
        Scanner sc = new Scanner(System.in);
        int edad, altura;
        boolean casado;
        p1.setEdad(20);
        p1.setAltura(165);
        p1.setEstaCasado(false);
        //Propiedades
        edad=p1.getEdad();
        altura=p1.getAltura();
        casado=p1.isEstaCasado();
        
        
        System.out.println("Dime tu edad");
        p1.setEdad(sc.nextInt());
        System.out.println("Dime tu altura");
        p1.setAltura(sc.nextInt());
        System.out.println("Dime estas casado?");
        p1.setEstaCasado(sc.nextBoolean());
        
        if (p1.getEdad()>=18) 
        {
            System.out.println("Ya eres un señor/a");
        }
        if (p1.getAltura()>=185) 
        {
            System.out.println("Eres alto");
        }
        if (p1.isEstaCasado()==false) 
        {
            System.out.println("No está casado");
        }
        
       
    }
}

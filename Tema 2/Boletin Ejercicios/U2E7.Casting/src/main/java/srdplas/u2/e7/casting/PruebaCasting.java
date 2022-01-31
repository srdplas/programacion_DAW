package srdplas.u2.e7.casting;
import java.util.Scanner;
/**
 *
 * @author srdpl
 */
public class PruebaCasting {
    public static void main(String[] args) {
        PersonaCondicional p1= new PersonaCondicional();
        Scanner sc = new Scanner(System.in);
        int edad,altura;
        boolean casado;
        System.out.println("Indica la edad");
        p1.setEdad(sc.nextInt());
        edad=p1.getEdad();
        System.out.println("Indica la altura");
        p1.setAltura(sc.nextInt());
        altura=p1.getAltura();
        p1.setEstaCasado(false);
        casado=p1.isEstaCasado();
        
        if (edad>18&&edad<=39&&casado==false&&altura>175) 
        {
            System.out.println("Has conseguido el papel!!!");
        }
    }
}

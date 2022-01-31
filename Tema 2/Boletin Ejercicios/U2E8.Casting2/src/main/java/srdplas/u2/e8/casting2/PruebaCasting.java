package srdplas.u2.e8.casting2;
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
        System.out.println("Indica si esta casado");
        p1.setEstaCasado(sc.nextBoolean());
        casado=p1.isEstaCasado();
        
        if ((edad>=18&&edad<=30&&casado==false)||(edad>30&&edad<40&&casado==false&&altura>190)||(edad>=40&&casado==true))
        {
            System.out.println("Has conseguido el papel!!!");
        }
        
        //EJERCICIO 9
        /*if ((edad>=18&&edad<=30&&casado==false)||(edad>30&&edad<40&&casado==false&&altura>190)||(edad>=40||casado==true))
        {
            System.out.println("Has conseguido el papel!!!");
        }*/
    }
}

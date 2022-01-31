
package srdplas.u2e11personacondicionaldoble;
import java.util.Scanner;
/**
 *
 * @author srdplas
 */
public class PruebaPersonaCondicionalDoble {
    public static void main(String[] args) {
        PersonaCondicionalDoble p = new PersonaCondicionalDoble();
        Scanner sn = new Scanner(System.in);
        int edad, altura;
        boolean casado, trabaja;
        p.setEdad(20);
        p.setAltura(165);
        p.setEstaCasado(false);
        p.setTieneTrabajo(true);
        
        edad=p.getEdad();
        altura=p.getAltura();
        
        
        
        if (edad<18) 
        {
            System.out.println("Eres menor de edad");
        }
        else System.out.println("Eres mayor de edad");
        
        if (altura>=185)
        {
            System.out.println("Eres alto");
        }
        else System.out.println("No eres alto");
        System.out.println("Esta casado?");
        p.setEstaCasado(sn.nextBoolean());
        System.out.println("Tiene trabajo?");
        p.setTieneTrabajo(sn.nextBoolean());
        casado=p.isEstaCasado();
        trabaja=p.isTieneTrabajo();
        if(casado&&trabaja)
        {
            System.out.println("Esta casado y trabaja");
        }else {
            if(!casado&&trabaja){
                System.out.println("No esta casado pero trabaja");
            }else System.out.println("no trabaja");
        }
        
        
        
    }
}

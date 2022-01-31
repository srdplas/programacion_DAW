
package srdplas.u3extra1persona;
import java.util.*;
/**
 *
 * @author srdpl
 */
public class PuebloMedieval {

    public static void main(String[] args) {
       Persona pueblo []=  new Persona[5];
       Scanner sn = new Scanner(System.in);
       Noble n = new Noble("Antonio",25);
       Soldado s = new Soldado("Kiko", 20);
       Soldado s2 = new Soldado("Rafa", 20);
       Campesino ca = new Campesino("Alberto", 5);
       Campesino ca2 = new Campesino("Ale", 3);
       
       pueblo[0]=n;
       pueblo[1]=s;
       pueblo[2]=s2;
       pueblo[3]=ca;
       pueblo[4]=ca2;
       
       
        System.out.println("PUEBLO MEDIEVAL");
        System.out.println("------------------------------------------------");
        System.out.println("¿Cuantos ciclos de acciones deseas visualizar?");
        int acciones=sn.nextInt();
        System.out.println("------------------------------------------------");
        
        for(int i =0; i<acciones;i++){
            System.out.println("- CICLO "+(1+i)+" -");
            for(Persona p:pueblo){
                p.realizaAccion();
            }
        }
       
       
       
    }

}

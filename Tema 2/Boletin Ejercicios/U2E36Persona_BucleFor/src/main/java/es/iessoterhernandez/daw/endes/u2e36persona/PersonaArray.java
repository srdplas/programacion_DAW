
package es.iessoterhernandez.daw.endes.u2e36persona;

import java.util.Scanner;

/**
 *
 * @author srdplas
 */
public class PersonaArray {
    public static void main(String[] args) {
        Persona familia[]= new Persona[4];
        Persona casa[] = new Persona[4];
        Scanner sn =new Scanner(System.in);
        
        
        familia[0]= new Persona();
        familia[0].setRol("Padre");
        familia[0].setEdad(43);
        
        familia[1]= new Persona();
        familia[1].setRol("Madre");
        familia[1].setEdad(40);
        
        
        familia[2]= new Persona();
        familia[2].setRol("Hijo");
        familia[2].setEdad(24);
        
        familia[3]= new Persona();
        familia[3].setRol("Hija");
        familia[3].setEdad(14);
        
        
        for(int i =0; i<familia.length; i++){
            System.out.println("La posicion "+i+" la ocupa el/la "+familia[i].getRol()+" y tiene "+familia[i].getEdad()+" años");
        }
        familia[2].setEdad(0);
        familia[2].setRol(null);
        
        System.out.println("Se va el Hijo de casa");
        for(int i =0; i<familia.length; i++){
            System.out.println("La posicion "+i+" la ocupa el/la "+familia[i].getRol()+" y tiene "+familia[i].getEdad()+" años");
        }
        System.out.println("LLega el Abuelo a la casa");
        
        familia[2].setEdad(80);
        familia[2].setRol("Abuelo");
        
        for(int i =0; i<familia.length; i++){
            System.out.println("La posicion "+i+" la ocupa el/la "+familia[i].getRol()+" y tiene "+familia[i].getEdad()+" años");
        }
        
        for(int i = 0; i<casa.length; i++){
            
            
            System.out.println("Introduce el rol de la persona");
            String rol=sn.nextLine();
            
            System.out.println("Introduce los años de la persona");
            int edad=sn.nextInt();
            sn.nextLine();
            
            casa[i]=new Persona();
            casa[i].setEdad(edad);
            casa[i].setRol(rol);
        }
       
        for(int i =0; i<casa.length; i++){
           
            System.out.println("La posicion "+i+" la ocupa el/la "+casa[i].getRol()+" y tiene "+casa[i].getEdad()+" años");
        }
         System.out.println("El hijo se va de casa");
         casa[2].setRol(null);
         casa[2].setEdad(0);
         
         for(int i =0; i<casa.length; i++){
           
            System.out.println("La posicion "+i+" la ocupa el/la "+casa[i].getRol()+" y tiene "+casa[i].getEdad()+" años");
        }
        System.out.println("Viene el Abuelo");
        casa[2].setRol("Abuelo");
        casa[2].setEdad(80);
        
        for(int i =0; i<casa.length; i++){
           
            System.out.println("La posicion "+i+" la ocupa el/la "+casa[i].getRol()+" y tiene "+casa[i].getEdad()+" años");
        }
    }
}

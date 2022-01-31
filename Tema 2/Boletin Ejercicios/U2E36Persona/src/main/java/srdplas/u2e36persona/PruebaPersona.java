
package srdplas.u2e36persona;

/**
 *
 * @author srdpl
 */
public class PruebaPersona {
    public static void main(String[] args) {
       Persona persona[]= new Persona[4];
   
       persona[0]=new Persona("padre",43);
       persona[1]=new Persona("madre",40);
       persona[2]=new Persona("hijo",24);
       persona[3]=new Persona("hija",14);
       
       
       System.out.println("La posición 0 la ocupa el/la "+ persona[0].getRol()+" y tiene "+persona[0].getEdad()+" años");
       System.out.println("La posición 1 la ocupa el/la "+ persona[1].getRol()+" y tiene "+persona[1].getEdad()+" años");
       System.out.println("La posición 2 la ocupa el/la "+ persona[2].getRol()+" y tiene "+persona[2].getEdad()+" años");
       System.out.println("La posición 3 la ocupa el/la "+ persona[3].getRol()+" y tiene "+persona[3].getEdad()+" años");
       
       persona[2]= Persona.VACIO;
       System.out.println("El hijo se va y la posición 2 la ocupa el/la "+ persona[2].getRol()+" y tiene "+persona[2].getEdad()+" años");
       persona[2]= new Persona("abuelo", 80);
       System.out.println("La posición 2 la ocupa el/la "+ persona[2].getRol()+" y tiene "+persona[2].getEdad()+" años");
       
       
       for (int i=0; i<4; i++){
           System.out.println("Introduce el rol");
           
       }
       
    }
}

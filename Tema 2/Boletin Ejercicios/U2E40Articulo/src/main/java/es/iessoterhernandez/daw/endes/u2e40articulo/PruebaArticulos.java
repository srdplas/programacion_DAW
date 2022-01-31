
package es.iessoterhernandez.daw.endes.u2e40articulo;

import java.util.Scanner;

/**
 *
 * @author srdplas
 */
public class PruebaArticulos {
    public static void main(String[] args) {
        Articulo art[] = new Articulo[5];
        Scanner sn = new Scanner(System.in);
        int busqueda;
        int x =-1;
        for(int i=0; i <art.length; i++){
           art[i] = new Articulo();
        }
        
        art[0].setNombre("Osito de peluche");
        art[0].setIdArticulo(23);
        art[0].setPrecio(30.4);
        
        art[1].setNombre("Muñeca BArby");
        art[1].setIdArticulo(12);
        art[1].setPrecio(12.90);
        
        art[2].setNombre("Playmobil");
        art[2].setIdArticulo(33);
        art[2].setPrecio(32.40);
        
        art[3].setNombre("Dinosaurio de juguete");
        art[3].setIdArticulo(653);
        art[3].setPrecio(19.99);
        
        art[4].setNombre("Coche Hotwheels");
        art[4].setIdArticulo(41);
        art[4].setPrecio(12.95);
        
        System.out.println("Que codigo de articulo deseas buscar");
        busqueda=sn.nextInt();
        
        for(Articulo i: art){
            if(i.getIdArticulo()==busqueda){
                System.out.println("Nombre del Articulo:"+i.getNombre());
                System.out.println("Precio del Articulo: "+i.getPrecio());
                System.out.println("IdArticulo del Articulo: "+i.getIdArticulo());
                x =0;
                break;
            }
            
                
        }if(x!=0){
               System.out.println("Numero no encontrado"); 
            }
    }
}

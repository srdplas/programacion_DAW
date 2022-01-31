
package srdplas.u3e17libro;

/**
 *
 * @author srdpl
 */
public class PruebaLibroInterfaz {

    public static void main(String[] args) {
        Libro l = new Libro("El Hombre de Hierro", 4.99);
        Libro l2 = new Libro("La Abeja Maya", 1.99);
        Libro l3 = new Libro("Hulk", 2.99);
        
        LibrosApilados lib = new LibrosApilados(3);
        
        lib.apilar(l);
        lib.apilar(l2);
        lib.apilar(l);
        System.out.println("Libro de Encima "+lib.verCima());
        lib.apilar(l3);
        lib.desapilar();
        System.out.println("Libro de Encima "+lib.verCima());
        
        System.out.println("Numero de libros apilados "+lib.getNumElementos());
        lib.muestraMonton();
        
       
    }

}

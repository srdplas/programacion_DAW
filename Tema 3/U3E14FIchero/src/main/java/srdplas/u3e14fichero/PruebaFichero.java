package srdplas.u3e14fichero;

/**
 *
 * @author srdpl
 */
public class PruebaFichero {

    public static void main(String[] args) {

        Fichero f = new Fichero();
        Fichero f2 = new Fichero();

        f.setNombre("EL Olimpo");
        System.out.println(f.getCodificacion());
        System.out.println(f.getContenido());
        f.abrir();
        f.agregaContenido("Hola");
        f.agregaContenido("que tal");
        System.out.println(f.getTamanioEnBytes());
        System.out.println(f);
        
        
        f2.setNombre("Ballhalla");
        f2.abrir();
        f2.setCodificacion("utf-16");
        f2.agregaContenido("Hola");
        System.out.println(f2.getCodificacion());
        System.out.println(f2.getTamanioEnBytes());
        f2.borraContenido();
        System.out.println(f2.getContenido());
        System.out.println(f2.getTamanioEnBytes());
        f2.cerrar();
        System.out.println(f2);


    }

}

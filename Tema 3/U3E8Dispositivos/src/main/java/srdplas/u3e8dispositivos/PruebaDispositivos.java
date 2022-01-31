
package srdplas.u3e8dispositivos;

/**
 *
 * @author srdpl
 */
public class PruebaDispositivos {
    public static void main(String[] args) {
        Procesador p= new Procesador();
        RAM rm = new RAM();
        TarjetaVideo tj = new TarjetaVideo();
        Impresora1 im = new Impresora1();
        
        p.setMarca("AMD");
        p.setModelo("Ryzen 9");
        
        rm.setMarca("Kingson");
        rm.setModelo("6753jfr");
        
        tj.setMarca("Nvidia");
        tj.setModelo("RTX 2090");
        
        System.out.println(p);
        System.out.println(rm);
        System.out.println(tj);
        
        p.encender();
        rm.encender();
        tj.encender();
        
        p.multiplica(2, 2);
        p.resta(15, 5);
        System.out.println(p);
        System.out.println("Reseteamos los Drivers");
        p.resetControladores();
        System.out.println(p);
        
        rm.leeDatos();
        rm.modificaDatos(2, 99);
        rm.leeDatos();
        System.out.println(rm);
        System.out.println("Reseteamos los Drivers");
        rm.resetControladores();
        System.out.println(rm);
        
        tj.enseniaNum();
        tj.enseniaNum();
        tj.enseniaTexto();
        System.out.println(tj);
        System.out.println("Resetamos los Drivers");
        tj.resetControladores();
        System.out.println(tj);
        
        System.out.println("Ejercico 8 IMpresora 1");
        //EntradaSalida en = new EntradaSalida(); Clase abstraca no se puede crear objetos con ella
        // No tendría sentido crear un objeto de esa clase porque es como una etiqueta de otra clase.
        //Heredaría la clase impresora con codigo todo lo que pongamos en la clase EntradaSalida y sin codigo los metodos de la clase Dispositivos
        //No podemos extender una clase con 2 super clases.
        //Si es final no puede tener hijos
        im.encender();
        im.apagar();
        im.resetControladores();
        System.out.println(im);
        
        
        
        
    }
}

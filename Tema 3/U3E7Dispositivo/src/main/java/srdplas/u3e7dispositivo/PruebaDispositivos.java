
package srdplas.u3e7dispositivo;

/**
 *
 * @author srdpl
 */
public class PruebaDispositivos {
    public static void main(String[] args) {
        Procesador p= new Procesador();
        RAM rm = new RAM();
        TarjetaVideo tj = new TarjetaVideo();
        
        
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
        
    }
}

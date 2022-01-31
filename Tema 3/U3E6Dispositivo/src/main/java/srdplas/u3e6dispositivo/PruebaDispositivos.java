
package srdplas.u3e6dispositivo;

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
        
        System.out.println("Marca Procesador; "+p.getMarca());
        System.out.println("Modelo Procesador: "+p.getModelo());
        System.out.println("Encendida?; "+p.isEncendido());
        
        
        System.out.println("Marca RAM; "+rm.getMarca());
        System.out.println("Modelo RAM: "+rm.getModelo());
        System.out.println("Encendida?; "+rm.isEncendido());
        System.out.println("Encendemos");
        rm.encender();
        rm.leeDatos();
        rm.modificaDatos(0, 12);
        rm.leeDatos();
        
        
        
        System.out.println("Marca Grafica; "+tj.getMarca());
        System.out.println("Modelo Grafica: "+tj.getModelo());
        tj.encender();
        tj.encender();
        
        System.out.println("Encendida?; "+tj.isEncendido());
        int num=tj.enseniaNum();
        System.out.println("Numero enseñado: "+num);
        tj.enseniaTexto();
        tj.apagar();
        
        System.out.println("Encendida?; "+tj.isEncendido());
        num=tj.enseniaNum();
        System.out.println("Numero enseñado: "+num);
        tj.enseniaTexto();
        
        System.out.println("-----Ejerccio 6 probando los toString-----");
        p.encender();
        rm.encender();
        tj.encender();
        p.divide(10, 2);
        p.suma(4, 4);
        p.multiplica(2, 2);
        p.divide(10, 2);
        System.out.println(p);
        tj.apagar();
        tj.encender();
        tj.enseniaTexto();
        tj.enseniaNum();
        System.out.println(tj);
       
        
        System.out.println(rm);
        
        
    }
}

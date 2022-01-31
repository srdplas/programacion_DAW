
package srdplas.u3e9dispositivos;

/**
 *
 * @author srdpl
 */
public class PruebaDispositivos {
    public static void main(String[] args) {
        Procesador p= new Procesador("Intel", "I9");
        RAM rm = new RAM("Barracuda", "7384");
        TarjetaVideo tj = new TarjetaVideo("Nvidia", "150");
        Dispositivos di = new Dispositivos("AMD", "Ryzen3");
        System.out.println(di);
       
        //Tenemos que quitar que la clase dispositivo sea abstracta al tener un constructor
        //Cambiar el metodo resetar COntroladores y quitarle el abstrac y dejarlo vacio
        //Añadir un constructor con las mismas propiedades que el constructor de la super clase a cada sub clase.
        
        
        
    }
}


package srdplas.u3e10dispositivos;

/**
 *
 * @author srdpl
 */
public class PruebaDispositivos {
    public static void main(String[] args) {
        Procesador p= new Procesador("Intel", "I9");
        Procesador p2= new Procesador("Intel", "I5");
        RAM rm = new RAM("Barracuda", "7384");
        RAM rm2 = new RAM("Shapire", "722");
        TarjetaVideo tj = new TarjetaVideo("Nvidia", "150");
        Dispositivos di = new Dispositivos("AMD", "Ryzen3");
        System.out.println(di);
        final int tamanio =5;
        int numVeces=100;
        int contador=0;
        //Tenemos que quitar que la clase dispositivo sea abstracta al tener un constructor
        //Cambiar el metodo resetar COntroladores y quitarle el abstrac y dejarlo vacio
        //Añadir un constructor con las mismas propiedades que el constructor de la super clase a cada sub clase.
        System.out.println("ARRAY");
        
        Dispositivos dis []= new Dispositivos[tamanio];
        dis[0]=p;
        dis[1]=p2;
        dis[2]=rm;
        dis[3]=rm2;
        dis[4]=tj;
        
        for(int i=0; i<numVeces;i++){
            
            contador++;
            System.out.println(contador);
            
        for(Dispositivos ver: dis){
            
            System.out.println("Encendiendo:"+ver);
           ver.encender();
           
            System.out.println("Apagando:"+ver);
           ver.apagar();
            
        }
        }
    }
}

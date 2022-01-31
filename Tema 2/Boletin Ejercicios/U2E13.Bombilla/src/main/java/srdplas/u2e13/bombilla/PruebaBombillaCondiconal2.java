package srdplas.u2e13.bombilla;

/**
 *
 * @author srdplas
 */
public class PruebaBombillaCondiconal2 {
    public static void main(String[] args) {
        BombillaCondicional bc = new BombillaCondicional();
        int numVeces;
        bc.cambiaMarca("Phillips");
        bc.cambiaPotncia(100);
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        bc.apagar();
        bc.encender();
        
        //Se funde la bombilla
        bc.encender();
        bc.apagar();
        numVeces=bc.obtieneNumVecesEncendida();
        System.out.println("La bombilla se ha encendido un total de: "+numVeces);
        bc.imprimeEstado();
    }
}

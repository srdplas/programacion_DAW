
package srdplas.u2e12.bombilla;

/**
 *
 * @author srdplas
 */
public class PruebaBombillaCondicional {
    public static void main(String[] args) {
        BombillaInteligente b = new BombillaInteligente();
        int numVeces;
        b.cambiaMarca("Phillips");
        b.cambiaPotncia(100);
        b.encender();
        b.apagar();
        
        b.apagar();
        b.encender();
        b.encender();
        b.apagar();
        
        b.imprimeEstado();
        numVeces=b.obtieneNumVecesEncendida();
        System.out.println("La bombilla se ha encendido " +numVeces +" veces");
        b.imprimeMarca();
        b.imprimePotencia();
    }
}


package srdplas.u3e1ordenador;

/**
 *
 * @author srdpl
 */
public class PruebaOrdenador {
    public static void main(String[] args) {
        Ordenador or= new Ordenador();
        or.imprimeEstado();
        
        Ordenador or2=new Ordenador("HP", "B454");
        or2.imprimeEstado();
        Ordenador or3=new Ordenador("MSI", "BAZOKA", 2020);
        or3.setEncendido(true);
        or3.imprimeEstado();
        
        
    }
}


package srdplas.ejerciciomamifero;

/**
 *
 * @author srdpl
 */
public class Felino extends Mamifero{
    private int diasSinCazar;
    
    public void salta(){
        System.out.println("Mira como salto");
    }
    public void caza(){
        diasSinCazar=0;
        System.out.println("Mira como cazo");
    }
}

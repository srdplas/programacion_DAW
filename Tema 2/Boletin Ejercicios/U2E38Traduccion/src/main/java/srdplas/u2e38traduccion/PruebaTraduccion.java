
package srdplas.u2e38traduccion;

/**
 *
 * @author srdpl
 */
public class PruebaTraduccion {
    public static void main(String[] args) {
        Traduccion tradu [] = new Traduccion[5];
        
        tradu[0]= new Traduccion();
        tradu[0].setEnglish("To break down");
        tradu[0].setSpanish("Averiar");
        
        tradu[1]= new Traduccion();
        tradu[1].setEnglish("To fix");
        tradu[1].setSpanish("Arreglar");
        
        tradu[2]= new Traduccion();
        tradu[2].setEnglish("To reboot");
        tradu[2].setSpanish("Reiniciar");
        
        tradu[3]= new Traduccion();
        tradu[3].setEnglish("To work");
        tradu[3].setSpanish("Funcionar");
        
        tradu[4]= new Traduccion();
        tradu[4].setEnglish("To type");
        tradu[4].setSpanish("Teclear");
        
        for(Traduccion i:tradu){
            System.out.println("");
        }
        
        
    }
}

package srdplas.u3examen1altavoces;

/**
 *
 * @author srdpl
 */
public class PruebaAltavoces {
    public static void main(String[] args) {
        PcSpeaker p = new PcSpeaker("HP", "hg3");
        MP3Speaker mp = new MP3Speaker("Philips", "9I");
        
        p.encender();
        p.equalize();
        p.play();
        p.apagar();
        p.equalize();
        
        mp.addNewTracks(5);
        mp.encender();
        
    }
}

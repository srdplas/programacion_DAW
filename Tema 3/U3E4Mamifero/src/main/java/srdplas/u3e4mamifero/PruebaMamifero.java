
package srdplas.u3e4mamifero;

/**
 *
 * @author srdpl
 */
public class PruebaMamifero {
    public static void main(String[] args) {
        Perro p = new Perro();
        Gato g = new Gato();
        Tigre t = new Tigre();
        Mamifero m = new Mamifero();
        Canino c = new Canino();
        Felino f = new Felino();
        
        c.haceRuido(); //Este objeto usa el metodo de la superClase
        f.haceRuido();
        m.haceRuido();
        p.haceRuido(); //Metodo sobreescrito
        g.haceRuido();  //Metodo sobreescrito
        t.haceRuido();  //Metodo sobreescrito
        
    }
}

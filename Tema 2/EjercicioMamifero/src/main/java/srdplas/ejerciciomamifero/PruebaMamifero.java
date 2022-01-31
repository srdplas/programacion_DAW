
package srdplas.ejerciciomamifero;

/**
 *
 * @author srdpl
 */
public class PruebaMamifero {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Felino f = new Felino();
        Gato g = new Gato();
        Tigre t = new Tigre();
        Equino e = new Equino();
        
        e.corre();
        e.rumia();
        e.crece();
        e.seReproduce(m);
        e.muere();
        
        f.nace();
        f.crece();
        f.seReproduce(m);
        f.muere();
        
        g.nace();
        g.crece();
        g.seReproduce(m);
        g.muere();
        g.maulla();
        
        t.nace();
        t.crece();
        t.seReproduce(m);
        t.muere();
        t.ruge();
        
        
        
        
    }
    
}

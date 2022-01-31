
package srdplas.ejerciciomamifero;

/**
 *
 * @author srdpl
 */
public class Mamifero {
    private double peso;
    private String alimentacion;
    
    public void nace(){
        System.out.println("Mira como nazco");
    }
    public void crece(){
        System.out.println("Mira como crezco");
    }
    public void seReproduce(Mamifero m){
        System.out.println("Miro como me procreo con"+m);
    }
    public void muere(){
        System.out.println("Pues me muero");
    }

    @Override
    public String toString() {
       return " mamifero";
    }
    
}


package srdplas.u3e2futbolista;

/**
 *
 * @author srdpl
 */
public class PruebaFutbolista {
    public static void main(String[] args) {
        Futbolista fut = new Futbolista("Iker", "Casillas");
        fut.marcaGol();
        fut.marcaGol(4);
        System.out.println("Numero de Goles: "+fut.getNumGoles());
        fut.golAnulado(2);
        fut.golAnulado();
        System.out.println("Numero de Goles: "+fut.getNumGoles());
        fut.setSalario(200000.99);
        fut.setLesionado(true);
        System.out.println("Nombre "+fut.getNombre());
        System.out.println("Apellidos "+fut.getApellidos());
        System.out.println("Está lesionado? "+fut.isLesionado());
        System.out.println("Salario: "+fut.getSalario());
        System.out.println("Numero de Goles: "+fut.getNumGoles());
        
    }
}


package srdplas.u3e13.interfazimpresora;

/**
 *
 * @author srdpl
 */
public class PruebaInterfaces {
    public static void main(String[] args) {
        InterfazDocumento in = new InterfazDocumento();
        
        in.setTitulo("Porque Boba Feet se quita el casco");
        in.setNumPaginasImpresion(5);
        in.setContenido("Resulta que la serie de Boba Feet la cual no he visto todavia, el prota se quita el casco pero resulta"
                + "que es muy feo y dicen la gente que es aburrida");
        
        System.out.println("Titulo "+in.getTitulo());
        System.out.println("Numero de Paginas "+in.getNumPaginasImpresion());
        System.out.println("Contenido"+in.getContenido());
    }
}

package srdplas.u3e13.interfazimpresora;

/**
 *
 * @author srdpl
 */
public class PruebaImpresora {

    public static void main(String[] args) {
        InterfazDocumento in = new InterfazDocumento();
        InterfazDocumento in2 = new InterfazDocumento();
        Impresora im = new Impresora("HP", "Laserjet 2000");

        in.setTitulo("Porque Boba Feet se quita el casco");
        in.setNumPaginasImpresion(3);
        in.setContenido("Resulta que la serie de Boba Feet la cual no he visto todavia, el prota se quita el casco pero resulta"
                + "que es muy feo y dicen la gente que es aburrida");

        in2.setTitulo("El despertar");
        in2.setNumPaginasImpresion(4);
        in2.setContenido("Un zombie se despertó con conciencia sabiendo que era uno y queria saber la explicacion");

        
        System.out.println("Estado: " + im.getEstado());
        im.encender();
        im.cargarBandeja(5);
        im.imprimir(in);
        System.out.println("Estado: " + im.getEstado());
        im.imprimir(in2);
        
        System.out.println("Cargamos bandeja");
        im.cargarBandeja(4);
        im.imprimir(in2);
        System.out.println("Estado: " + im.getEstado());
        im.cargarBandeja(0);

    }

}

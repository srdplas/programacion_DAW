package srdplas.u3e15mail;

/**
 *
 * @author srdpl
 */
public class PruebaMail {

    public static void main(String[] args) {
        Fichero f = new Fichero();
        Mensaje m = new Mensaje();

        f.setNombre("Apuntesa");
        f.abrir();
        f.agregaContenido("Tema 1");
        f.cerrar();
        System.out.println(f);

        m.setRemitente("yuri@gmail.com");
        m.setDestinatario("luciagmail.com");
        m.setAsunto("Los Apuntes del Tema 1");
        m.setContenido("Hola te adjunto el tema 1 que pediste");
        m.envia();
        
        m.setDestinatario("lucia@gmail.com");
        f.setNombre("Nuevos Apuntes");
        f.abrir();
        f.cerrar();
        System.out.println(f);
        m.setFicheroAdjunto(f);
        m.envia();

    }

}

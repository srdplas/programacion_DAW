package srdplas.u3e15mail;

/**
 *
 * @author srdpl
 */
public interface InterfazFichero {

    String getNombre();

    void setNombre(String nombre);

    void setCodificacion(String codificacion);

    String getCodificacion();

    void abrir();

    void cerrar();

    void borraContenido();

    void agregaContenido(String contenido);

    String getContenido();

    int getTamanioEnBytes();
}

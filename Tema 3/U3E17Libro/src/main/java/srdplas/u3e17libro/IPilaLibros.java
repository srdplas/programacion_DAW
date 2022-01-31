package srdplas.u3e17libro;

/**
 *
 * @author srdpl
 */
public interface IPilaLibros {

    void apilar(Libro l);

    Libro desapilar();

    Libro verCima();

    int getNumElementos();

    void vaciar();
}

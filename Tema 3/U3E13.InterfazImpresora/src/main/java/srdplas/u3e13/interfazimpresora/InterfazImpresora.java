package srdplas.u3e13.interfazimpresora;

/**
 *
 * @author srdpl
 */
public interface InterfazImpresora {

    String getMarca();

    String getModelo();

    void encender();

    void apagar();

    void cargarBandeja(int numFolios);

    void imprimir(InterfazDocumento documento);

    String getEstado();
}

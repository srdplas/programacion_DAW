package srdplas.u3e2autoprueba;

/**
 *
 * @author srdpl
 */
public interface AscensorInterface {

    public String getMarca();
    public String getModelo();
    public int getNumMaxPlantasEdificio();
    public int getPlantaActual();
    public void sube(int plantaDestino);
    public void baja(int plantaDestino);
    
    @Override
    public String toString();
    
    
    
}

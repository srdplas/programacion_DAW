
package srdplas.u3e1ordenador;

/**
 *
 * @author srdpl
 */
public class Ordenador {
     private String marca;
     private String modelo;
     private int anioFabricacion;
     private boolean encendido;

    public Ordenador() { 
    }

    public Ordenador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Ordenador(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }
    
    public void imprimeEstado(){
        System.out.println("Marca del Ordenador: "+getMarca());
        System.out.println("El modelo del Ordenador: "+getModelo());
        System.out.println("Año de Fabricacion: "+getAnioFabricacion());
        System.out.println("Ordenador encendido: "+isEncendido());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

     
     
     
     
     
     
}

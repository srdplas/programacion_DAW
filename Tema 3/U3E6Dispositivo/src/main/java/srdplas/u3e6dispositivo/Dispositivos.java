package srdplas.u3e6dispositivo;

/**
 *
 * @author srdpl
 */
public class Dispositivos {

    private String marca, modelo;
    private boolean encendido;

    public void encender() {
        if (encendido) {
            System.out.println("Dispositivo ya estaba encendido");
        } else {
            if (!encendido) {
                encendido = true;
            }
        }
    }

    @Override
    public String toString() {
        return "Dispositivo";
    }
    
    
    
    public void apagar() {
        if (!encendido) {
            System.out.println("Dispositivo ya estaba apagado");

        } else {
            if (encendido) {
                encendido = false;
            }
        }
    }

    public boolean isEncendido() {
        return encendido;
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
    
    
}

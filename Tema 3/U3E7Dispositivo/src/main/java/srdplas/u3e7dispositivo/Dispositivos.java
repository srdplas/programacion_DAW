package srdplas.u3e7dispositivo;

/**
 *
 * @author srdpl
 */
public abstract class Dispositivos {

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
    
    public abstract void resetControladores();
        
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

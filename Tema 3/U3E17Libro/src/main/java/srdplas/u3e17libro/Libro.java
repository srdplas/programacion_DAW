package srdplas.u3e17libro;

/**
 *
 * @author srdpl
 */
public class Libro {
    private String titulo;
    private double precio;

    public Libro(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro: "+titulo+" Precio: "+precio; 
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}

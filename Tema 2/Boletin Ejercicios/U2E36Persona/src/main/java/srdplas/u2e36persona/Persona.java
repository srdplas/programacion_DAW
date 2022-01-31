
package srdplas.u2e36persona;

/**
 *
 * @author srdpl
 */
public class Persona {
    
    public static final Persona VACIO=new Persona(); // Crea un nuevo objeto y machaca el que haya 
    
    public int edad;
    public String rol;

    public Persona(String rol, int edad) {
        this.edad = edad;
        this.rol = rol;
    }

    private Persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
    
    
}

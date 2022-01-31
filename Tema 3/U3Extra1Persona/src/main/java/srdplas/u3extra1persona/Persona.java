package srdplas.u3extra1persona;

/**
 *
 * @author srdpl
 */
abstract class Persona {
        
    protected int monedas;
    protected boolean estaVivo;
    protected String nombre;
   
    
    
    
    public abstract void come();
    public abstract void muere();
    
    public abstract void realizaAccion();
    
}


package srdplas.u2e31candado;

/**
 *
 * @author srdpl
 */
public class CandadoNumerico {
    public int numeroSecreto;
    
    public void setNumSecreto(int nuevoNumSecreto){
        numeroSecreto=nuevoNumSecreto;
    }
    
    public boolean intentaAbrir(int numero){
        boolean abierto;
        if(numero==numeroSecreto){
            abierto=true;
        }else abierto=false;
        
        return abierto;
    }
}

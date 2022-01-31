package srdplas.u3e1autoprueba;

/**
 *
 * @author srdpl
 */
abstract class Calentadores {
    protected double potenciaMax;
    protected boolean encendido;
    
    public double getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(double potenciaMax) {
        this.potenciaMax = potenciaMax;
    }
    
    
    public void encender(){
        if(encendido){
            System.out.println(toString()+"ya estaba encendido");
        }else{
            encendido=true;
        }
    }
    
    public void apagar(){
        if(!encendido){
            System.out.println(toString()+"ya estaba apagado");
        }else{
            encendido=false;
        }
    }

    public boolean getEstado() {
        return encendido;
    }
    
    public double  calculaPotenciaActual(){
        if(!encendido){
            return 0.0;
        }return potenciaMax;
        
        
        
        
        
    }
    
    
    
}

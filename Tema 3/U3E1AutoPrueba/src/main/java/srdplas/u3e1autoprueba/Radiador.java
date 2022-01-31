package srdplas.u3e1autoprueba;

/**
 *
 * @author srdpl
 */
public class Radiador extends Calentadores{
    private double potenciaGraduada;
    
    public void graduarPotencia(double potenciaGraduada){ 
        this.potenciaGraduada=(potenciaGraduada/100);
    }
    
    public double getPotenciaGraduada(){
        return potenciaGraduada;
    }

    @Override
    public double calculaPotenciaActual() {
        double op=0;
        if(encendido){
           op=getPotenciaMax()*potenciaGraduada;
        }return op; 
    }

    @Override
    public String toString() {
        return "Radiador ";
    }
    
    
    
}

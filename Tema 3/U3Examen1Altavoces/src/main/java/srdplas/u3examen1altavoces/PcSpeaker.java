package srdplas.u3examen1altavoces;

/**
 *
 * @author srdpl
 */
public class PcSpeaker extends Altavoces{

    private boolean ecualizador;
    
    public PcSpeaker(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    void play() {
        if(isEncendido()){
            System.out.print("Reproduciendo Audio");
            if(ecualizador){
                System.out.print(" con EQ");
                
            }System.out.println("");
        }
    }

    @Override
    void stop() {
        if(isEncendido()){
             System.out.print("Y se paró la reproduccion");
            if(ecualizador){
                System.out.print(" con EQ");
            }System.out.println("");
        }
    }
    
    public void equalize(){
        if(this.isEncendido()){
            if(!ecualizador){
            ecualizador=true;
        }else{
            if(ecualizador){
                ecualizador=false;
            }
        }
        }else{
            System.out.println("Sin cambios en la EQ."+this.toString());
        }
        
        
    }

    @Override
    public String toString() {
        return "PC Speaker";
    }
    
    
    
}

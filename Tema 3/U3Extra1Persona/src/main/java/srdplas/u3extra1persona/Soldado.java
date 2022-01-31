package srdplas.u3extra1persona;

/**
 *
 * @author srdpl
 */
public class Soldado extends Persona{

    public Soldado(String nombre, int monedas) {
        this.monedas=monedas;
        this.estaVivo=true;
        this.nombre=nombre;
    }

    @Override
    public String toString() {
        return "Soldado "+this.nombre+" ";
    }

    
    
    @Override
    public void come() {
        System.out.print(toString()+"con "+this.monedas+" monedas de plata - COME -");
        this.monedas-=5; 
        System.out.println(toString()+"le quedan "+this.monedas);
        
    }

    @Override
    public void muere() {
        System.out.println(toString()+"con "+this.monedas+" monedas de plata - MUERE -");
        this.estaVivo=false;
    }

    @Override
    public void realizaAccion() {
        if(!this.estaVivo){
            System.out.println(toString()+"Ha muerto - SIN ACCION -");
        }else{    
            int num=(int)(Math.random()*100+1);
            
            if(num>=0&&num<=20){
                muere();
            }else{
                if(num>=21&&num<=60){
               luchaEnBatalla();
            }else{
                    come();
                }
            }
        }
    }

    public void luchaEnBatalla(){
        System.out.println(toString()+"con "+this.monedas+" monedas de plata - LUCHA -");
        this.monedas+=50;
        
    
    }
    
    
}

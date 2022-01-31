package srdplas.u3extra1persona;

/**
 *
 * @author srdpl
 */
public class Campesino extends Persona{

    public Campesino(String nombre, int monedas) {
        this.monedas=monedas;
        this.estaVivo=true;
        this.nombre=nombre;
    }

    @Override
    public String toString() {
        return "Campesino "+this.nombre+" ";
    }
    
    
    
    public void vendeCosecha(){
        System.out.println(toString()+"con "+this.monedas+" monedas de plata - VENDE COSECHA -");
        this.monedas+=50;
        
        
    }
    
    public void cultiva(){
        System.out.println(toString()+"con "+this.monedas+" monedas de plata - CULTIVA -");
    }
    
    @Override
    public void come() {
        System.out.print(toString()+"con "+this.monedas+" monedas de plata - COME -");
        this.monedas-=3;
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
            
            if(num>=0&&num<=10){
                muere();
            }else{
                if(num>=11&&num<=60){
               cultiva();
            }else{
                  if(num>=61&&num<=70){
                      vendeCosecha();
                  }else {
                      come();
                  }
                }
            }
        }
        
    }

   

}


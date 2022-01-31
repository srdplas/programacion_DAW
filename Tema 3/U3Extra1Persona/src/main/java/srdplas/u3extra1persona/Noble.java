package srdplas.u3extra1persona;

/**
 *
 * @author srdpl
 */
public class Noble extends Persona{

    public Noble(String nombre, int monedas) {
        this.monedas=monedas;
        this.estaVivo=true;
        this.nombre=nombre;
    }

    public void recaudaImpuestos(){ 
        System.out.println(toString()+"con "+this.monedas+" monedas de plata - RECAUDA -");
        this.monedas+=500;
    }

    @Override
    public String toString() {
        return "Noble "+this.nombre+" ";
    }
    
    
            
    @Override
    public void come() {
        System.out.print(toString()+"con "+this.monedas+" monedas de plata - COME -");
        this.monedas-=10;
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
            
            if(num>=0&&num<=5){
                muere();
            }else{
                if(num>=6&&num<=20){
               recaudaImpuestos();
            }else{
                  come();
                }
            }
        }
        
    }

    

}

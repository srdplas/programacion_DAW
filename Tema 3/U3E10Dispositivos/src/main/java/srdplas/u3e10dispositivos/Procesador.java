
package srdplas.u3e10dispositivos;

/**
 *
 * @author srdpl
 */
public class Procesador extends Dispositivos{
    private int numOperaciones;

    public Procesador(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void apagar() {
        super.apagar();
        numOperaciones=0;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        
        return super.toString()+"Procesador  marca="+getMarca()+" modelo="+getModelo()+", encendido="+isEncendido()+", Procesador:operaciones="+numOperaciones;
    }
    
    
    
    public int suma(int num1, int num2){
        if(isEncendido()){
            numOperaciones++;
            return num1+num2;
            
        }System.out.println("Dispsitivo apagado");
        return -1;
          
        
    }
   public int resta(int num1, int num2){
       if(isEncendido()){
            numOperaciones++;
            return num1-num2;
            
        }System.out.println("Dispsitivo apagado");
        return -1;
   } 
   
   public int multiplica(int num1, int num2){
       if(isEncendido()){
            numOperaciones++;
            return num1*num2;
            
        }System.out.println("Dispsitivo apagado");
        return -1;
   }
   public int divide(int num1, int num2){
       if(isEncendido()){
            numOperaciones++;
            return num1/num2;
            
        }System.out.println("Dispsitivo apagado");
        return -1;
   }

    @Override
    public void resetControladores() {
       numOperaciones=0;
    }
}

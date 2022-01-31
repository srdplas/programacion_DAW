
package srdplas.u3e8dispositivos;

/**
 *
 * @author srdpl
 */
public class RAM extends Dispositivos{
   private int numeros[]= new int[100];
   private int opEscritura, opLectura;

    @Override
    public void apagar() {
        super.apagar(); 
        opEscritura=0;
        opLectura=0;
    int numeros[] = new int[100];
    }
   
    @Override
    public String toString() {
        super.toString();
       return "Dispotivo: marca="+getMarca()+" modelo="+getModelo()+", encendido="+isEncendido()+", RAM:numWrite="+opEscritura+"numRead="+opLectura;
    }
   
   public void modificaDatos( int posicion, int numNuevo){
       if(isEncendido()){
           numeros[posicion]=numNuevo;
            opEscritura++;
       }
   }
   
   public void leeDatos(){
       
       
       
       for(int i=0; i<numeros.length;i++){
           System.out.println(numeros[i]);
       }
       opLectura++;
       System.out.println("-------------------------");
   }

    public int getOpEscritura() {
        return opEscritura;
    }

    public int getOpLectura() {
        return opLectura;
    }

    @Override
    public void resetControladores() {
        opEscritura=0;
        opLectura=0;
    }
   
   
}

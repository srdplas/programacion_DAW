
package srdplas.u3e6dispositivo;

/**
 *
 * @author srdpl
 */
public class TarjetaVideo extends Dispositivos{
    private int numEntero, numTexto;

    @Override
    public void apagar() {
        super.apagar(); 
        numEntero=0;
        numTexto=0;
    }
    
     @Override
    public String toString() {
        
        return super.toString()+ 
                " Tarjeta Video: marca="+getMarca()+" modelo="+getModelo()+", encendido="+isEncendido()+", Tarjeta video:cantidadNumeros="+numEntero+"cantidadTextos="+numTexto;
    }
    
    public int enseniaNum(){
        int num=0;
        if(isEncendido()){
        num = (int)(Math.random()*100+1);
        numEntero++;
            
        }else{
            System.out.println("Tarjeta Apagada");
            numEntero=-1;
        }
        return num;
    }
    public void enseniaTexto(){
        
        if(isEncendido()){
            System.out.println("HOla");
        numTexto++;
            
        }else{
            System.out.println("Tarjeta Apagada");
            numTexto=-1;
            System.out.println("No hay datos");
        }
       
    }
}

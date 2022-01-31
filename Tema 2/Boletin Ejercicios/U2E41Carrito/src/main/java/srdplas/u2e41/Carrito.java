
package srdplas.u2e41;
import java.util.Scanner;

/**
 *
 * @author srdpl
 */
public class Carrito {
    public Articulo carrito[];
    public int numArticulos;
    public boolean inicializado;
    //Propiedades
    
    /**
     * 
     * @param numPosiciones Inicializamos el array carrito con las posiciones indicadas
     */
    public void inicializaCarrito(int numPosiciones){
        carrito= new Articulo[numPosiciones];
        inicializado=true;
    }
    /**
     * 
     * @return numArticulos Vemos el numero de articulos del carro
     */
    public int getNumArticulos(){
        return numArticulos;
    }
    /**
     * 
     * @param nuevoArticulo Guardamos un articulo en el array carrito
     */
    public void guardaArticulo(Articulo nuevoArticulo){
        if(!inicializado){
            System.out.println("Error el carrito aun no está inicializado");
        }else {
            if(numArticulos==carrito.length){
                System.out.println("Error Carrito Lleno");
            }else{
                if(nuevoArticulo==Articulo.NOT_FOUND){
                    System.out.println("Error no se puede guardar la marca de no encontrado");
                }else {
                    for(int i=0; i<carrito.length; i++){
                        if(carrito[i]==null){
                            carrito[i]= nuevoArticulo;
                            numArticulos++;
                            break;
                        }
                    }
                }
            }
        }
    }
    /**
     * Mostramos los articulos que hay en en carrito
     */
    public void muestraArticulos(){
        if(!inicializado){
            System.out.println("Error Debes Iniciar el carrito"); 
        }else {
            for (int i=0; i<numArticulos; i++) {
                if (numArticulos==0) {
                    System.out.println("Error Carrito vacio");
                }else {
            System.out.println("ID: "+carrito[i].getIdArticulo()+", Nombre: "+carrito[i].getNombre()+", Precio: "+carrito[i].getPrecio()+" €");
                }
            }
        }
    }
    
    /**
     * 
     * @param idBuscar
     * @return idArticulo buscamos el id de un articulo en el carrito
     */
    public Articulo buscaArticuloPorId (int idBuscar){
        Articulo articulo = new Articulo();
      
        
        if(!inicializado){
            System.out.println("Error Carrito no inicializado");
            return Articulo.NOT_FOUND;
        }else {
            for (Articulo carrito1 : carrito) {
                if(carrito1.getIdArticulo()==idBuscar){   
                   
                   articulo=carrito1;
                   
                }else return Articulo.NOT_FOUND;             
                
            }
        }
                
        return articulo;
    }
    /**
     * 
     * @return precio total de los articulos del carrito
     */
    public double getPrecioTotalCarrito(){
        double error =-1;
        double precio =0;
        
        if(!inicializado){
            System.out.println("Error Carrito aun no inicializado");
            return error;
        }else{
            if(numArticulos==0){
                return precio;
            }else {
                for (Articulo carrito1 : carrito) {
                    precio += carrito1.getPrecio();
                }
            }
        }
        return precio;
    }

    
}

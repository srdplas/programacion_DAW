package srdplas.u3examen1altavoces;

/**
 *
 * @author srdpl
 */
public abstract class Altavoces {

    private String marca, modelo;
    private boolean encendido;

    public Altavoces(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void encender() {
        if(!encendido){
            encendido=true;
        }else{
            System.out.println("El Ya estaba encendido"+toString()); //Añadir luego el tostring 
        }
    }

    ;
    
    public void apagar() {
        if(encendido){
            encendido=false;
        }else{
             System.out.println("El Ya estaba apagado"+toString()); //Añadir luego el tostring 
        }
    }
    
    public  boolean isEncendido(){
        return encendido;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    

    abstract void play();

    abstract void stop();
    
}

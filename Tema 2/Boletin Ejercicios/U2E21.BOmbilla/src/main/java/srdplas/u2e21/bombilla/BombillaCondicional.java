package srdplas.u2e21.bombilla;

public class BombillaCondicional {
    public String marca;
    public int potencia, numVecesEncendida;
    public boolean encendida, fundida;
    //Caracteristicas de la bombilla
    
    public void cambiaMarca (String nuevaMarca){
        marca = nuevaMarca;
    }
    public void imprimeMarca (){
        System.out.println("La Marca de la Bombilla es " + marca);
    }
    //Hacemos el metodo para cambiar la marca y para imprimir la marca
    public void cambiaPotncia(int nuevaPotencia){
        potencia = nuevaPotencia;
    }
    public void imprimePotencia(){
        System.out.println("La Potencia de la Bombilla es " + potencia);
    }
    //Hacemos el metodo para cambiar la potencia de la bombilla y otro para imprimir
    public void encender(){
        
        if(fundida){
            System.out.println("La bombilla esta fundida no se puede encender");
        }else
        {
            if(encendida){
                System.out.println("La bombilla ya está encendida");
            }else{
                 numVecesEncendida++;
               if (numVecesEncendida>=5){
                   fundida=true;
                   encendida = false;
                   System.out.println("Se fundió a la "+numVecesEncendida);
                           
            }else encendida=true;
            }
        
        
        }
        
    }
    //Metodo para encender la bombilla
    public void apagar(){
        if(fundida){
            System.out.println("La bombilla está fundida");
        }else{
        if(encendida){
            encendida = false;
        }else System.out.println("La bombilla ya estaba apagada");
        }    
    }
    public void imprimeEstado(){
        
        if(fundida){
            System.out.println("La bombilla está fundida");
        }else System.out.println("Encendida?: " + encendida);
        
    }
    //Metodo para imprimir el estado de la bombilla
    public int obtieneNumVecesEncendida (){
        int vecesEncendida;
        vecesEncendida = numVecesEncendida;
        return vecesEncendida;
    }
}

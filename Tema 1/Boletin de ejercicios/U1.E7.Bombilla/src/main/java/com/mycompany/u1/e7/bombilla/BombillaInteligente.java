package com.mycompany.u1.e7.bombilla;

public class BombillaInteligente {
    public String marca;
    public int potencia, numVecesEncendida;
    public boolean encendida;
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
        encendida = true;
        numVecesEncendida += 1;
    }
    //Metodo para encender la bombilla
    public void apagar(){
        encendida = false;
    }
    public void imprimeEstado(){
        System.out.println("Encendida?: " + encendida);
    }
    //Metodo para imprimir el estado de la bombilla
    public int obtieneNumVecesEncendida (){
        int vecesEncendida;
        vecesEncendida = numVecesEncendida;
        return vecesEncendida;
    }
}

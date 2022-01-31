package com.mycompany.u1.e2.bombilla;

public class PruebaBombilla {
    public static void main(String[] args) {
        Bombilla bombilla1; //Definimos el objeto bombilla1
        bombilla1 = new Bombilla(); //Creamos el objeto bombilla
        //METODOS DE BOMBILLA
        bombilla1.imprimeMarca();
        bombilla1.imprimePotencia();
        bombilla1.imprimeEstado();
        //Imprime marca, potencia y estado de bombilla
        bombilla1.cambiaMarca("Phillips");
        bombilla1.cambiaPotncia(100);
        bombilla1.encender();
        bombilla1.apagar();
        bombilla1.encender();
        //Le cambiamos el nombre de la marca le ponemos potencia,
        //la encendemos, apagamos y encendemos e imprimimos estado
       
        bombilla1.imprimeMarca();
        bombilla1.imprimePotencia();
        bombilla1.imprimeEstado();
    }
    
}


package com.mycompany.u1.e7.bombilla;

public class Prueba2Bombillas {
    public static void main(String[] args) {
        BombillaInteligente led1 = new BombillaInteligente();
        BombillaInteligente led2 = new BombillaInteligente();
        //DEFINIMOS Y CREAMOS LOS DOS OBJETOS
        int NumVecesEncendida;
        
       led1.encender();
       led1.apagar();
       led1.encender();
       led1.apagar();
       led1.encender();
       led1.apagar();
       NumVecesEncendida=led1.obtieneNumVecesEncendida();
       System.out.println("Numero de veces encendida: " + led1.obtieneNumVecesEncendida());
       //EL LED1 SE HA ENCENDIDO Y APAGADO 3 VECES
       led2.encender();
       led2.apagar();
       NumVecesEncendida=led2.obtieneNumVecesEncendida();
       System.out.println("Numero de veces encenida: " + led2.obtieneNumVecesEncendida());
       //EL LED2 SE ENCIENDE Y APAGA 1 VEZ
       
       
       
             
       
              
    }
}

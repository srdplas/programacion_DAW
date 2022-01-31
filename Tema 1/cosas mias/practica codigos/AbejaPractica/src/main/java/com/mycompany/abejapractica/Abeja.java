
package com.mycompany.abejapractica;

public class Abeja {
    public int posicionX;
    public int posicionY;
    public int numCargasNectar;
    public boolean volando;

    public double peso;
    // Ahora viene el comportamiendo que va a tener
   public void cambiaPosicionX (int nuevaPosX){
       posicionX = nuevaPosX;
   }
   public void imprimePosicionX(){
       System.out.println("Posicion X: " + posicionX);
   }
   public void cambiaPosicionY (int nuevaPosY){
       posicionY = nuevaPosY;
   }
   public void imprimePosicionY(){
       System.out.println("Posicion Y: " + posicionY);
   }
   public void cambiaCargaNectar(int nuevaCarga){
       numCargasNectar = nuevaCarga;
   }
   public void imprimeCargaNectar(){
       System.out.println("Numero de cargas de néctar: " + numCargasNectar);
   }
   public void cambiaPeso (double nuevoPeso){
       peso = nuevoPeso;
   }
   public void imprimePeso(){
       System.out.println("Peso de la abeja: " + peso);
   }
   public void estadoVuelo(boolean EstadoVuelo){
       volando = EstadoVuelo;
   }
   public void imprimeEstadoVuelo(){
       System.out.println("Estado de Vuelo:" + volando);
   }
   public void vuela(){
       volando = true;
   }
   public void sePosa(){
       volando = false;
   }
   
   
   public static void main (String arg[]){
      Abeja maya = new Abeja();
       maya.posicionX = 0;
       maya.posicionY = 5;
       maya.numCargasNectar = 0;
       //Creamos el objeto de la clase abeja con nombre maya
       maya.vuela();
       //Ahora se va volando y se posa en otra posicion
       maya.imprimeEstadoVuelo();
       maya.cambiaPosicionX(4);
       maya.cambiaPosicionY(4);
       maya.sePosa();
       //Vemos de nuevo su estado actual
       maya.imprimePosicionX();
       maya.imprimePosicionY();
       maya.imprimeEstadoVuelo();
   }
}
    


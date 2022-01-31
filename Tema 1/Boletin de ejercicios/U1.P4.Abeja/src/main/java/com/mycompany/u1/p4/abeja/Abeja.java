package com.mycompany.u1.p4.abeja;

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
}
   

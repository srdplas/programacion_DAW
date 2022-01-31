package com.mycompany.u1.e1.abeja;

public class PruebaAbeja2 {
    public static void main(String[] args) {
        Abeja fede; //Definimos el objeto
        fede = new Abeja(); //Creamos el objeto fede de la clase Abeja
        //METODOS
        fede.vuela();
        fede.cambiaPosicionX(2);
        fede.cambiaPosicionY(0);
        fede.sePosa();
        fede.cambiaCargaNectar(1);
        //fede vuela y se mueve a la flog y aumenta la carga del nectar
        
        fede.vuela();
        fede.cambiaPosicionX(2);
        fede.cambiaPosicionY(2);
        fede.sePosa();
        fede.cambiaCargaNectar(2);
        
        //fede vuela de nuevo se mueve a la siguiente flog y aumenta nectar
        
        fede.vuela();
        fede.cambiaPosicionX(0);
        fede.cambiaPosicionY(2);
        fede.sePosa();
        fede.cambiaCargaNectar(3);
        //fede vuelve a volar y aumenta la carga del nectar
        fede.imprimePosicionX();
        fede.imprimePosicionY();
        fede.imprimeCargaNectar();
        fede.imprimeEstadoVuelo();
        //imprimimos los valores que tiene la Abeja fede al final
        
    }
}

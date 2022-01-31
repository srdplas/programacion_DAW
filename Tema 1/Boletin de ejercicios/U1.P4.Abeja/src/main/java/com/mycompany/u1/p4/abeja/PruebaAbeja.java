package com.mycompany.u1.p4.abeja;
 /* @author srdpl
 */
public class PruebaAbeja {
    public static void main(String[] args) {
        Abeja maya = new Abeja();
         //Creamos el objeto maya de la clase Abeja
        Abeja abejorro = new Abeja();
         //Creamos el objeto abejorro de la clase Abeja
       System.out.println("Valores Default maya");
        maya.imprimePosicionX();
        maya.imprimePosicionY();
        maya.estadoVuelo(true);
         //Caracteristicas del objeto maya de la clase abeja
         System.out.println("maya vuela y cambia de posicion");
         maya.vuela();
         maya.imprimeEstadoVuelo();
         maya.cambiaPosicionX(7);
         maya.cambiaPosicionY(3);
         //La abeja vuela y se mueve de posicion
         maya.imprimePosicionX();
         maya.imprimePosicionY();
        
         System.out.println("maya se posa");
         maya.sePosa();
         maya.imprimeEstadoVuelo();
         //Miramos de nuevo el estado actual de mayas
         System.out.println("EL Abejorro");
         //Ponemos el mensaje para que imprima El abejorro y diferenciar datos de los dos objetos
         abejorro.imprimePosicionX();
         abejorro.imprimePosicionY();
         abejorro.imprimeEstadoVuelo();
         //Imprimimos los valores de Abejorro
         abejorro.vuela();
         abejorro.cambiaPosicionX(22);
         abejorro.cambiaPosicionY(11);
         //El abejorro vuela y cambia de posicion
         
         abejorro.imprimePosicionX();
         abejorro.imprimePosicionY();
         abejorro.imprimeEstadoVuelo();
       
         
         
         
    }
}

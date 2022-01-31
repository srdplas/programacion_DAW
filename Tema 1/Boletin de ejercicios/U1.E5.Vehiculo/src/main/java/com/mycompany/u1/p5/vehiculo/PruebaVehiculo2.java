package com.mycompany.u1.p5.vehiculo;

public class PruebaVehiculo2 {
       
    public static void main(String[] args) {
       Vehiculo2 v1 = new Vehiculo2();
       Vehiculo2 v2 = new Vehiculo2();
       //DEFINIMOS  Y CREAMOS LOS OBJETOS V1 Y V 2
       v1.setNumRuedas(4);
       v1.setPotencia(100);
       v1.setConsumoPorKm(0.06);
       v1.reponerCombustible(30);
       v1.arrancar();
       v1.recorrerDistancia(100);
       v1.apagar();
       v1.arrancar();
       v1.recorrerDistancia(200);
       //IMPRIMIR
       v1.imprimeNumRuedas();
       v1.imprimePotencia();
       v1.imprimeConsumoPorKm();
       v1.imprimeLitrosEnDeposito();
       v1.imprimeKmRecorridos();
       v1.imprimeAutonomiaEnKm();
       
       //ACCIONES V2
       
       v2.setNumRuedas(2);
       v2.setPotencia(80);
       v2.setConsumoPorKm(0.02);
       v2.reponerCombustible(20);
       v2.arrancar();
       v2.recorrerDistancia(220);
       v2.apagar();
       v2.arrancar();
       v2.recorrerDistancia(120);
       //IMPRIMIR
       v2.imprimeNumRuedas();
       v2.imprimePotencia();
       v2.imprimeConsumoPorKm();
       v2.imprimeLitrosEnDeposito();
       v2.imprimeKmRecorridos();
       v2.imprimeAutonomiaEnKm();
     
       
       
    }
    
}

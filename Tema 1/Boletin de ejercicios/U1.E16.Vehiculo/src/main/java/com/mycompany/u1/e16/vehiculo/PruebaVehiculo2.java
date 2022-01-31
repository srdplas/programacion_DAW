package com.mycompany.u1.e16.vehiculo;

public class PruebaVehiculo2 {
       
    public static void main(String[] args) {
       Vehiculo2 v1 = new Vehiculo2();
       Vehiculo2 v2 = new Vehiculo2();
       //DEFINIMOS  Y CREAMOS LOS OBJETOS V1 Y V 2
       double desgaste;
       v1.setNumRuedas(4);
       v1.setPotencia(100);
       v1.setConsumoPor100Km(2);
       v1.reponerCombustible(75);
       v1.arrancar();
       v1.recorrerDistancia(200);
       v1.apagar();
       v1.arrancar();
       v1.reponerCombustible(300);
       
       v1.reponerCombustible(300);
       v1.reponerCombustible(300);
       v1.reponerCombustible(300);
       v1.calculaPorcentajeDesgaste();
       
       
       //IMPRIMIR
       System.out.println("Numero de ruedas del vehículo: " + v1.numRuedas);
       System.out.println("Potencia del vehículo " + v1.getPotencia() + " cv");
       System.out.println("Consumo de Litros a los 100 Km: " + v1.getConsumoPor100Km() + " litros");
       System.out.println("Deposito del vehículo " + v1.getLitrosEnDeposito() + " litros");
       System.out.println("El porcentaje de desgaste del motor es " + v1.calculaPorcentajeDesgaste() + " %");
       
       
     
       
       
    }
    
}

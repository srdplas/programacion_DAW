package com.mycompany.u1.p5.vehiculo;

public class CochePrueba {
    public static void main(String[] args) {
        Vehiculo bmw = new Vehiculo(); //DEFINIMOS Y CREAMOS EL OBJETO BMW DE LA CLASE VEHICULO
           bmw.imprimeNumRuedas();
           bmw.imprimeConsumoPorKm();
           bmw.imprimePotencia();
           bmw.imprimeLitrosEnDeposito();
            bmw.imprimeAutonomiaEnKm();
           
           //IMPRIMIMOS LOS VALORES DEL BMW
           System.out.println("Le damos valores al BMW");
           bmw.setNumRuedas(4);
           bmw.setPotencia(250);
           bmw.setConsumoPorKm(20);
           bmw.reponerCombustible(150);
           bmw.imprimeNumRuedas();
           bmw.imprimeConsumoPorKm();
           bmw.imprimePotencia();
           bmw.imprimeLitrosEnDeposito();
           bmw.imprimeAutonomiaEnKm();
           
           bmw.arrancar();
           System.out.println("Arrancamos y recorremos 4km");
           bmw.recorrerDistancia(4);
           bmw.imprimeLitrosEnDeposito();
           bmw.apagar();
           bmw.imprimeAutonomiaEnKm();
           bmw.recorrerDistancia(3);
           bmw.imprimeLitrosEnDeposito();
           bmw.reponerCombustible(150);
           bmw.imprimeAutonomiaEnKm();
           
           
    }
}

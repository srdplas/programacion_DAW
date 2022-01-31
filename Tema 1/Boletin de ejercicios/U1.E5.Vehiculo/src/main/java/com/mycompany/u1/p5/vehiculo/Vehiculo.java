package com.mycompany.u1.p5.vehiculo;

public class Vehiculo {
    public int numRuedas;
    public double potencia, consumoPorKm, litrosEnDeposito;
    public boolean arrancado;
    //CREAMOS LAS CARACTERISTICAS DE LA CLASE VEHICULO
    
    public void setNumRuedas(int nuevoNumRuedas){
        numRuedas = nuevoNumRuedas;
    } //METODO PARA CAMBIAR EL NUMERO DE RUEDAS
    public void imprimeNumRuedas(){
        System.out.println("Numero de ruedas del vehículo: " + numRuedas);
    } //METODO PARA IMPRIMIR EL NUMERO DE RUEDAS
    public void setPotencia(double nuevaPotencia){
        potencia = nuevaPotencia;
    } //METODO PARA CAMBIAR LA POTENCIA
    public void imprimePotencia(){
        System.out.println("Potencia del vehículo" + potencia);
    } //METODO PARA IMPRIMIR LA POTENCIA
    
    //2º Espiral
    public void setConsumoPorKm(double nuevoConsumoPorKm){
        consumoPorKm = nuevoConsumoPorKm;
        
    } //VARIABLE PARA APLICAR EL CONSUMO POR KM
    public void imprimeConsumoPorKm(){
        System.out.println("Consumo de Litros por Km: " + consumoPorKm);
    } //METODO QUE IMPRIME EL CONSUMO POR KM
    public void reponerCombustible(double numLitrosRepuesto){
        litrosEnDeposito = litrosEnDeposito + numLitrosRepuesto;
        System.out.println("Se ha repuesto: " + numLitrosRepuesto);
    } //METODO QUE CAMBIA EL NUMERO DE LITROS DEL DEPOSITO
    public void imprimeLitrosEnDeposito(){
        System.out.println("Deposito del vehículo " + litrosEnDeposito);
    } //METODO PARA IMPRIMIR LOS LITROS DEL DEPOSITO
    public void recorrerDistancia(double numKm){
        litrosEnDeposito = litrosEnDeposito - (numKm * consumoPorKm);
    }
    
    public void arrancar (){
        arrancado = true;
    } //METODO PARA ARRANCAR EL COCHE
    public void apagar(){
        arrancado = false;
    } //METODO PARA APAGAR EL COCHE
    
    public void imprimeAutonomiaEnKm(){
        double autonomia = (litrosEnDeposito / consumoPorKm);
        System.out.println("El vehiculo consume: " + consumoPorKm + " l/km" + " tiene: " + litrosEnDeposito + " litros en el deposito " + " y puede recorrer " + autonomia + "km");
    }
}

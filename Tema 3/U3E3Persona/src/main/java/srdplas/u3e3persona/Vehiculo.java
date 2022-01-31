/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srdplas.u3e3persona;

public class Vehiculo {
    public int numRuedas;
    public double potencia, consumoPor100Km, litrosEnDeposito, kmRecorridos;
    public boolean arrancado;
    //CREAMOS LAS CARACTERISTICAS DE LA CLASE VEHICULO
    
    public void setNumRuedas(int nuevoNumRuedas){
        numRuedas = nuevoNumRuedas;
    } //METODO PARA CAMBIAR EL NUMERO DE RUEDAS
    public int getNumRuedas(){
        return numRuedas;
    } //METODO PARA IMPRIMIR EL NUMERO DE RUEDAS
    public void setPotencia(double nuevaPotencia){
        potencia = nuevaPotencia;
    } //METODO PARA CAMBIAR LA POTENCIA
    public double getPotencia(){
        return potencia;
    } //METODO PARA IMPRIMIR LA POTENCIA
    
    //2º Espiral
    public void setConsumoPor100Km(double nuevoConsumoPor100Km){
             
            consumoPor100Km = nuevoConsumoPor100Km;
        
    } //VARIABLE PARA APLICAR EL CONSUMO POR KM
    public double getConsumoPor100Km(){
        double consumoKM;
        consumoKM = consumoPor100Km /100;
        return consumoKM;
    } //METODO QUE IMPRIME EL CONSUMO POR KM
    public void reponerCombustible(double numLitrosRepuesto){
        litrosEnDeposito = litrosEnDeposito + numLitrosRepuesto;
    } //METODO QUE CAMBIA EL NUMERO DE LITROS DEL DEPOSITO
    public double getLitrosEnDeposito(){
        return litrosEnDeposito;
    } //METODO PARA IMPRIMIR LOS LITROS DEL DEPOSITO
    public void recorrerDistancia(double numKm){
        litrosEnDeposito = litrosEnDeposito - (numKm * consumoPor100Km);
        kmRecorridos += numKm;
    } //MEOTOD PARA RECORRER DISTANCIA DISMINUIR DEPOSITO
    
    public void arrancar (){
        arrancado = true;
    } //METODO PARA ARRANCAR EL COCHE
    public void apagar(){
        arrancado = false;
    } //METODO PARA APAGAR EL COCHE
    
    /*public void getAutonomiaEnKm(){
        double autonomia = (litrosEnDeposito / consumoPorKm);
        System.out.println("El vehiculo consume: " + consumoPorKm + " l/km" + " tiene: " + litrosEnDeposito + " litros en el deposito " + " y puede recorrer " + autonomia + "km");
    }*/
     
    public double calculaPorcentajeDesgaste(){
      double maxDesgaste, desgaste;
        maxDesgaste = (200000/100);
        desgaste = kmRecorridos / maxDesgaste;
        return desgaste;
    }
    
}


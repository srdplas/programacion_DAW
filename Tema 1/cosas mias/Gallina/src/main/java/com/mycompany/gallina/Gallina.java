package com.mycompany.gallina;

public class Gallina {
    public String nombre;
    public double peso;
    public String color;
    public int edad;
    public int numHuevos;
    public boolean duerme;
    //CARACTERISSTICAS DE LA CLASE GALLINA
    public void cambiaNombre(String nuevoNombre){
        nombre = nuevoNombre;
    } //METODO PARA CAMBIAR EL NOMBRE
    public void imprimeNombre(){
        System.out.println("Nombre de la Gallina:" +nombre);
    }//METODO PARA IMPRIMMIR EL NOMBRE
    public void cambiaPeso(double nuevoPeso){
        peso = nuevoPeso;
    } //METODO PARA CAMBIAR EL PESO
    public void imprimePeso(){
        System.out.println("El peso de la gallina es: " + peso + " Kg");
    } //METOODO PARA IMPRIMIR PESO
    public void cambiaColor(String nuevoColor){
        color = nuevoColor;
    } //METODO PARA CAMBIAR COLOR
    public void imprimeColor(){
        System.out.println("El color de la gallina es: " + color);
    } //METODO PARA IMPRIMIR COLOR
    public void cambiaEdad(int nuevaEdad){
        edad = nuevaEdad;
    } //METODO PARA CAMBIAR EDAD
    public void imprimeEdad(){
        System.out.println("La gallina tiene "+ edad + " Años");
    } //METODO PARA IMPRIMIR EDAD
    public void poneHuevos(int nuevoNumHuevos){
        numHuevos = nuevoNumHuevos;
    } //METODO PARA CAMBIAR EL NUMERO DE HUEVOS
    public void imprimeCantidadHuevos(){
        System.out.println("Numeros de huevos puestos: "+ numHuevos);
    } //METODO PARA IMRPIMIR LA CANTIDAD DE HUEVOS
    public void seDespierta(){
        duerme = false;
    } //METODO PARA QUE EL VALOR DE DUERME SEA FALSE
    public void seDuerme(){
        duerme = true;
    } //METODO PARA QUE EL VALOR DE DUERME SEA TRUE
    public void estadoGallina(){
        System.out.println("La gallina esta dormida?: " + duerme);
    }
}

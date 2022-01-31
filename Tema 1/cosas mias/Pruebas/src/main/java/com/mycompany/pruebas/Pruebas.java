package com.mycompany.pruebas;

public class Pruebas {
    //se pueden poner los atributos en una misma linea si es del mismo tipo
    /*
    public int edad, numCoche;
    public String nombre, apellido1, apellido2;
    */
    public double longitudLado1, longitudLado2, longitudLado3;
    public double calculaPerimitetro(){
        double perimetro; //Variable para hacer el permitetro
        perimetro = longitudLado1 + longitudLado2 + longitudLado3;
        return perimetro;
    }
    
}

package com.mycompany.u1.e3.triangulo;

public class Triangulo {
    public double tamLado1;
    public double tamLado2;
    public double tamLado3;
    // Cramos las caracteristicas de la clase Triangulo
    
    public void cambiaLado1(double nuevoTamanio){
        tamLado1 = nuevoTamanio;
    }
    //METODO PARA CAMBIAR EL LADO 1
   public void cambiaLado2 (double nuevoTamanio){
       tamLado2 = nuevoTamanio;
   }
   //METODO PARA CAMBIAR EL LADO 2
   public void  cambiaLado3 (double nuevoTamanio){
       tamLado3 = nuevoTamanio;
   }
   //METODO PARA CAMBIAR EL LADO 3
   public void imprimePerimetro(){
       System.out.println("El perimetro del triangulo es " +(tamLado1 + tamLado2 + tamLado3));
   }
   public void imprimeDescricpion (){
       System.out.println("Soy un triangulo y el tamaño de mis lados es " + " Lado1=" + tamLado1 + ", Lado2=" + tamLado2 + ", Lado=" +tamLado3);
   }
   public double calculaPerimetroVariable(){
       double perimetro;
       perimetro = tamLado1 + tamLado2 + tamLado3;
       return perimetro;  
   }
}

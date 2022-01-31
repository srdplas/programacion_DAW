package com.mycompany.u1.e3.triangulo;

public class PruebaTriangulo {
    public static void main(String[] args) {
        double varPerimetro;
        Triangulo trian; //Definimos el objeto triangulo
        trian = new Triangulo(); //Creamos el objeto triangulo
        //Ponemos los metodos al objeto
        trian.cambiaLado1(23.32);
        trian.cambiaLado2(12.21);
        trian.cambiaLado3(44.34);
       
        trian.imprimePerimetro();
        trian.imprimeDescricpion();
         //llamar al metodo para calcular perimetro
        varPerimetro=trian.calculaPerimetroVariable();
        System.out.println("Perimetro con variable " + varPerimetro);
        //imprimimos la variable perimetro
        
    }
}

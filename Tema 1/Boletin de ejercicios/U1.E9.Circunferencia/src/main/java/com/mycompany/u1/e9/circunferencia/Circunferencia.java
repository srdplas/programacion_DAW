
package com.mycompany.u1.e9.circunferencia;

public class Circunferencia {
    public double radio;
    
    public void estableceRadio(double nuevoRadio){
        radio = nuevoRadio;
    }
    public double calculaPerimetro (){
        double perimetro;
        perimetro = 2 * Math.PI * radio;
        System.out.println("El perimetro es: " + perimetro);
        return perimetro;
    }
    
    public double calculaSuperficie(){
        double superficie;
        double elevado = Math.pow (radio,2);
        superficie = Math.PI * elevado;
        return superficie;
    }
}

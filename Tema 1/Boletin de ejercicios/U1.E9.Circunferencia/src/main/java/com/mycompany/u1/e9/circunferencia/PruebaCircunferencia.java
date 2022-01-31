package com.mycompany.u1.e9.circunferencia;

public class PruebaCircunferencia {
    public static void main(String[] args) {
       Circunferencia c1 = new Circunferencia(); //DECLARAMOS Y CREAMOS EL OBJETO C1
       double superficie;
       
       c1.estableceRadio(4);
       c1.calculaPerimetro();
       superficie=c1.calculaSuperficie();
       System.out.println("La superficie de la circunferencia es " + c1.calculaSuperficie());
       //PODEMOS IMPRIMIR DE ESTA FORMA SIN TENER QUE HACER EL SUPERFICIE=C1.CALCULAPERIMETRO.
       
               
    }
    
}

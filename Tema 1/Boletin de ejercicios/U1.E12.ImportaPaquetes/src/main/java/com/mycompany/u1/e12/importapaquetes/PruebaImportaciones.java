package com.mycompany.u1.e12.importapaquetes;
import figuras.Circulo;
import figuras.Triangulo;
import lineas.Curva;
import lineas.Rectas;
        
public class PruebaImportaciones {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Triangulo t1 = new Triangulo();
        Curva cur1 = new Curva();
        Rectas r1 = new Rectas();
        //CREAMOS Y DEFINIMOS LOS 4 OBJETOS DE LAS CLASES IMPORTADAS
        c1.quienSoy();
        t1.quienSoy();
        cur1.quienSoy();
        r1.quienSoy();
        
        //LLAMAMOS AL METODO PARA QUE IMPRIMA UN TEXTO DEPENDIENDO DE LA CLASE
    }
}

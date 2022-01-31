package com.mycompany.u1.e15.factura;
import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int IVA = 21;
        double precio;
        int numPen;
        double resultadoSinIva, resultadoConIva;
       //CREAMOS EL OBJETO SCANNER Y VARIAS VARIABLES PARA GUARDAR LECTURA TECLADO
        System.out.println("Dime el precio de un pen-drive.");
        precio = scan.nextDouble();
        //METODO PARA LEER TECLADO Y GUARDAR RESULTADO EN VARIABLE PRECIO
        
        System.out.println("Dime el numero de pen-drives que quieres comprar.");
        numPen = scan.nextInt();
        
        //METODO PARA LEER TECLADO Y GUARDAR RESULTADO VARIABLE NUMPEN
        
        System.out.println("FACTURA JAMAZON");
        System.out.println("Precio unitario: " + precio + " €");
        System.out.println("Numero de articulos: " + numPen);
        resultadoSinIva = numPen * precio;
        //INDICAMOS EL RESULTADO SIN EL IVA
        System.out.println("Subtotal: " + resultadoSinIva + " €");
        System.out.println("----------------------------------------");
        resultadoConIva = ((IVA * resultadoSinIva)/100)+ resultadoSinIva;
        //INDICAMOS EL RESULTADOCONIVA ES EL 21% DEL RESULTADOSINIVA Y SUMADO A ESTE DE NUEVO
        System.out.println("Total (IVA incluido): " + resultadoConIva + " €");
    

    }
}
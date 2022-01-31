package com.mycompany.u1.e14.expresiones;
import java.util.Scanner;

public class PruebaExpresiones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c, d, resultado;
        //creamos el objeto scanner, que lea teclado y 4 variables reales
        
        System.out.println("Dame el numero a");
        a = scan.nextDouble();
        
        System.out.println("Dame el numero b");
        b = scan.nextDouble();
        
        System.out.println("Dame el numero c");
        c = scan.nextDouble();
        
        System.out.println("Dame el numero d");
        d = scan.nextDouble();
        //metodos para introducir por teclado valores a las variables a, b, c, d
        resultado = (a + b*38)/(c*d);
        System.out.println("El resultado de la Primera Operacion " + resultado);
        //Operacion e imprimimos resultado con valores introducidos por teclado
        
        resultado = a +((30-b)/(c+d));
        System.out.println("El resultado de la Segunda Operacion " + resultado);
        
        resultado = (b*a)*((a+b)/(b/d));
        System.out.println("El resultado de la Tercera Operacion " + resultado);
        
        resultado = ((a+50)/b)/(c/(4+d));
        System.out.println("El resultado de la cuarta operacion " + resultado);
    }
           
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srdplas.u2e34triangulo;

import java.util.Scanner;

/**
 *
 * @author srdpl
 */
public class PruebaDibujoTriangulo {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int size;
        
        System.out.println("Indica el tamaño del triangulo 5-30");
        size=sn.nextInt();
        System.out.println("Indica el numero de triangulos");
        int numero=sn.nextInt();
        
       for(int y=0; y<numero; y++){
       for(int i=0; i<size;i++){
           
           for(int x=0;x<=i;x++){
               System.out.print("*");
           }
           System.out.println("");
       }
       }  
           
           
           
       
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srdplas.u2e15.rima;
import java.util.Scanner;
/**
 *
 * @author srdplas
 */
public class Rimas {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int numero;
        
        System.out.println("Dime un Numero del 1 al 5");
        numero=sn.nextInt();
        
        if (numero==1){
            System.out.println("Que no pare ninguno");
        }else{
            if(numero==2){
                System.out.println("Estamos aburridos");
        }else {
                if(numero==3){
                    System.out.println("Te pongo la cabeza del revés");
                }else {
                    if(numero==4){
                        System.out.println("Callate un rato");
                    }else {
                        if(numero==5){
                            System.out.println("Por el culo de la hinco");
                        }else System.out.println("No se ninguna rima con el numero "+numero);
                    }
                }
            }
    }
        
    }
}

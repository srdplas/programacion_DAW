
package es.iessoterhernandez.daw.endes.retoarrays;

import java.util.Scanner;

/**
 *
 * @author srdplas
 */
public class RetoArrays {
    public static void main(String[] args) {
        int opcion;
       
        
        Scanner sn = new Scanner(System.in);
        int retoArray []= new int [10];
               
              
              
            do{  
                    
                    System.out.println("MENU DEMO ARRAY");
                    System.out.println("0 - Salir del Programa");
                    System.out.println("1 - Ver contenido del Array");
                    System.out.println("2 - Introducir un numero en el Array");
                    System.out.println("3 - Poner todo a ceros");
                    System.out.println("4 - Rellenar con numeros Aleatorios del 0-9");
                    System.out.println("Escoje una opción");
                    opcion=sn.nextInt();
                
                
                
                
                if(opcion>4){
                  System.out.println("Error Opcion no valida Introduce una opcion correcta");
                  
              }else{
                
                switch(opcion){
                    case 0: System.out.println("Saliendo...");
                        break;
                    case 1: System.out.println("Ver contenido del Array");
                        System.out.printf("%-12s%2s%n", "POSICION", "CONTENIDO");
                       
                        for(int i=0; i<retoArray.length; i++){
                            System.out.printf("%8d%6d%n", i, retoArray[i]); 
                        }
                        break;

                    case 2: System.out.println("Escribe el numero a introducir en el array");
                            int num=sn.nextInt();
                            
                            System.out.println("¿En que posicion quieres guardarlo?");
                            int posicion=sn.nextInt();
                            
                            while(!(posicion<=retoArray.length)){
                                if(posicion>retoArray.length){
                                    System.out.println("Error Opcion Invalida elige de nuevo");
                                    posicion=sn.nextInt();
                                } 
                            }
                                     retoArray[posicion]=num;
                        break;

                    case 3: System.out.println("Todos los valores del array a 0");
                            for(int i=0;i<retoArray.length;i++){
                                retoArray[i]=0;
                            }
                     break;


                    case 4: System.out.println("rellenar con numeros aleatorios");
                             for(int i=0; i<retoArray.length; i++){
                                 retoArray[i]= (int)(Math.random()*9+1);
                                 
                             }
                        break;    
                } 
                }
            }while(opcion!=0);
          
    }
}

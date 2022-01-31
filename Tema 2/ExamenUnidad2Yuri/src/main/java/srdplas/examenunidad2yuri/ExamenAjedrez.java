
package srdplas.examenunidad2yuri;
import java.util.*;
/**
 *
 * @author srdpl
 */
public class ExamenAjedrez {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir=false;
         String jugada;
         int found=-1;
         String ajedrez[] = {"A2a4", "H7h5", "D2d4", "H5h3", "F1g3", "G8f6", "B2b4", "A7a5", "C2c4", "D5d3", 
        "A1a3", "H8g6", "C2c4", "A5a3", "D1h3", "A8f8", "B2h2", "A7f3", "C2g6", "F5b3", 
        "G2f4", "H7c5", "A2f4", "H3h8", "A1g3", "A5f6", "C7b4", "C4b5", "B4d5", "G5h3"};
        //Iniciamos el Array con las jugadas directamente con su contenido.
        
        
        
        do{
            System.out.println("");
            System.out.println("MENU");
            System.out.println("0 - Salir");
            System.out.println("1 - Mostrar movimientos de las blancas");
            System.out.println("2 - Mostrar movimientos de las negras");
            System.out.println("3 - Mostrar todos los movimientos");
            System.out.println("4 - Buscar movimientos");
            System.out.println("Selecciona una opcion");
            int opcion=sn.nextInt();
            if(!(opcion<=4)){
                System.out.println("Opcion incorrecta");
                //Comprobamos si la opcion elegida es correcta
            }
            
            switch(opcion){
                case 0:System.out.println("Adios");
                    salir=true;
                    break;
                    
                    
                case 1: System.out.println("Comienzo de los movimientos de las blancas");
                    
                    for(int i=0; i<ajedrez.length; i+=2){ //Muestra el resultado de las blancas de las posiciones pares del array
                        System.out.print(" "+ajedrez[i]+" ");
                        
                    }
                    System.out.println("");
                    System.out.println("Fin de los movimientos de las blancas");
                    break;
                case 2: System.out.println("Comienzo de los movimientos de las negras");
                    
                    for(int i=1; i<ajedrez.length; i+=2){ //Muestra el resultado de las negras de las posiciones impares del array
                        System.out.print(" "+ajedrez[i]+" ");
                    }
                    System.out.println("");
                    System.out.println("Fin de los movimientos de las negras");
                    break;
                    
                case 3: System.out.println("Movimientos de la partida");
                   
                    for(int i=0; i<ajedrez.length; i++){
                        if(i%2==0){
                        System.out.println(i+"- Blancas - "+ajedrez[i]);
                        }else{
                            if(i%2==1){
                            System.out.println(i+"- Negras - "+ajedrez[i]);
                            }
                            //Imprime todo el contenido del array, dependiendo si la posicion es par o impar dirá el valor y blanca o negras
                    }}
                    break;
                case 4: System.out.println("¿Que movimiento quieres buscar?");
                    sn.nextLine();
                    jugada=sn.nextLine();
                    //Buscamos un movimiento en el contenido del Array
                   
                    for(int i=0; i<ajedrez.length;i++){
                        if(jugada.equalsIgnoreCase(ajedrez[i])){
                            System.out.print("Movimiento Econtrado en la posicion: "+i);
                            if(i%2==0){
                                System.out.println(" correspondiente a las piezas blancas");
                            }else{
                                if(i%2==1){
                                System.out.println(" correspondiente a las piezas negras");
                            }}
                            found=0;
                            break;
                            //Busca el movimiento en el array ignorando si el usuario lo ha escrito en mayusculas o minusculas
                            //Si el resultado es par o impar se añadirá al mensaje anterior si es de una pieza blanca o negra
                        }
                    }
                    if(found==-1){
                        System.out.println("Movimiento no encontrado");
                    }//Si la variable found es -1 significará que no ha encontrado ese movimiento    
         }
        }while(!salir);
        
        
        
        
        
        
        
        
        
           
    }
}

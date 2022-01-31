package srdplas.u2e21.bombilla;
import java.util.Scanner;
/**
 *
 * @author srdplas
 */
public class PruebaBombillaCondiconal2 {
    public static void main(String[] args) {
        BombillaCondicional bc = new BombillaCondicional();
        Scanner sn = new Scanner(System.in);
        int numVeces;
        int opcion;
        do {
        System.out.println("MENU DE OPCIONES");
        System.out.println("0 - SALIR");
        System.out.println("1 - Enciende");
        System.out.println("2 - Apaga");
        System.out.println("3 - Imprime Estado");
        System.out.println("4 - Crea una nueva combilla");
        System.out.println("Escoge una opción");
        opcion=sn.nextInt();
        
        switch(opcion){
        case 0:System.out.println("Saliendoo");
            break;
            case 1: 
                System.out.println("Encendiendo");
                bc.encender();
                break;
            case 2: 
                System.out.println("Apagando");
                bc.apagar();
            case 3: 
                bc.imprimeEstado();
                break;    
            case 4:
                System.out.println("Creando Nueva bombilla");
                bc = new BombillaCondicional();
               
                break;
        
        }
        }while(opcion!=0);
        
    }
}

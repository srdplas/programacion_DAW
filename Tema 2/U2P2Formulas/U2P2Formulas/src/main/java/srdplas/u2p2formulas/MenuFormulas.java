package srdplas.u2p2formulas;
import java.util.Scanner;
/**
 *
 * @author srdpl
 */
public class MenuFormulas {
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a=10;
        int b=8;
        int c=2;
        int d=2;
        int opcion;
        //Variables con sus respectivos valores asignados en la prueba
        
        System.out.println("1 - Calcula la formula 1 usando la división entre enteros");
        System.out.println("2 - Calcula la fomrula 1 usando la división entre numeros reales");
        System.out.println("3 - Calcula la formula 2 usando la división entre enteros");
        System.out.println("4 - Calcula la formula 2 usando la división entre numeros reales");
        System.out.println("Elige una opción");
        opcion=sn.nextInt();
        //Menu de opciones
        switch(opcion){
            case 1: //Formula 1 división entre enteros
                int formula1= a+((30-b)/(c+d));
                System.out.println("El resultado del calculo es "+formula1);
                break;
            case 2: //Formula 1 division forzando que el resultado sea un numero real
                double formula1Real= (double)(a+((30-b)/(c+d)));
                System.out.println("El resultado del calculo es "+formula1Real);
                break;
            case 3: //Formula 2 división entre enteros
                int formula2=(a+b*38)/(c*d);
                System.out.println("El resultado del calculo es "+formula2);
                break;
            case 4: //Formula 2 forzando que el resultado sea un numero real
                double formula2Real=(double)(a+b*38)/(c*d);
                System.out.println("El resultado del calculo es "+formula2Real);
                break;
              
            default: //Mostrará Opción Incorrecta si no es niguno de los valores anteriores
                System.out.println("Opción Incorrecta");
            break;
                
        }
              
    }
    
    
}

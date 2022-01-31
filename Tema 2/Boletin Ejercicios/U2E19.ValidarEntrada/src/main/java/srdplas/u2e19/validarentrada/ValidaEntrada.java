package srdplas.u2e19.validarentrada;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author srdpl
 */
public class ValidaEntrada {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in).useLocale(Locale.UK);
        int numero1, mayorCero, menorIgualCero;
        double numero2, realRango;
        boolean bucle1=false;
        String caracter;
        
        do {
            System.out.println("Introduce un numero mayor estricto que 0");
            mayorCero=sn.nextInt();
            if(mayorCero>0){
           }else System.out.println("Error El numero debe ser mayor a 0");
        }while(!(mayorCero>0));
        
        do {
            System.out.println("Introduce un numero menor igual a 0");
            menorIgualCero=sn.nextInt();
            if(menorIgualCero<=0){
            }else System.out.println("Error EL numero debe ser mejor o igual que 0");
        }while(!(menorIgualCero<=0));
        
        do{
            System.out.println("Introduce un numero comprendido entre el 1.3 y el 19.8");
            realRango=sn.nextDouble();
            sn.nextLine();
            if(realRango>=1.3&&realRango<=19.8){
           }else System.out.println("Error el numero debe estar entre el 1.3 y el 19.8");
        }while(!(realRango>=1.3&&realRango<=19.8));
        
        do{
            System.out.println("Introduce un caracter debe ser S o N");          
            caracter=sn.nextLine();
            if(!("S".equals(caracter)||"N".equals(caracter))){
               System.out.println("Error El caracter solo puede ser S o N");
            }
            
        }while(!("S".equals(caracter)||"N".equals(caracter)));
        
        System.out.println("Valores introducidos:"+menorIgualCero+" , "+mayorCero+" , "+realRango+" y "+caracter);
      
        
    }
}

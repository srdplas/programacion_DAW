
package srdplas.u2e17.cuentas;
import java.util.Scanner;
/**
 *
 * @author srdplas
 */
public class Cuentas {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int numero1, numero2;
        String operacion;
        System.out.println("Dime el operador a aplicar");
        operacion=sn.nextLine();
        System.out.println("Dime el primer numero");
        numero1=sn.nextInt();
        System.out.println("Dime el segundo numero");
        numero2=sn.nextInt();
        
        
        
        if("+".equals(operacion)){
            int suma;
            suma = numero1 + numero2;
            System.out.println("Resultado de  "+numero1+" + "+numero2+" es: "+suma);
        }else{
            if("-".equals(operacion)){
                int resta;
                resta= numero1 - numero2;
               System.out.println("Resultado de  "+numero1+" - "+numero2+" es: "+resta);
            }else{
            if("*".equals(operacion)){
                int multipli;
                multipli= numero1 * numero2;
               System.out.println("Resultado de  "+numero1+" * "+numero2+" es: "+multipli);
            }else
                if("/".equals(operacion)){
                int divi;
                divi= numero1 / numero2;
               System.out.println("Resultado de  "+numero1+" / "+numero2+" es: "+divi);
            }else System.out.println("Operacion invalida");
        }
    }
    }
}

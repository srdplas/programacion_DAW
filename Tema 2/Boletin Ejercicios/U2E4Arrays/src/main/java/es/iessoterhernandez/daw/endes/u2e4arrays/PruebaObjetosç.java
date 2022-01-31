
package es.iessoterhernandez.daw.endes.u2e4arrays;

import java.util.Scanner;

/**
 *
 * @author srdplas
 */
public class PruebaObjetosç {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String matriculas[] = {"5432-FNT", "9823-TRH", "3451-LPU", "1937-YHN", "8474-PMG", "8183-TGF", "0293-SDR"};
        boolean find= false;
        System.out.println("Dime la matricula del coche");
        String coche=sn.nextLine();
        
        for(String buscar:matriculas){
        if(buscar.equals(coche)){
            System.out.println("LLama a la Poli rapidooo!!!");
            find=true;
        }
    }if(find==false){
        System.out.println("Matricula no encontrada");
    }
        
    }
}

package srdplas.e13;
import java.util.*;
public class PruebaLoteria {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Set<Integer> numeros= new HashSet<Integer>();
		Iterator iterador;
		System.out.println("GORDO DE NAVIDAD");
		System.out.println("Introduce los numeros de la loteria vendidos");
		Integer loteria;
//		Integer objetoInteger = new Integer(loteria);
		
		do{
			loteria =sn.nextInt();
			
			if(loteria!=-1&&loteria>=0) {

				numeros.add(loteria);
			}
			
			
		}while(loteria!=-1);
		
		System.out.println("Ahora indica el numero del Gordo de Navidad");
		int gordo=sn.nextInt();
		Integer integerGordo = new Integer(gordo);
		
		iterador=numeros.iterator();
		int aux=-1;
		
		while(iterador.hasNext()) {
			
			Integer leer = (Integer)(iterador.next());
			
			if(leer==integerGordo){
				System.out.println("Numero del gordo ha sido vendido en esta sucursal");
				aux=0;
			}
		}
		
		if(aux==-1) {
			System.out.println("EL Gordo no ha sido vendido en esta sucursal");
		}

	}

}

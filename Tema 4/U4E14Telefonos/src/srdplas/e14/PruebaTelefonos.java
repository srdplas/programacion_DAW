package srdplas.e14;

import java.util.HashSet;
import java.util.*;

public class PruebaTelefonos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Set<Integer> permitidos = new HashSet<Integer>();
		Set<Integer> prohibidos = new HashSet<Integer>();

		System.out.println("Introduce los numeros de telefonos permitidos");
		int tel;

		do {
			tel = sn.nextInt();

			if (tel > 0) {
				permitidos.add(tel);
			}

		} while (tel > 0 && tel != 0);

		System.out.println("Introduce los numeros de telefonos bloqueados");

		do {
			tel = sn.nextInt();

			if (tel > 0) {
				prohibidos.add(tel);
			}

		} while (tel > 0 && tel != 0);

		System.out.println("Realizamos 3 llamadas al Usuario");

		
		
		for(int i=0; i<3;i++) {
			System.out.println("Desde que numero te estan llamando?");
			tel=sn.nextInt();
			
			if (permitidos.contains(tel)) 
				System.out.println("El "+tel+" ESTA PERMITIDO, puedes atender la llamada");
			else if(prohibidos.contains(tel))
				System.out.println("El "+tel+" ESTA PROHIBIDO, cuelga");
			else System.out.println("El "+tel+" no es un numero conocido, haz lo que creas");
			
			
		}

	}

}

package srdplas.prog.e4;

import java.util.*;

public class NombreDePerros {

	public static void main(String[] args) {
		List<String> nombres = new ArrayList<String>();
		
		Scanner sn = new Scanner(System.in);
		//A�adimos los nombres
		nombres.add("Toby");
		nombres.add("Rocky");
		nombres.add("Max");
		nombres.add("Pancho");
		nombres.add("Coco");
		nombres.add("Chispa");
		
		
		
		System.out.println("Actualmente conozco "+nombres.size()+" Te los digo");
		Iterator<String> recorre = nombres.iterator();
		while(recorre.hasNext()) {
			String perros = (String)(recorre.next());
			System.out.println(perros);
		}
		
		System.out.println("Tambien puedo decirtelos ordenados de forma alfabeticamente");
		Collections.sort(nombres);
		recorre = nombres.iterator();
		while(recorre.hasNext()) {
			String perros = (String) (recorre.next());
			System.out.println(perros);
		}
		
		System.out.println("Ense�anos mas nombres de perros");
		String indica;

		do {
			
			indica=sn.nextLine();
			
			if(!("FIN".equalsIgnoreCase(indica))) {
				nombres.add(indica);
			}
			
		}while(!("FIN".equalsIgnoreCase(indica)));
		
		System.out.println("Gracias ahora conozco "+nombres.size()+" Te los digo de forma ordenada");
		
		Collections.sort(nombres);
		recorre= nombres.iterator();
		while(recorre.hasNext()) {
			String perros = (String)(recorre.next().toLowerCase());
			System.out.println(perros);
		}
		
	}

}

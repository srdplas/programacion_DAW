package srdplas.e7;

import java.util.*;

public class PruebaOrdenPersonas {

	@SuppressWarnings({ "unused", "unchecked" })
	public static void main(String[] args) {
		List<Persona> personas = new ArrayList<Persona>();
		
		Persona p =new Persona("Pepe", "2987F", 17);
		Persona p2 =new Persona("Fran", "2792V", 50);
		Persona p3 =new Persona("Antonio", "1234A", 40);
		Persona p4 =new Persona("Antonio", "1234B", 10);
		personas.add(p);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		
		Iterator<Persona> leer = personas.iterator();
		
		while(leer.hasNext()) {
			Persona look = (Persona)(leer.next());
			System.out.println(look);
		
		}
		
		Collections.sort(personas);
		System.out.println("\n"+"Ordenamos la lista");
		leer=personas.iterator();
		while(leer.hasNext()) {
			Persona look = (Persona)(leer.next());
			System.out.println(look);
		}
		
		//Si queremos cambiar el orden ponemos en el metodo compareTo cambiamos el mayor por menor
	}

}

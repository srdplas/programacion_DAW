package srdplas.e15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PruebaSetPersona {

	public static void main(String[] args) {
		
		Persona p = new Persona("1234A", "Yuri", "Zayas", "Calle Cast", 18, 12584, false, true);
		Persona p2 = new Persona("2234B", "Carlos", "Vega", "Calle vespa", 32, 22335, true, true);
		Persona p3 = new Persona("1234A", "Antonio", "ROdriguez", "Calle portero", 18, 34568, true, true);
		
		System.out.println("Imprimimos los 3 metodos hasCode");
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		//Dos de ellos son iguales porque tienen el mismo DNI
		
		Set<Persona>conjunto= new HashSet<Persona>();
		conjunto.add(p);
		conjunto.add(p2);
		conjunto.add(p3);
		
		Iterator<Persona>iterador=conjunto.iterator();
		
		while(iterador.hasNext()) {
			Persona leer = (Persona)(iterador.next());
			System.out.println(leer);
		}
		
	}

}

package srdplas.e6;

import java.util.*;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("unused")
public class FiltrandoListas {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cadenas = new ArrayList<String>();

		cadenas.add("Vertical");
		cadenas.add("Horizontal");
		cadenas.add("Izquierda");
		cadenas.add("Derecha");
		cadenas.add("Adelante");
		cadenas.add("Detras");
		cadenas.add("Curvo");
		cadenas.add("Recto");
		cadenas.add("Arriba");
		cadenas.add("Abajo");
		Collections.sort(cadenas);// Ordenamos la cadena usando su toString()
		System.out.println("Ordenamos la lista e imprimimos su toString");

		Iterator<String> iterador;
		iterador = cadenas.iterator();

		while (iterador.hasNext()) {
			String look = (String) (iterador.next());
			System.out.println(look.toString());
		}

		System.out.println("\nBorramos las palabras que acaben en o de la Lista");

		iterador = cadenas.iterator();
		while (iterador.hasNext()) {

			String look = (String) (iterador.next());

			if (look.endsWith("o")) {
				iterador.remove();

			} else {
				System.out.println(look);
			}

		}
		System.out.println("\nBorramos las palabras que contengan la t de la Lista");
		iterador = cadenas.iterator();
		while (iterador.hasNext()) {

			String look = (String) (iterador.next());

			if (look.contains("t")) {
				iterador.remove();

			} else {
				System.out.println(look);
			}
		}
		System.out.println("\nBorramos las palabras que contengan la a y tengan 5 letras de la Lista");

		iterador = cadenas.iterator();
		while (iterador.hasNext()) {

			String look = (String) (iterador.next());

			if (look.length() > 5 && look.contains("a")) {
				iterador.remove();

			}else {
				System.out.println(look);
			}
			
		}
	
	}

}

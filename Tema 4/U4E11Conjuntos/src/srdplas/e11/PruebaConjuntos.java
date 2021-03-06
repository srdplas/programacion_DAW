package srdplas.e11;

import java.util.*;

public class PruebaConjuntos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Set<String> candidatos = new HashSet<String>();
		Iterator<String>iterador;
		candidatos.add("Juan");
		candidatos.add("Ana");
		candidatos.add("Pedro");
		candidatos.add("Rosa");
		candidatos.add("Maria");
		
		System.out.println("La lista esta vacia? "+candidatos.isEmpty());
		System.out.println("Cuantos elementos contiene la lista: "+candidatos.size());
		System.out.println("Est? el candidado Pedro? "+candidatos.contains("Pedro"));
		
		System.out.println("Recorremos la lista usando un iterador");
		iterador = candidatos.iterator();
		while(iterador.hasNext()) {
			String leer = (String)(iterador.next());
			System.out.println(leer);
		}
		
		Set<String> seleccionados = new HashSet<String>();
		System.out.println("Imprimimos el contenido de los seleccionados que contienen la a");
		iterador=candidatos.iterator();
		while(iterador.hasNext()) {
			String leer = (String)(iterador.next());
			if(leer.contains("a")) {
				seleccionados.add(leer);
			}
		}
		
		iterador=seleccionados.iterator();
		while(iterador.hasNext()) {
			String leer = (String)(iterador.next());
			System.out.println(leer);
		}
		
	}

}

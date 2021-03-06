package srdplas.e5;
import java.util.*;
public class ManipulandoCadenas {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String>cadenas = new ArrayList<String>();
		
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
		//A?adimos contenido a la Lista
		
		Iterator<String> iterador= cadenas.iterator();
		System.out.println("Imprimimos el contenido de la lista en mayusculas sin tocar el contenido");
		while(iterador.hasNext()) {
			String look = (String)(iterador.next());
			System.out.println(look.toUpperCase());
		}
		
		Collections.sort(cadenas);
		System.out.println("Ordenamos la lista de forma alfabeticamente");
		iterador = cadenas.iterator();
		while(iterador.hasNext()) {
			String look = (String)(iterador.next());
			System.out.println(look);
			System.out.println(look.startsWith("A"));
		}
		System.out.println("Ahora impriremos el contenido de la lista que empiece por A");
		iterador = cadenas.iterator();
		while(iterador.hasNext()) {
			String look = (String)(iterador.next());
			if(look.startsWith("A")) {
				System.out.println(look);
			}
		}
		System.out.println("Ahora imprimiremos el contenido de la lista que acabe en "+"o");
		iterador = cadenas.iterator();
		while(iterador.hasNext()) {
			String look = (String)(iterador.next());
			if(look.endsWith("o")) {
				System.out.println(look);
			}
		}
		
		System.out.println("Ahora imprimiremos el contenido de la lista que tenga la e");
		iterador = cadenas.iterator();
		while(iterador.hasNext()) {
			String look = (String)(iterador.next());
			if(look.contains("e")) {
				System.out.println(look);
			}
		}
		
		System.out.println("Ahora imprimiremos el contenido de la lista que tenga solo 5 letras");
		iterador = cadenas.iterator();
		while(iterador.hasNext()) {
			String look = (String)(iterador.next());
			if(look.length()==5) {
				System.out.println(look);
			}
		}
		System.out.println("Ahora imprimiremos el contenido de la lista que tenga 5 letras y empiece por A");
		iterador=cadenas.iterator();
		while(iterador.hasNext()) {
			String look = (String)(iterador.next());
			if(look.length()==5&&look.startsWith("A")) {
				System.out.println(look);
			}
			
			
			
		}
	}

}

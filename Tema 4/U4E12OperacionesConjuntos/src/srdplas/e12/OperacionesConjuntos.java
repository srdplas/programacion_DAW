package srdplas.e12;

import java.util.HashSet;
import java.util.*;
public class OperacionesConjuntos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Set<String>buscaPolicia = new HashSet<String>();
		Set<String>buscaGuardia = new HashSet<String>();
		
		Iterator<String>it;
	
		buscaPolicia.add("12345678A");
		buscaPolicia.add("12345678B");
		buscaPolicia.add("12345678C");
		buscaPolicia.add("12345678D");
		//Lista de Policia
		buscaGuardia.add("12345678E");
		buscaGuardia.add("12345678F");
		buscaGuardia.add("12345678G");
		buscaGuardia.add("12345678D");
		//Lista de Guardia Civil
		
		System.out.println("Mostramos los DNI buscados por la Policia o la Guardia Civil");
		Set<String>policiaOGuardia = new HashSet<String>(buscaPolicia);
		policiaOGuardia.addAll(buscaGuardia);
		it=policiaOGuardia.iterator();
		while(it.hasNext()) {
			String leer = (String)(it.next());
			System.out.println(leer);
		}
		System.out.println("\nMostramos los DNI buscados por la Policia y la Guardia Civil");
		Set<String>policiaYGuardia = new HashSet<String>(buscaPolicia);
		policiaYGuardia.retainAll(buscaGuardia);
		it=policiaYGuardia.iterator();
		while(it.hasNext()) {
			String leer = (String)(it.next());
			System.out.println(leer);
		}
		System.out.println("\nMostramos los DNI buscados por la Policia pero no por la Guardia Civil");
		Set<String>policiaNoGuardia = new HashSet<String>(buscaPolicia);
		policiaNoGuardia.removeAll(buscaGuardia);
		
		it=policiaNoGuardia.iterator();
		while(it.hasNext()) {
			String leer = (String)(it.next());
			System.out.println(leer);
		}
		System.out.println("\nMostramos los DNI buscados por la Guardia Civil pero no por la Policia");
		Set<String>guardiaNoPolicia = new HashSet<String>(buscaGuardia);
		guardiaNoPolicia.removeAll(buscaPolicia);
		it=guardiaNoPolicia.iterator();
		while(it.hasNext()) {
			String leer = (String)(it.next());
			System.out.println(leer);
		}
	}

}

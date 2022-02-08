package srdplas.prog.e3;
import java.util.*;


public class PruebaListas {

	public static void main(String[] args) {
		
		List<String> meses = new ArrayList<String>();
		
		meses.add("Enero");
		meses.add("Febrero");
		meses.add("Marzo");
		meses.add("Abril");
		meses.add("Mayo");
		meses.add("Junio");
		meses.add("Julio");
		meses.add("Agosto");
		meses.add("Septiembre");
		meses.add( "Octubre");
		meses.add( "Noviembre");
		meses.add("Diciembre");
		
		System.out.println("Consultamos a la lista");
		System.out.println("¿La lista está vacia? "+meses.isEmpty());
		System.out.println("La lista contiene "+meses.size()+" elementos");
		System.out.println("¿La lista contiene el mes enero? "+meses.contains("Henero"));
		Iterator<String> recorre = meses.iterator();
		while(recorre.hasNext()) {
			String elemento = (String) recorre.next();
			System.out.println("Mes "+elemento);
		}
		
		Collections.sort(meses);
		System.out.println("Lista ordenada");
		
		recorre=meses.iterator();
		while(recorre.hasNext()) {
			String elemento = (String) recorre.next();
			System.out.println("Mes "+elemento);
		}
		meses.clear();
		System.out.println("Vaciamos la lista\n "+meses);
		
		
		
	}

}

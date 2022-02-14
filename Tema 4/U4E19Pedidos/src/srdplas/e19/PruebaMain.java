package srdplas.e19;

import java.util.*;

public class PruebaMain {

	@SuppressWarnings({ "unused", "unchecked" })
	public static void main(String[] args) {
	
		Articulo art = new Articulo("Ubuntu Mejor S.O");
		Articulo art2 = new Articulo("Las recetas de Eva Alguiñano");
		
		Set<Pedido>conjunto = new HashSet<Pedido>(); //CONJUNTO PEDIDOS
		
		List<Articulo>lista = new ArrayList<Articulo>(); //LISTA ARTICULOS
		lista.add(art);
		lista.add(art2);
		
		Map<String, Articulo>diccionarioArticulo = new HashMap<String, Articulo>(); // DICCIONARIO DE ARTICULOS
		diccionarioArticulo.put("Las recetas de Eva Alguiñano", art);
		diccionarioArticulo.put("Ubuntu Mejor S.O", art2);
		Iterator<Pedido>conjuntoIterador=conjunto.iterator(); // ITERADOR DEL CONJUNTO DE PEDIDOS
		
		
		Iterator<Articulo>listaIterador=lista.iterator();
		System.out.println("Recorremos la lista con un iterador\n"); // RECORREMOS EL ITEDAOR DE LA LISTA
		
		while(listaIterador.hasNext()) {
			Articulo recorrer= (Articulo)(listaIterador.next());
			System.out.println(recorrer);
		}
	
		System.out.println("\nRecorremos el diccionario de las claves\n"); // RECORREMOS EL ITERADOR DEL DICCIONARIO
		Set<String> diccionarioContenido = diccionarioArticulo.keySet();
		Iterator<String>diccionarioIterador=diccionarioContenido.iterator();
		
		while(diccionarioIterador.hasNext()) {
			String recorre=(String)(diccionarioIterador.next());
			System.out.println("Clave de Búsqueda: "+recorre);
		}
		
//		System.out.println("\nRecorremos el diccionario mostrando el contenido");
//		diccionarioIterador=diccionarioContenido.iterator();
//		while(diccionarioIterador.hasNext()) {
//			String recorre=(String)(diccionarioIterador.next());
//			System.out.println(diccionarioArticulo.get(recorre));
//		}
		
//		System.out.println("\nRecorremos el diccionario mostrando el contenido");
//		diccionarioIterador=diccionarioContenido.iterator();
//		
//		while(diccionarioIterador.hasNext()) {
//			String recorre=(String)(diccionarioIterador.next());
//			System.out.println(diccionarioArticulo.values());
//		}

	}

}

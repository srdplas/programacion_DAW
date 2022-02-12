package srdplas.e16;

import java.util.*;

public class PruebaRecursos {

	public static void main(String[] args) {
		

	

	Set<Autores>listaAutores= new HashSet<Autores>();
	Autores a = new Autores("Ken", "Follet", "Britanica");
	Autores a2 = new Autores("Ildefonso", "Falcones", "Espa�ola");
	Autores a3 = new Autores("Howard", "Phillips Lovecraft", "Estadounidense");
	Autores a4 = new Autores("Alexandre", "Dumas", "Francesa");
	
	
	
	Set<Recurso> recursos = new HashSet<Recurso>();
	
	Set <Autores>pilar= new HashSet<Autores>();
	Set <Autores>catedral= new HashSet<Autores>();
	Set <Autores>mejores= new HashSet<Autores>();
	
	pilar.add(a);
	catedral.add(a2);
	mejores.add(a3);
	mejores.add(a4);
	
	
	
	Recurso r = new Recurso("Los pilares de la tierra", 10, 978840132,pilar);
	Recurso r2 = new Recurso("La catedral del mar", 8, 978849908, catedral);
	Recurso r3 = new Recurso("Los mejores cuentos para leer a media noche", 3, 978841724, mejores);
	
	recursos.add(r);
	recursos.add(r2);
	recursos.add(r3);
	
	Iterator<Recurso>iterador=recursos.iterator();
	while(iterador.hasNext()) {
		Recurso leer = (Recurso)(iterador.next());
		System.out.println(leer+"\n");
	}
	
}

}

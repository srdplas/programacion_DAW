package otraforma;

import java.util.*;

public class PruebaRecursos {

	public static void main(String[] args) {

	Autores a = new Autores("Ken", "Follet", "Britanica");
	Autores a2 = new Autores("Ildefonso", "Falcones", "Espa?ola");
	Autores a3 = new Autores("Howard", "Phillips Lovecraft", "Estadounidense");
	Autores a4 = new Autores("Alexandre", "Dumas", "Francesa");
	
	
	
	Set<Recurso> recursos = new HashSet<Recurso>();
	

	Recurso r = new Recurso("Los pilares de la tierra", 10, 9788401328510l);
	Recurso r2 = new Recurso("La catedral del mar", 8, 9788499088044l);
	Recurso r3 = new Recurso("Los mejores cuentos para leer a media noche", 3, 9788417244712l);
	
	r.listaAutores.add(a);
	r2.listaAutores.add(a2);
	r3.listaAutores.add(a3);
	r3.listaAutores.add(a4);
	
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

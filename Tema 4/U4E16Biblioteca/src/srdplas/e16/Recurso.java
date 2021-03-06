package srdplas.e16;

import java.util.*;

public class Recurso {

	private int numeroEjemplar;
	final private long isbn;
//	private final int id;
	private String nombre;
	@SuppressWarnings("unchecked")
	private Set<Autores>listaAutores= new HashSet<Autores>();
	
	@SuppressWarnings("unchecked")
	public Recurso(String nombre, int numeroEjemplar, long isbn, Set lisSet) {
		listaAutores=lisSet;
		this.isbn = isbn;
		this.numeroEjemplar = numeroEjemplar;
		this.nombre = nombre;
		
	}

	@Override
	public String toString() {
		return "Recursos ISBN=" + isbn + ", numeroEjemplar "+numeroEjemplar + ", nombre " + nombre
				+ ", listaAutores " + listaAutores;
	}



	public void setNumeroEjemplar(int numeroEjemplar) {
		this.numeroEjemplar = numeroEjemplar;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setListaAutores(Set<Autores> listaAutores) {
		this.listaAutores = new <Autores>HashSet(listaAutores);
	}

	
	public long getIsbn() {
		return isbn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recurso other = (Recurso) obj;
		return isbn == other.isbn;
	}
	




	

}

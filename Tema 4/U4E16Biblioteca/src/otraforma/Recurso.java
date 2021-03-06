package otraforma;

import java.util.*;

public class Recurso {

	private int numeroEjemplar;
	private final long isbn;

	private String nombre;
	protected List<Autores>listaAutores=new ArrayList<Autores>();
	
	@SuppressWarnings("unchecked")
	public Recurso(String nombre, int numeroEjemplar, long isbn) {
		
		this.isbn = isbn;
		this.numeroEjemplar = numeroEjemplar;
		this.nombre = nombre;
		
	}

	@Override
	public String toString() {
		return "Recursos ISBN " + isbn + ", Ejemplares "+numeroEjemplar + ", Nombre " + nombre
				+ ", Autores " + listaAutores;
	}



	public void setNumeroEjemplar(int numeroEjemplar) {
		this.numeroEjemplar = numeroEjemplar;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

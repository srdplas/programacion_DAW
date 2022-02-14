package srdplas.e19;

public class Articulo {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public Articulo(String nombre) {
		
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Articulo Nombre = " + nombre;
	}
	
	
}

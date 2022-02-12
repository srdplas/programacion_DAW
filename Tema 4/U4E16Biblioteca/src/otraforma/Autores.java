package otraforma;

import java.util.Objects;

public class Autores {

	final private String nombre, apellidos;
	private String nacionalidad;
	
	
	
	public Autores(String nombre, String apellidos, String nacionalidad) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacionalidad = nacionalidad;
		
	}

	@Override
	public String toString() {
		return "AUTOR Nombre " + nombre + ", Apellidoss " + apellidos 
				+ ", Nacionalidad " + nacionalidad;
	}



	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autores other = (Autores) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(nombre, other.nombre);
	}





	
	
	
}

package srdplas.e7;

public class Persona implements Comparable {

	private String nombre,dni;
	private int edad;
	


	public Persona(String nombre, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}

	public Persona() {
		
	}
	
	
	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getDni() {
		return dni;
	}




	public void setDni(String dni) {
		this.dni = dni;
	}




	public int getEdad() {
		return edad;
	}




	public void setEdad(int edad) {
		this.edad = edad;
	}




	@Override
	public int compareTo(Object o) {
		Persona p = (Persona)(o);
		
//		int aux = this.getNombre().compareTo(p.getNombre());
		
		if(this.getNombre().compareTo(p.nombre)==0) {
			
				if(this.getEdad()>p.getEdad()) {
					return 1;
					
				}else {
					if(this.getEdad()==p.getEdad()) {
						return 0;
					}
				}
		
		}
		
		return -1;
//		
//		if(this.getNombre().length()<p.getNombre().length()){ 
//			return 1;
//			
//		}else{ 
//			
//			if(this.getNombre().length()==p.getNombre().length()) {
//				if(this.getEdad()>p.getEdad()) {
//					return 1;
//				}else {
//					if(this.getEdad()==p.getEdad()) {
//						return 0;
//					}else {
//						return -1;
//					}
//				}
//			}
//		}
//		return -1;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: "+nombre+" DNI: "+dni+" Edad: "+edad;
	}
}

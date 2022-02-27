package srdplas.ep;

public class Tarjeta {
	private int identificador;
	final private String nombrePropietario;

	public Tarjeta(int identificador, String nombrePropietario) {
		this.identificador = identificador;
		this.nombrePropietario = nombrePropietario;
	}

	public int getIdentificador() {
		return identificador;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + identificador;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarjeta other = (Tarjeta) obj;
		if (identificador != other.identificador)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tarjeta: "+identificador+" Propietario: " + nombrePropietario;
	}
	

}

package srdplas.e20;

public class Vehiculo {

	private String marca, modelo, matricula;
	private int  anioFabric;
	private double precio;
	
	@Override
	public String toString() {
		return "Vehiculo Marca = " + marca + ", Modelo = " + modelo + ", Matricula = " + matricula + ", AñoFab = "
				+ anioFabric + ", Precio = " + precio+" €";
	}
	
	
	
	
	public Vehiculo(String marca, String modelo, String matricula, int anioFabric, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.anioFabric = anioFabric;
		this.precio = precio;
	}




	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getAnioFabric() {
		return anioFabric;
	}
	public void setAnioFabric(int anioFabric) {
		this.anioFabric = anioFabric;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}

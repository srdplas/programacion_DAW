package srdplas.e20;

import java.util.*;

public class Concesionario {

	private String nombre, direccion;
	private Set<Vehiculo> conjuntoCoche;

	public Concesionario(String nombre, String direccion) {
		conjuntoCoche = new HashSet<Vehiculo>();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public void addVehiculo(Vehiculo vel) {

		conjuntoCoche.add(vel);
	}

	public void updateVehiculo(Vehiculo vel, Vehiculo vel2) {
		Iterator<Vehiculo> iteradorVel = conjuntoCoche.iterator();

		if (!(conjuntoCoche.contains(vel))) {
			System.out.println("No se ha encontrado el vehiculo " + vel + " en el concesionario");
		}else {
		while (iteradorVel.hasNext()) {
			Vehiculo recorre = (Vehiculo) (iteradorVel.next());
			if (vel == recorre) {
				conjuntoCoche.remove(vel);
				conjuntoCoche.add(vel2);
			}
		}
		
		}
	}

	public void deleteVehiculo(Vehiculo vel) {
		Iterator<Vehiculo> iteradorVel = conjuntoCoche.iterator();

		if (!(conjuntoCoche.contains(vel))) {
			System.out.println("No se ha encontrado el vehiculo " + vel + " en el concesionario");
		}else {
		while (iteradorVel.hasNext()) {
			Vehiculo recorre = (Vehiculo) (iteradorVel.next());
			if (vel == recorre) {
				conjuntoCoche.remove(vel);

			}
		}
		}	
	}

	public void showVehiculos() {
		Iterator<Vehiculo> iteradorVel = conjuntoCoche.iterator();

		while (iteradorVel.hasNext()) {
			Vehiculo recorre = (Vehiculo) (iteradorVel.next());
			System.out.println(recorre);
		}
		System.out.println();
	}

	public double calculaPrecioTotal() {
		double precio = 0;
		Iterator<Vehiculo> iteradorVel = conjuntoCoche.iterator();

		while (iteradorVel.hasNext()) {
			Vehiculo recorre = (Vehiculo) (iteradorVel.next());
			precio += recorre.getPrecio();
		}
		System.out.println("Precio total de vehiculos del concesionario " + precio + " €");
		return precio;

	}

	public String getNombre() {
		return nombre;
	}

}

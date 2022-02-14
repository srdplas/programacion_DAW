package srdplas.e20;

public class PruebaConcesionario {

	public static void main(String[] args) {
		
		Vehiculo v = new Vehiculo("BMW", "E40", "12345-PFK", 2000, 5000);
		Vehiculo v2 = new Vehiculo("Mercedes", "RAPTOR", "5555-ABC", 2020, 125000);
		Vehiculo v3 = new Vehiculo("SEAT", "Cordoba", "9999-LKF", 2015, 3200.95);
		
		Concesionario concesionario = new Concesionario("Segunda Mano", "Sevilla Centro");
		
		System.out.println("Concesionario "+concesionario.getNombre()+"\n");
		System.out.println("Añadimos un coche al concesionario");
		concesionario.addVehiculo(v);
		
		System.out.println("Mostramos los coches del concesionario");
		concesionario.showVehiculos();
		
		System.out.println("Remplazamos el coche que tenemos por otro");
		concesionario.updateVehiculo(v, v2);
		concesionario.showVehiculos();
		
		System.out.println("Añadimos otro vehiculo y provocamos error al actualizar y borrar");
		concesionario.addVehiculo(v3);
		concesionario.deleteVehiculo(v);
		concesionario.updateVehiculo(v, v2);
		
		System.out.println("\nMoestramos de nuevo tras borrar");
		concesionario.deleteVehiculo(v2);
		concesionario.showVehiculos();
		concesionario.calculaPrecioTotal();
		System.out.println("\nAñadimos otro coche y calculamos de nuevo el precio");
		concesionario.addVehiculo(v2);
		concesionario.calculaPrecioTotal();

	}

}

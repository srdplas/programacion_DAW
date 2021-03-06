package srdplas.ep;

import java.util.*;

public class PuertaUrbanizacion<T> {

	private Map<Integer, Tarjeta> tarjetasPermitidas;
	private Set<Tarjeta> tarjetasDentro;

	public PuertaUrbanizacion() {
		tarjetasPermitidas = new HashMap<Integer, Tarjeta>();
		tarjetasDentro = new HashSet<Tarjeta>();
	}

	public void agregaTarjetaPermitida(Tarjeta t) {

		if (!tarjetasPermitidas.containsValue(t)) {
			tarjetasPermitidas.put(t.getIdentificador(), t);
			System.out.println("TARJETA " + t.getIdentificador() + " A?ADIDA CORRECTAMENTE.");
		} else {
			System.out.println("ERROR LA TARJETA " + t.getIdentificador() + " YA ESTABA PERMITIDA");
		}
	}

	public void eliminaTarjetaPermitida(int identificador) {
		int i = -1;
		if (!tarjetasPermitidas.isEmpty()) {
			Set<Integer> conjunto = tarjetasPermitidas.keySet();
			Iterator<Integer> iterador = conjunto.iterator();
			while (iterador.hasNext()) {
				Integer lectura = (Integer) (iterador.next());
				if (lectura == identificador) {
					tarjetasDentro.remove(tarjetasPermitidas.get(lectura));
					tarjetasPermitidas.remove(lectura);

					// DEBEMOS BORRAR LA TARJETA PERMITIDA BORRADA DE TARJETADENTRO, PORQUE PODR?A
					// METER EL COCHE BORRARLO PERMITIDA Y NO PODER SACARLO EL COCHE
					System.out.println("SE HA BORRADO CORRECTAMENTE LA TARJETA " + lectura);
					i = 1;
				}
			}
		}
		if (i == -1) {
			System.out.println("ERROR NO SE HA ENCONTRADO LA TARJETA " + identificador);
		}

//		if (tarjetasPermitidas.containsKey(id)) {
//			System.out.println("Borrando la Tarjeta " + id);
//			tarjetasPermitidas.remove(id);
//		} else {
//			System.out.println("ERROR NO SE HA ENCONTRADO LA TARJERTA");
//		}

	}

	public void imprimeTarjetasPermitidas() {
		if (!tarjetasPermitidas.isEmpty()) {

			Set<Integer> conjunto = tarjetasPermitidas.keySet();
			Iterator<Integer> iterador = conjunto.iterator();
			System.out.println("\nTARJETAS PERMITIDAS");
			while (iterador.hasNext()) {
				Integer cod = (Integer) (iterador.next());

				System.out.println(tarjetasPermitidas.get(cod));
			}
			System.out.println();
		} else {
			System.out.println("NO HAY TARJETAS PERMITIDAS");
		}
	}

	public void intentoDeEntrada(int identificador) {
		int i = -1;
		Set<Integer> conjunto = tarjetasPermitidas.keySet();
		Collection<Tarjeta> contenido = tarjetasPermitidas.values();

		Iterator<Integer> iterador = conjunto.iterator();

		while (iterador.hasNext()) {

			Integer lectura = (Integer) (iterador.next());

			if (lectura == identificador) { // SI EST? EN TARJETAS PERMITIDAS

				if (!(tarjetasDentro.contains(tarjetasPermitidas.get(lectura)))) { // SI LA TARJETA EST? EN LAS TARJETAS
																					// DENTRO

					tarjetasDentro.add(tarjetasPermitidas.get(lectura));
					System.out.println("SE HA USADO LA TARJETA " + lectura + " ENTRANDO CON SU VEHICULO...");
					i = 0;

				} else {
					System.out.println("TARJETA " + identificador
							+ " ERROR HAY UN COCHE EN LA PLAZA, RECUERDE UN PROPIETARIO UNA SOLO VEHICULO");
					i = 1;
				}

			}

		}
		if (i == -1) {
			System.out.println("ERROR NO SE PUDO ENTRAR DEL GARAJE TARJETA " + identificador + " NO PERMITIDA");
		}

	}

	public void intentoDeSalida(int identificador) {
		int i = -1;
		Set<Integer> conjunto = tarjetasPermitidas.keySet();
		Collection<Tarjeta> contenido = tarjetasPermitidas.values();

		Iterator<Integer> iterador = conjunto.iterator();

		while (iterador.hasNext()) {

			Integer lectura = (Integer) (iterador.next());

			if (lectura == identificador) { // SI EST? EN TARJETAS PERMITIDAS

				if (tarjetasDentro.contains(tarjetasPermitidas.get(lectura))) { // SI LA TARJETA EST? EN LAS TARJETAS
																				// DENTRO

					tarjetasDentro.remove(tarjetasPermitidas.get(lectura));
					System.out.println("SE HA USADO LA TARJETA " + lectura + " SALIENDO CON SU COCHE...");
					i = 0;

				} else {
					System.out.println("ERROR TARJETA " + identificador
							+ " NO HAY NINGUN COCHE EN LA PLAZA, ?LO DEJASTE EN LA CALLE?");
					i = 1;
				}

			}

		}
		if (i == -1) {
			System.out
					.println("ERROR NO PUDO SALIR CON SU COCHE DEL GARAJE, TARJETA " + identificador + " NO PERMITIDA");
		}

	}

// METODO PARA COMPROBAR LOS COCHES DEL PARKING DE LA URBANIZACI?N 

//	public void estadoParking() {
//		System.out.println("COCHES DEL PARKING");
//		Iterator<Tarjeta> iterador = tarjetasDentro.iterator();
//		while (iterador.hasNext()) {
//			Tarjeta leer = (Tarjeta) (iterador.next());
//			System.out.println(leer);
//		}
//
//	}

}

package srdplas.ep;

public class PruebaPuertaUrbanizacion {

	public static void main(String[] args) {
		// CREAMOS 1 PUERTA DE URBANIZACION
		PuertaUrbanizacion p = new PuertaUrbanizacion();

		// CREAMOS 4 TARJETAS
		Tarjeta t = new Tarjeta(124, "Yuri");
		Tarjeta t2 = new Tarjeta(222, "Pepe");
		Tarjeta t3 = new Tarjeta(333, "Antonio");
		Tarjeta t4 = new Tarjeta(333, "Rosa");

		System.out.println("A?ADIMOS LAS TARJETAS DE LOS VECINOS");
		// A?ADIMOS 3/4 TARJETAS A LA PUERTA
		p.agregaTarjetaPermitida(t);
		p.agregaTarjetaPermitida(t3);
		p.agregaTarjetaPermitida(t4);
		//BORRAMOS UNA TARJETA
		p.eliminaTarjetaPermitida(0);
		
		
		
		
		//IMPRIMIMOS EL LISTADO DE LAS TARJETAS PERMITIDAS
		p.imprimeTarjetasPermitidas();
		// ROSA TIENE LA TARJETA DE ANTONIO, Y NO APARECE LA TARJETA REPETIDA CON DIFERENTE PROPIETARIO
		
		System.out.println("\nENTRADAS AL PARKING");
		//INTENTAN ENTRAR AL GARAJE USANDO LA TARJETA
		p.intentoDeEntrada(124);
		p.intentoDeEntrada(222);
		p.intentoDeEntrada(333);
		p.intentoDeEntrada(333);
		
		System.out.println("\nSALIDAS DEL PARKING");
		//INTENTAN SACAR EL COCHE USANDO LA TARJETA
		p.intentoDeSalida(222);
		p.intentoDeSalida(124);
		p.intentoDeSalida(124);
		
		System.out.println("\nA?ADIMOS A LA TARJETA DE PEPE Y GUARDA EL COCHE");
		p.agregaTarjetaPermitida(t2);
		p.intentoDeEntrada(222);
		p.eliminaTarjetaPermitida(222);
		//ELIMINAMOS LA TARJETA 222 DE TARJETAS PERMITIDAS Y QUITAR? EL COCHE DE LA PLAZA DE TARJETASDENTRO
		
		
		
		
		
		//IMPRIMIMOS EL LISTADO DE LAS TARJETAS PERMITIDAS
		p.imprimeTarjetasPermitidas();
		
//		p.estadoParking();

	}
}

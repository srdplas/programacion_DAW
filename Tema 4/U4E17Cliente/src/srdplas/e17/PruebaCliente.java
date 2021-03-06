package srdplas.e17;
import java.util.*;

public class PruebaCliente {

	public static void main(String[] args) {
		
		Map<Integer, Cliente> clientes = new HashMap<Integer, Cliente>();

		Cliente c = new Cliente(101, "Manolo", "Fernandez");
		Cliente c2 = new Cliente(102, "Antonio", "Perez");
		Cliente c3 = new Cliente(203, "Yuri", "Rodriguez");
		
		clientes.put(c.getIdCliente(), c);
		clientes.put(c2.getIdCliente(), c2);
		clientes.put(c3.getIdCliente(), c3);
		
		Set<Integer>claves = clientes.keySet();
		Iterator<Integer>iteradorClave = claves.iterator();
		
		System.out.println("Imprimimos el conjunto de Claves de todos los clientes\n");
		while(iteradorClave.hasNext()) {
			Integer leer = (Integer)(iteradorClave.next());
			System.out.println(leer);
		}
		clientes.remove(102);
		c3.setNombre("Pepito");
		c3.setApellidos("Grillo");
		
//		clientes.replace(203, new Cliente("Pepito", "Grillo"));

		
		claves=clientes.keySet();
		iteradorClave=claves.iterator();

		
		while(iteradorClave.hasNext()) {
			Integer key = (Integer)(iteradorClave.next());
			
			System.out.println("Clave "+key+clientes.get(key));
		}
	}

}

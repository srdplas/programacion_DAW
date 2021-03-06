package srdplas.e18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.*;

public class MapaHabitaciones {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Map<Integer, Boolean> estadoHabitaciones = new HashMap();
		String libre;

		estadoHabitaciones.put(101, false);
		estadoHabitaciones.put(102, true);
		estadoHabitaciones.put(103, true);
		estadoHabitaciones.put(104, false);
		estadoHabitaciones.put(105, true);
		estadoHabitaciones.put(201, true);
		estadoHabitaciones.put(202,	false);
		estadoHabitaciones.put(203, false);
		estadoHabitaciones.put(204, true);
		estadoHabitaciones.put(205, false);

		int opcion;
		do {
			
			System.out.printf("%15s","\n------  MENU  ------\n");
			System.out.println("\n0 - SALIR\n");
			System.out.println("1 - VER ESTADO DE OCUPACION\n");
			System.out.println(("2 - OCUPAR HABITACION\n"));
			System.out.println("3 - LIBERAR HABITACION\n");
			opcion = sn.nextInt();
			
			switch (opcion) {
			case 0: 
				System.out.println("SALIENDO..");
				break;
			
			case 1:
				System.out.println("ESTADO DE OCUPACION\n");
				Set <Integer>habs=estadoHabitaciones.keySet();
				Iterator<Integer>iterador=habs.iterator();
				
				while(iterador.hasNext()) {
					Integer revisar=(Integer)(iterador.next());
					
					if((boolean) estadoHabitaciones.get(revisar)) 
						libre="Ocupada";
					else 
						libre="Libre";
					
					System.out.println("Habitacion: "+revisar+" "+libre);	
				}
				break;
			
			case 2: 
				System.out.println("?Que habitacion desea ocupar?");
				int habitacion=sn.nextInt();
				
				if(estadoHabitaciones.get(habitacion)!=null) {
					
					if(!(boolean) estadoHabitaciones.get(habitacion)) {
						estadoHabitaciones.replace(habitacion, true);
						System.out.println("\nOcupando la Habitacion "+habitacion);
						
					}else {System.out.println("\nNo es posible ocupar una habitacion ya en uso");}
					
				}else {
					System.out.println("\nError no existe la habitacion "+habitacion);
				}
				
				break;
			case 3: 
				System.out.println("?Que habitacion desea liberar?");
				habitacion=sn.nextInt();
				
				if(estadoHabitaciones.get(habitacion)!=null) {
					
					if((boolean) estadoHabitaciones.get(habitacion)) {
						estadoHabitaciones.replace(habitacion, false);
						System.out.println("\nLiberando la habitacion "+habitacion);
					}

				}else {
					System.out.println("\nNo existe la habitacion "+habitacion);
				}

			default:
			if(opcion>3)
				System.out.println("Opcion no soportado");	
			}

		} while (opcion != 0);

	}

}

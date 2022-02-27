package srdplas.e1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {

	private Scanner sc;

	public Teclado() {
		sc = new Scanner(System.in);

	}

	public int leeEntero() {

		int leer;
		while (true) {
			try {
				System.out.println("Introduce un numero entero para leeEntero");
				leer = sc.nextInt();
				sc.nextLine();

				return leer;

			} catch (InputMismatchException e) {
				System.out.println("Error en el numero introducido");
				sc.nextLine();

			}
		}
	}

	public int leeEntero(int minimo, int maximo) {
		int lectura;

		System.out.println("Introduce un numero para leeEntero con max y min");
		while (true) {

			lectura = leeEntero();
			if (lectura >= minimo && lectura <= maximo) {
				return lectura;
			} else
				System.out.println("Error el numero no está entre el " + minimo + " y " + maximo);

		}

	}

	public int leeEnteroMax(int max) {
		int lee;
		System.out.println("Introduce un numero max");
		while (true) {

			lee = leeEntero();
			if (lee <= max) {
				return lee;
			} else {
				System.out.println("Debes teclear un entero menor o igual que " + max);
			}

		}
	}

	public int leeEnteroMin(int min) {
		int lee;

		System.out.println("Introduce un numero entero para leerEnteroMin");

		while (true) {

			lee = leeEntero();
			if (lee >= min) {
				return lee;
			} else {
				System.out.println("Debes teclear un entero mayor o igual que " + min);
			}

		}
	}
	
	public int leerBinario() {
		int lectura;
		String linea;
		while(true) {
			
			try {
				System.out.println("Introduce un Numero Binario");
				linea=sc.nextLine();
				lectura = Integer.parseInt(linea,2);
				return lectura;
				
			}catch (NumberFormatException e) {
				System.out.println("El numero introducido no tiene el formato correcto");
			}
			
		}
	}
	
	public int leerHexadecimal() {
		int lectura;
		String linea;
		while(true) {
			
			try {
				System.out.println("Introduce un Numero Hexadecimal");
				linea=sc.nextLine();
				lectura = Integer.parseInt(linea,16);
				return lectura;
				
			}catch (NumberFormatException e) {
				System.out.println("El numero introducido no tiene el formato correcto");
			}
			
		}
	}
	
	public int leerOctal() {
		int lectura;
		String linea;
		while(true) {
			
			try {
				System.out.println("Introduce un Numero Octal");
				linea=sc.nextLine();
				lectura = Integer.parseInt(linea,8);
				return lectura;
				
			}catch (NumberFormatException e) {
				System.out.println("El numero introducido no tiene el formato correcto");
			}
			
		}
	}
	
	
	
}

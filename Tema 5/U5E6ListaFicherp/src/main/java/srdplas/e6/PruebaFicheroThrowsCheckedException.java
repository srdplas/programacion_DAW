package srdplas.e6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class PruebaFicheroThrowsCheckedException {
	public static void main(String[] args) throws NullPointerException, IllegalStateException, IOException {
		Scanner sc = new Scanner(System.in);
		Fichero f = new Fichero("ficherito.txt");
		List textitos = new ArrayList<String>();
		textitos.add("Hola ");
		textitos.add("Probando ");
		textitos.add("Lista en txt");
		System.out.println("Escribiendo una Lista en el fichero");

		try {
			f.abrir();
		}catch (Exception e) {
			f.cerrar();
		}
		try {
			f.escribeTexto(textitos);

		}catch (NullPointerException e) {
			System.out.println(e);
		}
		
		try{
			f.cerrar();
			
		}catch (Exception e) {
			
		}
		System.out.println("Escrito correctamente...");
	}
}

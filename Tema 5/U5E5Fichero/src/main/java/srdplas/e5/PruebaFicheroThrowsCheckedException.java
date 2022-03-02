package srdplas.e5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class PruebaFicheroThrowsCheckedException {
	public static void main(String[] args) throws NullPointerException, IllegalStateException, IOException {
		Scanner sc = new Scanner(System.in);
		Fichero f = new Fichero("fichero.txt");
		System.out.println("Dime una frase y te la escribo a un fichero");
		
		try {

			f.escriteTexto(sc.nextLine());

		} catch (NullPointerException e) {
			System.out.println(e);
		}

//		try {
//			f.cerrar();
//
//		} catch (Exception e) {
//			System.out.println(e);
//		}

		
		
	}
}

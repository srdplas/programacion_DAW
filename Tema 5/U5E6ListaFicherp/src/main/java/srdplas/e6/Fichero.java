package srdplas.e6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fichero {

    private String nombreFichero = "";
    // La clase File representa un fichero y su ruta completa en el sistema
    // de ficheros del sistema operativo.
    private File fichero;
    // La clase FileReader permite crear objetos que saben leer un array de 
    // caracteres de un fichero.
    private FileWriter fr;
    // La clase BufferedReader permite crear un objeto que toma un FileReader
    // como entrada y es capaz de ofrecer operaciones de lectura más cómodas
    // para el programador. Ejemplo: readLine()
    private PrintWriter br;
    private boolean abierto = false;

    public Fichero(String nombre) {
        if (nombre != null) {
            nombreFichero = nombre;
        }else {
        	throw new NullPointerException("Error el fichero no tiene nombre");
        }
    }

    public void abrir() throws IOException {
        fichero = new File(nombreFichero);
        fr = new FileWriter(fichero);
        br = new PrintWriter(fr);
        abierto = true;
        if(abierto==true)
        	throw new IOException("Error el fichero ya estaba abierto ");
    }

    public void cerrar() throws IOException {
        if (abierto) {
            br.close();
            fr.close();
            abierto = false;
        } else {
            throw new IOException("El fichero ya estaba cerrado");
        }
    }

  public void escribeTexto (String linea) throws IOException{
	String rutita;
	 Scanner sn = new Scanner(System.in);

	 try {
		 System.out.println("Indicame el nombre del fichero");
		 rutita=sn.nextLine();
		 br = new PrintWriter(rutita);
		 br.println(linea);
		 br.close();
		
		 
	
		 
	 }catch (Exception e) {
		System.out.println(e);
	}
	  if(linea=="") {
		  throw new NullPointerException("Error no has introducido contenido");
  }
	  System.out.println("Indicame el nombre del fichero donde guardarlo");
	  rutita=sn.nextLine();
	  if(rutita==null)
		  throw new NullPointerException("Nombre del fichero vacio");
	  
	  
//	  Path ruta = Paths.get("./".concat(rutita));
//	  try(BufferedWriter bf = Files.newBufferedWriter(ruta)) {
//
//	  bf.write(linea);
//
//	  }catch (Exception e) {
//		
//	}
  }
  public void escribeTexto(List<String> texto) throws IOException {
	  boolean salir=false;
	  br = new PrintWriter(this.nombreFichero);
	  Iterator<String>iterador = texto.iterator();
	  while(iterador.hasNext()) {
		  String leer= (String)(iterador.next());
		  br.println(leer);
  
	  }
	  br.close();
  }
}

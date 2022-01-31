package es.marca.futbol;
import es.marca.futbol.jugadores.*;
import java.util.Scanner;
public class PruebaFutbolista {
    public static void main(String[] args) {
        Futbolista f1 = new Futbolista();
        Futbolista f2 = new Futbolista();
        Scanner sc = new Scanner(System.in);
        
        String nombre, apellidos;
        boolean lesionado;
        int numGoles;
        double salario;
        //Variables 
        
        f1.setNombre("Antonio");
        nombre=f1.getNombre();
        f1.setApellido("Rodriguez");
        apellidos=f1.getApellidos();
        f1.setSalario(12000);
        salario=f1.getSalario();
        f1.marcaGol(2);
        f1.seLesiona();
        f1.golAnulado();
        f1.marcaGol(2);
        f1.seRecupera();
        lesionado=f1.getLesionado();
        numGoles=f1.getNumGoles();
        System.out.println("Nombre y apellidos del Futbolista: " + nombre +", "+ apellidos);
        System.out.println("Salario del futbolista: " +salario+ " €");
        System.out.println("Este jugador ha marcado: " +numGoles);
        System.out.println("Jugador lesionado?: " +lesionado);
        
        //Futbolista 1
        
        f2.setNombre("ALberto");
        nombre=f2.getNombre();
        f2.setApellido("Gomez");
        apellidos=f2.getApellidos();
        f2.setSalario(25000);
        salario=f2.getSalario();
        f2.marcaGol(6);
        f2.golAnulado();
        f2.golAnulado();
        f2.golAnulado();
        f2.marcaGol(1);
        f2.seLesiona();
        lesionado=f2.getLesionado();
        numGoles=f2.getNumGoles();
        System.out.println("Nombre y apellidos del Futbolista: " + nombre +", "+ apellidos);
        System.out.println("Salario del futbolista: " +salario+ " €");
        System.out.println("Este jugador ha marcado: " +numGoles);
        System.out.println("Jugador lesionado?: " +lesionado);
        //Futbolista 2
        
    }
}

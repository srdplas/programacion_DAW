/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.personapractica;

public class PersonaPractica {
    public static void main(String[] args) {
        Persona jugador = new Persona(); //Creamos y definimos
        Persona chico; //Definimos el objeto
        chico = new Persona(); //Creamos el objeto
        
       //METODOS
        System.out.println("Unidad 1 Practica 4");
        jugador.cambiaApellidos("Cabrero Zayas");
        jugador.cambiaNombre("Yuri");
        jugador.cambiaEdad(21);
        //Cambiamos los valores default del objeto Yuri
        jugador.imprimeNombre();
        jugador.imprimeApellidos();
        jugador.imprimeEdad();
        //Imprimimos los valores del objeto Yuri
        System.out.println("Cambiamos el nombre del Objeto");
        jugador.cambiaNombre("Jaime");
        jugador.cambiaApellidos("Rodriguez Montoro");
        jugador.cambiaEdad(12);
        //cambiamos los valores del objeto Yuri
        
        jugador.imprimeNombre();
        jugador.imprimeApellidos();
        jugador.imprimeEdad();
        //Imprimimos en pantalla los valores que hemos cambiado
    }
}

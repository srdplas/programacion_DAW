package com.mycompany.personapractica;

public class Persona {
    public String nombre;
    public String apellidos;
    public int edad;
    //Ahora vienen los comportamientos
    public void cambiaNombre (String nombreNuevo){
        nombre = nombreNuevo;
    }
    public void imprimeNombre (){
        System.out.println("Nombre: " + nombre);
    } //nombre
    public void cambiaApellidos (String apellidosNuevo) {
        apellidos = apellidosNuevo;
    } //apellidos
    public void imprimeApellidos (){
        System.out.println("Apellidos: " + apellidos);
        //Imprime "Apellidos: " y el valor que tenga la caracteristica apellidos
    }
    public void cambiaEdad(int edadNueva){
        edad = edadNueva;
    }
    public void imprimeEdad (){
        System.out.println("Edad: " + edad);
        //Imprime "Edad: " y el valor que tenga la caracteristica nombre
    } //edad
}


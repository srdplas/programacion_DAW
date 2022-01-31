package com.mycompany.u1.p4.persona;

public class Persona {
    public String nombre;
    public int edad;
    public boolean casada;
    public boolean trabaja;
    //YA HEMOS DICHO LAS CARACTERISTICA DE LA CLASE PERSONA
    
    //METODOS DE LA CLASE PERSONA
    public void cambiaNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }//METODO PARA CAMBIAR EL NOMBRE
    public void imprimeNombre(){
        System.out.println("Nombre: " + nombre);
    }//METODO PARA IMPRIMIR EL NOMBRE
    public void cambiaEdad(int nuevaEdad){
        edad = nuevaEdad;
    }//METODO PARA CAMBIAR LA EDAD
    public void imprimeEdad(){
        System.out.println("Edad: " + edad);
    }//METODO PARA IMPRIMIR LA EDAD
    public void consigueTrabajo(){
        trabaja = true;
    }//METODO PARA CAMBIAR TRABAJA A TRUE
    public void pierdeTrabajo(){
        trabaja = false;
    }//METODO PARA CAMBIAR TRABAJA A FALSE
    public void imprimeEstadoTrabajo(){
        System.out.println("Trabaja?" + trabaja);
    }//METODO PARA IMPRIMIR EL VALOR DE TRABAJA
    public void seCasa(){
        casada = true;
    }//METODO PARA CAMBIAR CASADA A TRUE
    public void seDivorcia(){
        casada = false;
    }//METODO PARA CAMBIAR CASADA A FALSE
    public void imprimeEstadoCivil (){
        System.out.println("Casada?" + casada);
    }//METODO PARA IMPRIMIR EL VALOR DE CASADA
}

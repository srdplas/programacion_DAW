/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srdplas.u3e15mail;

/**
 *
 * @author srdpl
 */
public class Fichero implements InterfazFichero {

    private String nombre, codificacion, contenido;
    private int tamanioEnBytess;
    private boolean abierto;

    private final String codifi = "UTF-8";

    public Fichero() {
        this.codificacion = codifi;
    }

    /*private void codificacionDefecto(){
        if(!"UTF-8".equals(codificacion)&&!"UTF-16".equals(codificacion)){
            this.codificacion=codifi;
        }
    }*/
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setCodificacion(String codificacion) {
        if (!"UTF-8".equalsIgnoreCase(codificacion) && !"UTF-16".equalsIgnoreCase(codificacion)) {
            this.codificacion = codifi;
        } else {
            this.codificacion = codificacion.toUpperCase();
        }
    }

    @Override
    public String getCodificacion() {
        return codificacion;
    }

    @Override
    public void abrir() {
        if (nombre == null) {
            System.out.println("Error el Fichero no tiene nombre");
        } else {
            System.out.println("Abriendo fichero...");
            abierto = true;
        }
    }

    @Override
    public void cerrar() {
        if (nombre == null) {
            System.out.println("Error el Fichero no tiene nombre");
        } else {
            System.out.println("Cerrando fichero...");
            abierto = false;
        }

    }

    @Override
    public void borraContenido() {
        if (abierto) {
            this.contenido = null;
            tamanioEnBytess=0;
        } else {
            System.out.println("Error - Debes abrir el fichero para borrar contenido");
        }

    }

    @Override
    public void agregaContenido(String contenido) {
        if (abierto) {
            this.contenido = contenido;
             if ("UTF-8".equals(codificacion)) {
            tamanioEnBytess=tamanioEnBytess+(this.contenido.length()*1);
           
        } else {
            if ("UTF-16".equals(codificacion)) {
              tamanioEnBytess=tamanioEnBytess+(this.contenido.length()*2);
            }}
        } else {
            System.out.println("Error -  Debes abrir el fichero para a??adir contenido");
        }
    }

    @Override
    public String getContenido() {
         
        return contenido;
    }

    @Override
    public int getTamanioEnBytes() {
       return tamanioEnBytess;
    }

    @Override
    public String toString() {
        return "Fichero: "+nombre+","
                + " Contenido: "+contenido+", Tama??o: "+tamanioEnBytess+" bytes"
                + ", Codificacion: "+codificacion;
    }
    
    

}

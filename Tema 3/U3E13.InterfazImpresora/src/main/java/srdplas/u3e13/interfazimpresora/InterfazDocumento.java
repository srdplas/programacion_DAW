/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srdplas.u3e13.interfazimpresora;

/**
 *
 * @author srdpl
 */
public class InterfazDocumento implements Interfaz{
    
    private int numPaginas;
    private String titulo;
    private String contenido;
        
    @Override
    public int getNumPaginasImpresion() {
        return numPaginas;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getContenido() {
        return contenido;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo=titulo;
    }

    @Override
    public void setContenido(String contenido) {
        this.contenido=contenido;
    }

    @Override
    public void setNumPaginasImpresion(int numPaginas) {
        this.numPaginas=numPaginas;
    }
    
}

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
public interface Interfaz {
    
    int getNumPaginasImpresion();
    String getTitulo();
    String getContenido();
    
    void setTitulo(String titulo);
    void setContenido(String contenido);
    void setNumPaginasImpresion(int numPaginas);
}

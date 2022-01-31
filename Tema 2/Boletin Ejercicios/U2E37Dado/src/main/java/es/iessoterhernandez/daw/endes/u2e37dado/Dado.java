/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iessoterhernandez.daw.endes.u2e37dado;

/**
 *
 * @author srdplas
 */
public class Dado {
    
    public int tirar_dado(){
        int tirar_dado=(int)(Math.random()*6+1);
        return tirar_dado;
    }
    
}

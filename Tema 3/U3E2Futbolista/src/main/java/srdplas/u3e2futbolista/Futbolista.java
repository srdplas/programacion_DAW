/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srdplas.u3e2futbolista;

/**
 *
 * @author srdpl
 */
public class Futbolista {
    
    private String nombre;
    private String apellidos;
    private int numGoles;
    private double salario;
    private boolean lesionado;

    public Futbolista(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }
    
    public void marcaGol(){
       numGoles++;
    }    
    public void marcaGol(int numGoles){
        this.numGoles=this.numGoles+numGoles;
    }
    public void golAnulado(){
        if(numGoles==0){
            System.out.println("Error no se puede anular el gol");
        }else{
        numGoles--;
    }}
    public void golAnulado(int numGoles){
               
        if(this.numGoles-numGoles<0){
            System.out.println("Error no se puede anular los goles");
        }else{
            this.numGoles=this.numGoles-numGoles;
        }
    }
    
}


package es.marca.futbol.jugadores;

public class Futbolista {
    public String nombre, apellidos;
    public int numGoles;
    public double salario;
    public boolean lesionado;
    //Propiedades

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public boolean getLesionado() {
        return lesionado;
    }
    public double getSalario() {
        return salario;
    }
    // Todos los gets

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setApellido(String apellidos) {
        this.apellidos = apellidos;
    }

    //Todos los sets
    public void marcaGol(int numGoles){
        this.numGoles += numGoles;
    }
    public void golAnulado(){
        numGoles--;
    }
    public void seLesiona(){
        lesionado = true;
    }
    public void seRecupera(){
        lesionado = false;
    }
}

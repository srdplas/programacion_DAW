package srdplas.u4.e4.personacondicional;

/**
 *
 * @author srdpl
 */
public class PersonaCondicional {
    public int edad, altura, peso;
    public boolean estaCasado, trabajador, cochePropio;

    /**
     * 
     * @return trabajador
     */
    public boolean isTrabajador() {
        return trabajador;
    }
    /**
     * 
     * @param trabajador 
     */
    public void setTrabajador(boolean trabajador) {
        this.trabajador = trabajador;
    }
    /**
     * 
     * @return cochePropio
     */
    public boolean isCochePropio() {
        return cochePropio;
    }

    public void setCochePropio(boolean cochePropio) {
        this.cochePropio = cochePropio;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double salario;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isEstaCasado() {
        return estaCasado;
    }

    public void setEstaCasado(boolean estaCasado) {
        this.estaCasado = estaCasado;
    }
    
}

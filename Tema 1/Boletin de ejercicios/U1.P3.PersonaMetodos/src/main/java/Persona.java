/**
 *
 * @author srdplas
 */
public class Persona {
    public static void main(String args[]){
        //Seleccionamos la Clase principal
    }
    public String nombre;
    public String apellidos;
    public int edad;
    //Pasamos a escribir los metodos de la clase persona
    public void cambiaNombre (String nombreNuevo) {
        nombre = nombreNuevo;
    }
    public void imprimeNombre () {
        System.out.println("Nombre: " + nombre);
        //Imprime "Nombre: " y el valor que tenga la caracteristica nombre
    }
    public void cambiaApellidos (String apellidosNuevo) {
        apellidos = apellidosNuevo;
    }
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
    }
}
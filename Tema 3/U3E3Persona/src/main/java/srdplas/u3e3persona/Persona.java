
package srdplas.u3e3persona;

/**
 *
 * @author srdpl
 */
public class Persona {
     private String nombre;
     private String dni;
     private Vehiculo coche[]= new Vehiculo[3];
     private int numCochesActual;

    public Persona() {
    }

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void comprarCoche(Vehiculo coche){
        
                if(numCochesActual>=this.coche.length){
                    System.out.println("Error no puedes comorar mas coches");
                }else {
                        this.coche[numCochesActual]=coche;
                        numCochesActual++;
            }
       }
    
    public void arrancarCoche(Vehiculo coche){
        coche.arrancar();
    }
    
    public void apagarCoche(Vehiculo coche){
        coche.apagar();
    }

    public void recorrerDistancia(Vehiculo coche, double numKm){
        coche.recorrerDistancia(numKm);
    }
    
    public void reponerCombustible(Vehiculo coche, double numLitros){
        coche.reponerCombustible(numLitros);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Vehiculo[] getCoche() {
        return coche;
    }

    public int getNumCochesActual() {
        return numCochesActual;
    }
    
    

}

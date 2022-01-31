package srdplas.u3e2autoprueba;

/**
 *
 * @author srdpl
 */
public class Ascensor implements AscensorInterface {

    private String marca, modelo;
    private int numMaxPlantasEdificio, plantaActual;

    public Ascensor(String marca, String modelo, int numMaxPlantasEdificio) {
        this.marca = marca;
        this.modelo = modelo;
        this.numMaxPlantasEdificio = numMaxPlantasEdificio;
        this.plantaActual = 0;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public int getNumMaxPlantasEdificio() {
        return numMaxPlantasEdificio;
    }

    @Override
    public int getPlantaActual() {
        return plantaActual;
    }

    @Override
    public void sube(int plantaDestino) {
        if (plantaDestino<this.numMaxPlantasEdificio||plantaDestino==numMaxPlantasEdificio) {
            if (plantaDestino >= this.plantaActual) {
                if (plantaDestino == this.plantaActual) {
                    System.out.println("Ya estabas en el piso " + this.plantaActual);
                }else{
                    this.plantaActual=plantaDestino;
                    System.out.println("Has llegado a la planta " + this.plantaActual); 
            }}else
            {System.out.println("Mejor Pulse el botón para subir"); 
                
            }
        }else{
            System.out.println("- ERROR - Planta "+plantaDestino+" no encontrada");
        }
        
    }

    @Override
    public void baja(int plantaDestino) {
        if (plantaDestino<=this.numMaxPlantasEdificio && plantaDestino >= 0) {
            if (plantaDestino <= this.plantaActual) {

                if (plantaDestino == this.plantaActual) {
                    System.out.println("Ya estabas en el piso " + this.plantaActual);
   
                } else{
                    System.out.println("Has llegado a la planta " + plantaDestino);
                    this.plantaActual=plantaDestino;
                }
            }else{
                System.out.println("Mejor Pulse el botón para subir");
            } 
        }else{
            System.out.println("- ERROR - Planta "+plantaDestino+" no encontrada");
        }
    }

    @Override
    public String toString() {
        return "Ascensor Marca " + marca + " Modelo" + modelo + " Numero de Plantas " + numMaxPlantasEdificio + " Planta Actual " + plantaActual;
    }

}

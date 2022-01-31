package srdplas.u3e3persona;

/**
 *
 * @author srdpl
 */
public class PruebaPersona {

    public static void main(String[] args) {
        Persona p = new Persona("Yuri", "2759474E");
        Vehiculo bmw = new Vehiculo();
        Vehiculo seat = new Vehiculo();
        Vehiculo ford = new Vehiculo();
        Vehiculo mercedes = new Vehiculo();
        bmw.setNumRuedas(4);
        bmw.setPotencia(250);
        bmw.setConsumoPor100Km(0.20);

        seat.setNumRuedas(4);
        seat.setPotencia(250);
        seat.setConsumoPor100Km(20);

        ford.setNumRuedas(4);
        ford.setPotencia(250);
        ford.setConsumoPor100Km(20);

        mercedes.setNumRuedas(4);
        mercedes.setPotencia(250);
        mercedes.setConsumoPor100Km(20);

        System.out.println("Propietario" + p.getNombre() + " con DNI: " + p.getDni());
        p.comprarCoche(bmw);
        p.comprarCoche(ford);
        p.comprarCoche(mercedes);
        System.out.println("Numero de vehiculos: " + p.getNumCochesActual());
        p.comprarCoche(seat);
        p.comprarCoche(mercedes);
        p.arrancarCoche(bmw);
        p.reponerCombustible(bmw, 60);
        p.recorrerDistancia(bmw, 12);
        System.out.println("Deposito:" + bmw.getLitrosEnDeposito());

    }
}

package srdplas.u3e2autoprueba;

/**
 *
 * @author srdpl
 */
public class PruebaAscensor {

    public static void main(String[] args) {
        Ascensor as = new Ascensor("Lotus", "B300", 10);

        System.out.println(as);
        as.sube(20);
        as.sube(5);
        System.out.println(as);
        as.sube(1);
        as.baja(1);
        System.out.println(as);
        as.baja(5);
        as.baja(-1);
        System.out.println("El Ascensor está en  la planta "+as.getPlantaActual());

    }
}

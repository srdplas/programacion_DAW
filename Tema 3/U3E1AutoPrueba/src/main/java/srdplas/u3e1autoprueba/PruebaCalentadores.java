package srdplas.u3e1autoprueba;

/**
 *
 * @author srdpl
 */
public class PruebaCalentadores {

    public static void main(String[] args) {
        Radiador r = new Radiador();
        Secador s = new Secador();

        r.setPotenciaMax(1000);
        s.setPotenciaMax(1000);

        System.out.println(r);
        r.graduarPotencia(80);
        System.out.println(r + "" + r.calculaPotenciaActual() + " W");
        r.encender();
        System.out.println(r + "" + r.calculaPotenciaActual() + " W");

        System.out.println(s);
        System.out.println(s + "" + s.calculaPotenciaActual() + " W");
        s.encender();
        System.out.println(s + "" + s.calculaPotenciaActual() + " W");
        s.encenderPrimera();
        System.out.println(s + "" + s.calculaPotenciaActual() + " W");
        s.encenderSegunda();
        System.out.println(s + "" + s.calculaPotenciaActual() + " W");

    }

}

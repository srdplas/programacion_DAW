package srdplas.u3e1autoprueba;

/**
 *
 * @author srdpl
 */
public class Secador extends Calentadores {

    private boolean resistencia1, resistencia2;

    @Override
    public String toString() {
        return "Secador ";
    }

    public void encenderPrimera() {
        if(encendido){
            if (resistencia1) {
            System.out.println(toString() + "la resistencia 1 ya estaba encendida");
        }resistencia1=true;
        }
    }

    public void encenderSegunda() {
        if(encendido){
            if (resistencia2) {
            System.out.println(toString() + "la resistencia 2 ya estaba encendida");
        }resistencia2=true;
        }
    }

    public void apagarPrimera() {
        if(encendido){
            if (!resistencia1) {
            System.out.println(toString() + "la resistencia 1 ya estaba apagada");
        }resistencia1=false;
        }
    }

    public void apagarSegunda() {
        if(encendido){
            if (!resistencia2) {
            System.out.println(toString() + "la resistencia 2 ya estaba apagada");
        }resistencia2=false;
        }

    }

    public boolean estadoResistencia1() {
        return resistencia1;
    }

    public boolean estadoResitencia2() {
        return resistencia2;
    }

    @Override
    public double calculaPotenciaActual() {
        double op=0;
        if (!resistencia1 & !resistencia2 || !encendido) {
            return op;
        } else {

            if (resistencia1 && !resistencia2 || !resistencia1 && resistencia2) {
                 op=(getPotenciaMax()/ 2);
                 return op;
            } else {
                if (resistencia1 && resistencia2) {
                    op=getPotenciaMax();
                }
            }
        }
        return op;
    }
}

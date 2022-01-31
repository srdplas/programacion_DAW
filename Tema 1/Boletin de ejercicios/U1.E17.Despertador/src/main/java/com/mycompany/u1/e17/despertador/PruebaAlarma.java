
package com.mycompany.u1.e17.despertador;

public class PruebaAlarma {
    public static void main(String[] args) {
        RelojDespertador rj = new RelojDespertador();
        rj.setHora(12, 39);
        rj.setHoraAlarm(14, 20);
        rj.getHoraActual();
        rj.getMinutoActual();
        rj.getHoraAlarma();
        rj.getMinutoAlarma();
       
        rj.imprimirHoraActual();
        rj.activarAlarma();
        rj.imprimirEstadoAlarma();
        rj.imprimirHoraAlarma();
        rj.sonarAlarma();
        
                
    }
}

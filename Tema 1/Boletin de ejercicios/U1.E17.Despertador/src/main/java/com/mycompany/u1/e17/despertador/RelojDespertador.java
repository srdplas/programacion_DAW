package com.mycompany.u1.e17.despertador;

public class RelojDespertador {
    public int numHora,numMinutos, numHoraAlarm, numMinAlarm;
    public boolean alarmaOn;
    
    public void setHora (int hora, int minutos){
        numHora = hora;
        numMinutos = minutos; 
    }
    public void setHoraAlarm (int horaAlarm, int minAlarm){
        numHoraAlarm = horaAlarm;
        numMinAlarm = minAlarm;
    }
     public int getHoraActual(){
       return numHora;
    }
    public int getMinutoActual(){
       return numMinutos;
    }
    public int getHoraAlarma(){
       return numHoraAlarm;
    }
    public int getMinutoAlarma(){
       return numMinAlarm;
    }
    public void activarAlarma(){
       alarmaOn = true;
       
    }
    public void desactivarAlarma(){
       alarmaOn = false;
       
    }   
    public void sonarAlarma(){
        System.out.println("PI PI PI PI... PI PI PI PI");
       
    }
    public void imprimirHoraActual(){
       System.out.println("Hora actual: " + numHora +" : " + numMinutos);
    }
    public void imprimirHoraAlarma(){
       System.out.println("Hora de la alarma: " + numHoraAlarm +" : " + numMinAlarm);
    }
    public void imprimirEstadoAlarma(){
       System.out.println("¿La alarma esta activada?: " + alarmaOn);
    }
}

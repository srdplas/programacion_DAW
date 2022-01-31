package com.mycompany.u1.p1.hotel;

public class PruebaHotel {
    public static void main(String[] args) {
        Hotel h1 = new Hotel();
        int numHabitacionOcupada, numTotalHabitacion;
        double beneficioDiario;
        h1.estableceNumTotalHabitaciones(20);
        h1.establecePrecioHabitacionDiaria(50);
        h1.estableceSuplementoPrecioTemporadaAlta(25);
        //Un dia en el Hotel de temporada alta
        h1.comienzaTemporadaAlta();
        h1.ocupaHabitacion();
        h1.ocupaHabitacion();
        h1.ocupaHabitacion();
        h1.ocupaHabitacion();
        numTotalHabitacion=h1.obtieneNumTotalHabitaciones();
        System.out.println("Habtitaciones totales del Hotel: "+ h1.obtieneNumTotalHabitaciones());
        numHabitacionOcupada=h1.obtieneNumHabitacionesOcupadas();
        System.out.println("Habitaciones Ocupadas del Hotel " +h1.obtieneNumHabitacionesOcupadas());       
        beneficioDiario=h1.calculaBeneficioDiario();
        System.out.println("El beneficio diario del Hotel es: "+ h1.calculaBeneficioDiario()+ " €");
        
        //Al dia siguiente en el hotel acaba la temporada alta
        h1.liberaHabitacion();
        h1.liberaHabitacion();
        h1.finalizaTemporadaAlta();
        h1.ocupaHabitacion();
        h1.liberaHabitacion();
        h1.liberaHabitacion();
        h1.ocupaHabitacion();
        h1.ocupaHabitacion();
        h1.ocupaHabitacion();
        numTotalHabitacion=h1.obtieneNumTotalHabitaciones();
        System.out.println("Habtitaciones totales del Hotel: "+ h1.obtieneNumTotalHabitaciones());
        numHabitacionOcupada=h1.obtieneNumHabitacionesOcupadas();
        System.out.println("Habitaciones Ocupadas del Hotel " +h1.obtieneNumHabitacionesOcupadas());       
        beneficioDiario=h1.calculaBeneficioDiario();
        System.out.println("El beneficio diario del Hotel es: "+ h1.calculaBeneficioDiario()+ " €");
        
        
        
        
    }
}

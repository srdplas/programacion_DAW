package com.mycompany.u1.p1.hotel;

public class Hotel {
    public int numTotalHabitaciones, numHabitacionesOcupadas;
    public double precioHabitacionDiario, suplementoPrecioTemporadaAlta;
    public boolean temporadaAlta;
    //PROPIEDADES CLASE HOTEL
    
    public void estableceNumTotalHabitaciones(int numTotal){
        numTotalHabitaciones = numTotal;
    }
    public void establecePrecioHabitacionDiaria(double nuevoPrecio){
        precioHabitacionDiario = nuevoPrecio;
    }
    public void estableceSuplementoPrecioTemporadaAlta(double nuevoIncremento){
        suplementoPrecioTemporadaAlta = nuevoIncremento;
    }
    public int obtieneNumHabitacionesOcupadas(){
        return numHabitacionesOcupadas;
    }
    public int obtieneNumTotalHabitaciones(){
        return numTotalHabitaciones;
    }
    public void ocupaHabitacion(){
        numHabitacionesOcupadas++;
    }
    public void liberaHabitacion(){
        numHabitacionesOcupadas--;
    }
    public void comienzaTemporadaAlta(){
        temporadaAlta = true;
        precioHabitacionDiario = (suplementoPrecioTemporadaAlta + precioHabitacionDiario);
    }
    public void finalizaTemporadaAlta(){
        temporadaAlta = false; 
        precioHabitacionDiario = (precioHabitacionDiario - suplementoPrecioTemporadaAlta);
    }
    public double calculaBeneficioDiario(){
        double precioDiario;
        precioDiario = (precioHabitacionDiario * numHabitacionesOcupadas);
        return precioDiario;
    }
    //METODOS DE LA CLASE HOTEL
}

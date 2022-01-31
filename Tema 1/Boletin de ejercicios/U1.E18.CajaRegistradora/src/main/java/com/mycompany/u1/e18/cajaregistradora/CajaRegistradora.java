package com.mycompany.u1.e18.cajaregistradora;

public class CajaRegistradora {
    public double importeCliente;
    public int numArticulosCliente;
    //CARACTERISTICAS DE LA CLASE
    public void abrirCaja(){
        importeCliente = 0;
        numArticulosCliente = 0;       
    }
    public void nuevoCliente(){
        importeCliente = 0;
        numArticulosCliente = 0;
    }
    public void registrarArticulo(double nuevoArticulo){
        numArticulosCliente ++;
        importeCliente = (nuevoArticulo + importeCliente);
    }
    public void imprimeTicketCliente(){
        System.out.println("El cliente ha comprado " + numArticulosCliente + " articulos por un precio total de " + importeCliente +" €");
    }
    //METODOS DE LA CLASE
}

package com.mycompany.u1.e18.cajaregistradora;
public class PruebaCajaRegistradora {
    public static void main(String[] args) {
        CajaRegistradora CajaRegistradora = new CajaRegistradora();
        CajaRegistradora.abrirCaja();
        CajaRegistradora.nuevoCliente();
        CajaRegistradora.registrarArticulo(12.95);
        CajaRegistradora.registrarArticulo(2.48);
        CajaRegistradora.registrarArticulo(20.06);
        CajaRegistradora.imprimeTicketCliente();
        //llega un cliente registra varios articulos
        //nos indica cuantos articulos ha comprado y el precio total
        
        CajaRegistradora.nuevoCliente();
        CajaRegistradora.registrarArticulo(5.95);
        CajaRegistradora.registrarArticulo(2.48);
        CajaRegistradora.registrarArticulo(2.48);
        CajaRegistradora.registrarArticulo(7.88);
        CajaRegistradora.imprimeTicketCliente();
        //llega un cliente registra varios articulos
        
    }
}

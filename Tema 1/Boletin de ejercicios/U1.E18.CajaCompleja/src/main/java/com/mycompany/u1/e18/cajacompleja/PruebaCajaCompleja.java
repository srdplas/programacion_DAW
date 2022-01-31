package com.mycompany.u1.e18.cajacompleja;
public class PruebaCajaCompleja {
    public static void main(String[] args) {
        CajaCompleja CajaRegistradora = new CajaCompleja();
        double pmedioArticulo, imedioCliente;
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
        CajaRegistradora.retirarArticulo(2.48);
        CajaRegistradora.registrarArticulo(2.48);
        CajaRegistradora.registrarArticulo(7.88);
        CajaRegistradora.imprimeTicketCliente();
        //llega un cliente registra varios articulos
        //nos indica cuantos articulos ha comprado y el precio total
        CajaRegistradora.nuevoCliente();
        CajaRegistradora.registrarArticulo(10.95);
        CajaRegistradora.registrarArticulo(3.48);
        CajaRegistradora.registrarArticulo(7.48);
        CajaRegistradora.registrarArticulo(3.48);
        CajaRegistradora.registrarArticulo(12.88);
        CajaRegistradora.imprimeTicketCliente();
        
        CajaRegistradora.imprimeCierreCaja();
        pmedioArticulo=CajaRegistradora.calculaPrecioMedioArticulosVendidos();
        System.out.println("Precio promedio de articulos vendidos durante el dia " + Math.round(CajaRegistradora.calculaPrecioMedioArticulosVendidos())+ " €");
        imedioCliente=CajaRegistradora.calculaImporteMedioPorCliente();
        System.out.println("Precio medio gastado por cliente durante el dia " + Math.round(CajaRegistradora.calculaImporteMedioPorCliente())+ " €");
        CajaRegistradora.cantidadClientes();
    }
}

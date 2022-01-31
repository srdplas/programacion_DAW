package com.mycompany.u1.e18.cajacompleja;

public class CajaCompleja {
    public double importeCliente, importeTotalCaja;
    public int numArticulosCliente, numClientesAtendidos, numArticulosVendidos;
    //CARACTERISTICAS DE LA CLASE
    public void abrirCaja(){
        importeCliente = 0;
        numArticulosCliente = 0;  
        numArticulosVendidos = 0;
        numClientesAtendidos = 0;
    }
    public void nuevoCliente(){
        importeCliente = 0;
        numArticulosCliente = 0;
        numClientesAtendidos ++;
    }
    public void registrarArticulo(double precio){
        numArticulosCliente ++;
        importeCliente = (precio + importeCliente);
        importeTotalCaja +=precio;
        numArticulosVendidos ++;
        
    }
    
    public void retirarArticulo(double precio){
        numArticulosCliente --;
        importeCliente =importeCliente -precio;
        importeTotalCaja -=precio;
    }
           
    public void imprimeTicketCliente(){
        System.out.println("El cliente ha comprado " + numArticulosCliente + " articulos por un precio total de " + importeCliente +" €");
    }
    //METODOS DE LA CLASE
    public void imprimeCierreCaja(){
        System.out.println("Se han vendido un total de " + numArticulosVendidos +" articulos" + " por un importe total de " + importeTotalCaja +" €");
    }
    public double calculaPrecioMedioArticulosVendidos(){
        double promedioArt;
        promedioArt = (importeTotalCaja/numArticulosVendidos);
        return promedioArt;
    }
     public double calculaImporteMedioPorCliente(){
        double promedioCli;
        promedioCli = (importeTotalCaja/numClientesAtendidos);
        Math.round(promedioCli);
        return promedioCli;
    }
     //Opcional
     
     public void cantidadClientes(){
         System.out.println("Han comprado en la tienda " + numClientesAtendidos + " clientes");
     }
}

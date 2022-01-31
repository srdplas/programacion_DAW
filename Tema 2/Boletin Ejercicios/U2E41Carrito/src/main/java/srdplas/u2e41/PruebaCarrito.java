
package srdplas.u2e41;

import java.util.Scanner;

/**
 *
 * @author srdplas
 */
public class PruebaCarrito {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Articulo godzilla = new Articulo();
        Articulo juguete = new Articulo();
        Articulo peluche = new Articulo();
        
        Carrito carro = new Carrito();
        
        double precio;
        int num=0;
        Articulo buscar = new Articulo();
       
        
        godzilla.setNombre("GodZilla");
        godzilla.setIdArticulo(4);
        godzilla.setPrecio(14.5);
        
        juguete.setNombre("Pokemon");
        juguete.setIdArticulo(2);
        juguete.setPrecio(24.5);
        
        peluche.setNombre("Osito Gominola");
        peluche.setIdArticulo(33);
        peluche.setPrecio(45.5);
        
       
        //Creamos un array para guardar los articulos.
        carro.guardaArticulo(peluche);
        
        carro.guardaArticulo(godzilla);
        
        carro.guardaArticulo(juguete);
        carro.muestraArticulos();
        precio=carro.getPrecioTotalCarrito();
        // Da error porque no tenemos iniciado el carrito
        
        System.out.println("Iniciamos carrito");
        carro.inicializaCarrito(3);
        
        carro.guardaArticulo(godzilla);
        carro.guardaArticulo(juguete);
        carro.guardaArticulo(juguete);
        carro.guardaArticulo(peluche);
        //Despues de iniciar el carrito le metemos articulos.
        
        
        
        
        //Buscamos el articulo que coincida con el id que le ponemos;
        System.out.println("Mostramos los articulos del carro");
        carro.muestraArticulos();
        System.out.println("Mostramos la cantidad de articulos");
        num=carro.getNumArticulos();
        System.out.println("Numeros de articulos en el carrito "+num);
        precio=carro.getPrecioTotalCarrito();
        System.out.println("Precio total del carrito: "+precio+" €");
        buscar=carro.buscaArticuloPorId(2);
        System.out.println(buscar.getIdArticulo());
        System.out.println("Intentamos meter en el carro un objeto superior al tamaño dela rray");
        carro.muestraArticulos();
        num=carro.getNumArticulos();
        System.out.println("Numeros de articulos en el carrito "+num);
        precio=carro.getPrecioTotalCarrito();
        System.out.println("Precio total del carrito: "+precio+" €");
        
        
    }
}

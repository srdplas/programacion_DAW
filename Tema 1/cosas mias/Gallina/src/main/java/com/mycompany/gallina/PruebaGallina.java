package com.mycompany.gallina;

public class PruebaGallina {
    public static void main(String[] args) {
        Gallina ben; //DEFINIMOS EL OBJETO BEN DE LA CLASE GALLINA
        ben = new Gallina(); //CREAMOS EL OBJETO GALLINA DE LA CLASE PERSONA
        //CREAMOS LOS METODOS
        ben.imprimeNombre();
        ben.imprimeEdad();
        ben.cambiaColor("");
        ben.imprimeColor();
        ben.imprimePeso();
        ben.imprimeCantidadHuevos();
        
        ben.cambiaNombre("Rodolfo");
        ben.cambiaColor("Rosa");
        ben.cambiaEdad(2);
        ben.cambiaPeso(25);
        ben.poneHuevos(2);
        ben.imprimeCantidadHuevos();
        ben.seDuerme();
        System.out.println("-------------------------");
        ben.imprimeNombre();
        ben.imprimeEdad();
        ben.imprimeColor();
        ben.imprimePeso();
        ben.imprimeCantidadHuevos();
        ben.estadoGallina();
        
        ben.seDespierta();
        ben.cambiaColor("Negro");
        ben.poneHuevos(6);
        ben.cambiaPeso(23.75);
        
        System.out.println("------------------------");
        
        ben.imprimeNombre();
        ben.imprimeEdad();
        ben.imprimeColor();
        ben.imprimePeso();
        ben.imprimeCantidadHuevos();
        ben.estadoGallina();
    }
}

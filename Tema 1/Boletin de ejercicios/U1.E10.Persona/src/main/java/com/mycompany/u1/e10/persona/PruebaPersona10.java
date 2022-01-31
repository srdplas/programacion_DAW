package com.mycompany.u1.e10.persona;

public class PruebaPersona10 {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        //DEACLARAMOS Y CREAMOS LOS OBJETOS
        
        p1.cambiaNombre("Carmen");
        p1.cambiaEdad(15);
        p2.cambiaNombre("Alberto");
        p2.cambiaEdad(16);
        //AÑADIMOS NOMBRES Y EDADES A P1 Y P2
        
        p1.imprimeNombre();
        p1.imprimeEdad();
        p1.imprimeEstadoTrabajo();
        p1.imprimeEstadoCivil();
        
        p2.imprimeNombre();
        p2.imprimeEdad();
        p2.imprimeEstadoTrabajo();
        p2.imprimeEstadoCivil();
        //IMPRIMIMOS LAS PROPIEDADES DE CADA OBJETO
        p1.cumpleAnios();
        p1.cumpleAnios();
        p1.cumpleAnios();
        p1.cumpleAnios();
        
        p2.cumpleAnios();
        p2.cumpleAnios();
        p2.cumpleAnios();
        //CUMPLEN AÑOS P1 Y P2
        System.out.println("Numero de años de Carmen " + p1.obtieneNumAnios() + " Años");
        System.out.println("Numero de años de Alberto " + p2.obtieneNumAnios() + " Años" );
        
    }
}

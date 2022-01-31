package com.mycompany.u1.p4.persona;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p1; //DEFINIMOS EL OBJETO P1 DE LA CLASE PERSONA
        p1 = new Persona();//CREAMOS EL OBJETO P1 DE LA CLASE PERSONA
        Persona p2;//DEFINIMOS EL OBJETO P2 DE LA CLASE PERSONA
        p2 = new Persona();//CREAMOS EL OBJETO P2 DE LA CLASE PERSONA
        
        //METODOS DE LOS OBJETOS P1 Y P2
        p1.cambiaNombre("Pepe");
        p2.cambiaNombre("Pepa");
        p1.cambiaEdad(18);
        p2.cambiaEdad(19);
        
        p1.imprimeNombre();
        p1.imprimeEdad();
        p1.imprimeEstadoTrabajo();
        p1.imprimeEstadoCivil();
        
        p2.imprimeNombre();
        p2.imprimeEdad();
        p2.imprimeEstadoTrabajo();
        p2.imprimeEstadoCivil();
        
        p1.consigueTrabajo();
        p1.pierdeTrabajo();
        p1.consigueTrabajo();
        p2.consigueTrabajo();
        p1.cambiaEdad(30);
        p2.cambiaEdad(31);
        p1.seCasa();
        p2.seCasa();
        p1.seDivorcia();
        
        p1.imprimeNombre();
        p1.imprimeEdad();
        p1.imprimeEstadoCivil();
        p1.imprimeEstadoTrabajo();
        
        p2.imprimeNombre();
        p2.imprimeEdad();
        p2.imprimeEstadoCivil();
        p2.imprimeEstadoTrabajo();
    }
}

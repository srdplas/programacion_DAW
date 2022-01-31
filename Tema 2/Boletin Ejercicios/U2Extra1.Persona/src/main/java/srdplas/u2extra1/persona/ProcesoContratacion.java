package srdplas.u2extra1.persona;

/**
 *
 * @author srdpl
 */
public class ProcesoContratacion {
    public static void main(String[] args) {
        Persona p = new Persona();
        String nombre;
        int aniosEnFront, aniosEnBack;
        boolean sabeAngular, sabeReact, sabeSpring, sabeLaravel, cochePropio, disponibleViajes;
        p.setNombre("Luisa");
        nombre=p.getNombre();
        p.setAniosEnFront(3);
        aniosEnFront=p.getAniosEnFront();
        p.setAniosEnBack(4);
        aniosEnBack=p.getAniosEnBack();
        
        p.setSabeAngular(false);
        sabeAngular=p.isSabeAngular();
        p.setSabeReact(true);
        sabeReact=p.isSabeReact();
        p.setSabeSpring(true);
        sabeSpring=p.isSabeSpring();
        p.setSabeLaravel(true);
        sabeLaravel=p.isSabeLaravel();
        p.setCochePropio(false);
        cochePropio=p.isCochePropio();
        p.setDisponibleViajes(true);
        disponibleViajes=p.isDisponibleViajes();
        
        System.out.println("Primera Fase Contratación");
        
        if(aniosEnFront>=2&&(sabeAngular||sabeReact)){
            System.out.println(nombre+" supera la primera Fase y podrán pasar a la siguiente");
            
            if(aniosEnBack>=2&&aniosEnBack<=5&&sabeSpring&&sabeLaravel){
                System.out.println(nombre+" supera la segunda y podrán pasar a la siguiente fase.");
                
                if (cochePropio||disponibleViajes) {
                    System.out.println(nombre+" supera la tercera fase");
                }else System.out.println(nombre+" No supera la tercera fase");
                
                
            }else System.out.println(nombre+" No supera la segunda fase y No pasarán a la siguiente fase");
            
            
            
            
        }else System.out.println(nombre+" No supera la primera fase y No pasarán a la siguiente fase.");
        
    }
}

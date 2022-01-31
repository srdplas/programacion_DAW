package srdplas.u2e14.bebe;

/**
 *
 * @author srdplas
 */
public class PruebaEdades {
    public static void main(String[] args) {
        Persona p = new Persona();
        int edad;
        String nombre;
        p.setNombre("Pedro");
        p.setEdad(30);
        
        nombre=p.getNombre();
        edad=p.getEdad();
        
        
        if(edad>=0&&edad<=3){
            System.out.println(nombre+" es un bebé");
        }else
        { if(edad>=4&&edad<12){
                    System.out.println(nombre+" es un niño");
        }else {
            if(edad>=12&&edad<=20){
                System.out.println(nombre+" es un adolescente");
            }else {
                
                    System.out.println(nombre+" es un adulto");
                
            }
        }
            
        }
        
        
    }
}

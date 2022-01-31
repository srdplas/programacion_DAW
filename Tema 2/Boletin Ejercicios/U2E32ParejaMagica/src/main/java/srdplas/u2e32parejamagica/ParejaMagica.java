
package srdplas.u2e32parejamagica;

/**
 *
 * @author srdpl
 */
public class ParejaMagica {
    public static void main(String[] args) {
        
        int x, y;
        
        for(x=0; x<=9; x++){
            if(x%2==0){
                for(y=0; y<9; y++){
                    if(x+y>6&&y<60&&y%2==1){
                        System.out.println(x +" y "+y+" pareja magica");
                    }
                }
            }else {
                for (y=0;y<=9;y++);
                if(x+y>6&&x*y<60&&y==1){
                    System.out.println(x+" y "+y+" pareja magica");
                }
            }
            
            
            
        }
        
        
    }
}

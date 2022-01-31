/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srdplas.u2e33triomagico;

/**
 *
 * @author srdpl
 */
public class TrioMagico {
    public static void main(String[] args) {
        
        int x, y, z;
        
        for(x=0; x<=9; x++){
            if(x%2==0){
                for(y=0; y<9; y++){
                   for(z=0; z<9; z++)
                    if(x+y+z>10&&x*y*z<90&&x%2==0&&z%2==0&&y%2==1){
                        System.out.println(x +" y "+y+" y "+z+" pareja magica");
                    }
                }
            
            }
            
            
            
        }
        
        
    }
}

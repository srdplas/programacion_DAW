
package es.iessoterhernandez.daw.endes.u2e37dado;

/**
 *
 * @author srdplas
 */
public class PruebaDado {
    public static void main(String[] args) {
        
    final int NUM_TIRADAS = 50;
            //Constante
    Dado d = new Dado();
    //Objeto dado
    int dados[]= new int[NUM_TIRADAS];   
            // Array de numeros enteros con el tamaño de la constante
    
    
    int uno=0, dos=0, tres=0, cuatro=0, cinco=0, seis=0;
            
    for(int i=0; i<dados.length;i++){
        dados[i]=d.tirar_dado();
    }
    
    for(int contador: dados){
        
        // SE ANALIZA EL CONTENIDO DEL ARRAY Y SE GUARDA EL NUMERO DE VECES QUE SALE UNA CARA DEL DADO EN UNA VARIABLE
        if(contador==6){
           seis++;
       }else{
           if(contador==5){
           cinco++;
       }else{
               if(contador==4){
           cuatro++;
       }else{
           if(contador==3){
           tres++;
       }else{
               if(contador==2){
           dos++;
       }else{
           if(contador==1){
           uno++;
    }}}}}}}
    
        System.out.println("El numero 6 ha aparecido "+seis);
        System.out.println("El numero 5 ha aparecido "+cinco);
        System.out.println("El numero 4 ha aparecido "+cuatro);
        System.out.println("El numero 3 ha aparecido "+tres);
        System.out.println("El numero 2 ha aparecido "+dos);
        System.out.println("El numero 1 ha aparecido "+uno);
        System.out.println("Se ha analizado "+NUM_TIRADAS);
      
       }
}

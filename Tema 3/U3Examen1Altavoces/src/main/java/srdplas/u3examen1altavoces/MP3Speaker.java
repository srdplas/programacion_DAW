package srdplas.u3examen1altavoces;

/**
 *
 * @author srdpl
 */
public class MP3Speaker extends Altavoces {
    private int pistas;
    private int max=101;
    private int almacenamiento[] = new int[max];

    public MP3Speaker(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    void play() {
        if(isEncendido()){
            System.out.println("Repoduciendo pista "+almacenamiento[pistas]);
        }else{
            System.out.println(toString()+"apagado");
        }
    }

    @Override
    void stop() {
        if(isEncendido()){
            System.out.println("Parando pista "+almacenamiento[pistas]);
        }else{
            System.out.println(toString()+"apagado");
        }
    }

    public void addNewTracks(int num) {
        
        for(int i=1; i<almacenamiento.length;i++){
            almacenamiento[i]=i;
            
        }
    }

    public void setTrackByNumber(int num){
        if(isEncendido()){
            if(num>=1&&num<=almacenamiento[num]){
                pistas =num;
            }else{
                System.out.println("Error pista no valida");
                if(almacenamiento[num]==0){
                    System.out.println("No hay ninguna pista en el "+toString());
                }
            } 
        }else{
            System.out.println(toString()+"apagado");
        }
    }
    
    public void nextTrack(){
        if(isEncendido()){
            if(pistas!=0){
                 for(int i=1;i<almacenamiento.length;i++){
                        if(almacenamiento[i]==pistas){
                            setTrackByNumber((i+1));
                        }
                    }
            }
        }else{
            System.out.println(toString()+"apagado");
        }
    }
    
    public void previousTrack(){
         if(isEncendido()){
            if(pistas!=0){
                if(pistas==1){
                    for(int i=1;i<almacenamiento.length;i++){
                        if(almacenamiento[i]==0){
                            setTrackByNumber((i-1));
                        }
                    }
                }
                
            }
        }else{
            System.out.println(toString()+"apagado");
        }
    }
    
    @Override
    public String toString() {
        return "MP3 ";
    }

}

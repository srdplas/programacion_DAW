package srdplas.u3e13.interfazimpresora;

/**
 *
 * @author srdpl
 */
public class Impresora implements InterfazImpresora{

    private String marca, modelo;
    private boolean encendido;
    private int numFolios, impreso;
    private String estado;

    public Impresora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.estado="Fuera de Servicio";
    }
    
    
    
    
    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void encender() {
        if(encendido==false){
           this.encendido=true;
        }System.out.println("Impresora ya encendida");
    }

    @Override
    public void apagar() {
        if(encendido==true){
           this.encendido=false;
        }else{
            System.out.println("Impresora fuera de servicio");
            estado="Fuera de Servicio";
        }
    }

    @Override
    public void cargarBandeja(int numFolios) {
        this.numFolios+=numFolios;
        
    }

    @Override
    public void imprimir(InterfazDocumento documento) {
        if(documento.getNumPaginasImpresion()>numFolios){
            System.out.println("Error: no hay suficiente papel para imprimir el documento "+documento.getTitulo());
            estado="NO hay suficiente papel";
        }else{
            System.out.println("Se está imprimiendo el documento "+documento.getTitulo()+" que ocupa "+ documento.getNumPaginasImpresion() + " páginas");
            numFolios-=documento.getNumPaginasImpresion();
            impreso++;
            estado="OK"; 
        }
    }

    @Override
    public String getEstado() {
       return estado;
    }
    
}

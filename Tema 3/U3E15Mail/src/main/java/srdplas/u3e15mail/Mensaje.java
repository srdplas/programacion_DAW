package srdplas.u3e15mail;

/**
 *
 * @author srdpl
 */
public class Mensaje implements InterfazMensajeMail {

    private String asunto, contenido, direccionEmailRemitente, direccionEmailDestinatario;
    private boolean enviado;
    private int pesoFichero;
    private InterfazFichero adjunto;

    @Override
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
   
    @Override
    public String getAsunto() {
        return asunto;
    }

    @Override
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String getContenido() {
        return contenido;
    }

    @Override
    public void setRemitente(String direccionEmail) {
        if (direccionEmail.length() >= 5 && direccionEmail.contains("@")) {
            this.direccionEmailRemitente = direccionEmail;
        }
    }

    @Override
    public String getRemitente() {
        return direccionEmailRemitente;
    }

    @Override
    public void setDestinatario(String direccionEmail) {
        if (direccionEmail.length() >= 5 && direccionEmail.contains("@")) {
            this.direccionEmailDestinatario = direccionEmail;
        }
    }

    @Override
    public String getDestinatario() {
        return direccionEmailDestinatario;
    }

    @Override
    public void setFicheroAdjunto(InterfazFichero fichero) {
        this.adjunto = fichero;
        pesoFichero=fichero.getTamanioEnBytes();
    }

    @Override
    public void eliminaFicheroAdjunto() {
        this.adjunto = null;
    }

    @Override
    public InterfazFichero getFicheroAdjunto() {
        return adjunto;
    }

    @Override
    public void envia() {
        if (direccionEmailDestinatario != null && direccionEmailRemitente != null) {
            if (contenido == null && asunto == null) {
                System.out.println("OJO estás enviando un mensaje sin asunto/contenido");
            }else{
                if(adjunto==null){
                    System.out.println("Mensaje enviado de "+direccionEmailRemitente+" a "+direccionEmailDestinatario+" con asunto "+asunto);
                }else {
                       System.out.println("Mensaje enviado de "+direccionEmailRemitente+" a "+direccionEmailDestinatario+" con asunto "+asunto+ " y con un fichero adjunto de "+pesoFichero);
                }
            }
        } else {
            System.out.println("Error comprueba las direcciones de correo");
        }
    }

    @Override
    public String toString() {
        return "Remitente "+direccionEmailRemitente+" Destinatario "+direccionEmailDestinatario+" Asunto: "+asunto+ " Contenido: "+contenido;
    }
    
}

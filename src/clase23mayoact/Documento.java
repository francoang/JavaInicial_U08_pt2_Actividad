package clase23mayoact;

/**
 * Clase que representa al documento de la persona segun el diagrama de clase.
 * Actividad 1
 * @author Angonoa Franco
 * @since Mayo 2020
 * @version 1.0
 */
public class Documento {
    /*
        CAMPOS
    */
    private long numero;
    private String tipoDocumento;
    
    /*
        CONSTRUCTORES
    */
    public Documento(){        
    }
    
    public Documento(long nro, String tipo){
        numero = nro;
        tipoDocumento = tipo;
    }
    
    /*
        METODOS
    */
    public void setNumero(long nuevoNro){
        numero = nuevoNro;
    }
    
    public long getNumero(){
        return numero;
    }
    
    public void setTipoDocumento(String nuevoTipo){
        tipoDocumento = nuevoTipo;
    }
    
    public String getTipoDocumento(){
        return tipoDocumento;
    }
    
    @Override
    public String toString(){
        return "[Numero: " + numero + ", tipo documento: " + tipoDocumento + "]";
    }
    
} //Fin de la clase

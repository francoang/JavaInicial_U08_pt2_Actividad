package clase23mayoact;

/**
 * Clase que representa a la persona segun el diagrama de clase.
 * Actividad 1
 * @author Angonoa Franco
 * @since Mayo 2020
 * @version 1.0
 */
public class Persona {
    /*
        CAMPOS
    */
    private int legajo, pais, ciudad;
    private String nombreApellido;
    private Documento documento;

    /*
        CONSTRUCTORES
    */
    public Persona(){
        
    }
    
    public Persona(int leg, String nom, Documento doc, int pais, int ciu){
        legajo = leg;
        nombreApellido = nom;
        documento = doc;
        this.pais = pais;
        ciudad = ciu;
    }
    
    /*
        METODOS
    */
    public void setLegajo(int nuevoLeg){
        legajo = nuevoLeg;
    }
    
    public int getLegajo(){
        return legajo;
    }
    
    public void setNombreApellido(String nuevoNom){
        nombreApellido = nuevoNom;
    }
    
    public String getNombreApellido(){
        return nombreApellido;
    }
    
    public void setDocumento(Documento doc){
        documento = doc;
    }
    
    public Documento getDocumento(){
        return documento;
    }
    
    public void setPais(int nuevoPais){
        pais = nuevoPais;
    }
    
    public int getPais(){
        return pais;
    }
    
    public void setCiudad(int nuevoCiu){
        ciudad = nuevoCiu;
    }
    
    public int getCiudad(){
        return ciudad;
    }
    
    @Override
    public String toString(){
        return "Legajo: " + legajo + ", Nombre: " + nombreApellido + ", documento: " + documento + ", pais: " + pais + ", ciudad: " + ciudad;
    }
    
} //Fin de la clase

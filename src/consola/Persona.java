package clase23mayoact;

/**
 * Clase que representa a la persona segun el diagrama de clase. Actividad 1
 *
 * @author Angonoa Franco
 * @since Mayo 2020
 * @version 1.0
 */
public class Persona {

    /*
        CAMPOS
     */
    private int legajo;
    private String nombreApellido;
    private Documento documento;
    private int pais;
    private int ciudad;

    /*
        CONSTRUCTORES
     */
    public Persona() {

    }

    public Persona(int legajo, String nombreApellido, Documento documento, int pais, int ciudad) {
        this.legajo = legajo;
        this.nombreApellido = nombreApellido;
        this.documento = documento;
        this.pais = pais;
        this.ciudad = ciudad;
    }
   
    /*
        METODOS
     */
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    public int getCiudad() {
        return ciudad;
    }

    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Persona{" + "legajo=" + legajo + ", nombreApellido=" + nombreApellido + ", documento=" + documento + ", pais=" + pais + ", ciudad=" + ciudad + '}';
    }   

} //Fin de la clase

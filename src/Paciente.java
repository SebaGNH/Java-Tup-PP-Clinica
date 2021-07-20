public class Paciente {
    /*
    2. Desarrolle la clase Paciente que contiene los siguiente atributos: dni (int), nombre (String), apellido (String),
        coberturaObraSocial (int), prestacion (Prestacion), cantidadSesiones (int)
    */

    private int dni;
    private String nombre;
    private String apellido;
    private int coberturaObraSocial;
    private Prestacion prestacion;
    private int cantidadSesiones;

    public Paciente (int dni, String nombre, String apellido, int coberturaObraSocial, Prestacion prestacion, int cantidadSesiones){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.coberturaObraSocial = coberturaObraSocial;
        this.prestacion = prestacion;
        this.cantidadSesiones = cantidadSesiones;
    }
    public String toString(){
        return "Dni: " + this.dni + ", Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", Cobertura Obra Social: " + this.coberturaObraSocial + this.prestacion+ ", Cantidad de Sesiones: " + this.cantidadSesiones;
    }

    public void setDni(int dni){
        this.dni = dni;
    }
    public int getDni(){
        return dni;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setCoberturaObraSocial(int coberturaObraSocial){
        this.coberturaObraSocial = coberturaObraSocial;
    }
    public int getCoberturaObraSocial(){
        return coberturaObraSocial;
    }
    public void setPrestacion(Prestacion prestacion){
        this.prestacion = prestacion;
    }
    public void cantidadSesiones(int cantidadSesiones){
        this.cantidadSesiones = cantidadSesiones;
    }
    public int getCantidadSesiones(){
        return cantidadSesiones;
    }



}
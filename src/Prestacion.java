/*
1. Desarrolle la clase Prestacion que contiene los siguiente atributos: codigo (int), descripcion (String), monto
(float).
*/
public class Prestacion {
    private int codigo;
    private String descripcion;
    private float monto;

    public Prestacion(int codigo, String descripcion, float monto){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public void setCodigo (int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }

    public void setMonto(float monto){
        this.monto = monto;
    }
    public float getMonto(){
        return monto;
    }

    public String toString(){
        return " Codigo: " + this.codigo + ", Descripcion: " + this.descripcion + ", Monto: " + this.monto;    
    }




}

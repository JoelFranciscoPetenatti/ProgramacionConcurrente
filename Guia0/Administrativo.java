package Guia0;

public class Administrativo extends Empleado {
    
    protected String categoria;
    protected int adicional_categoria;
    
    /*public Administrativo(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }*/

    public Administrativo(String categoria, int adicional_categoria, String legajo) {
        super(legajo);
        this.categoria = categoria;
        this.adicional_categoria = adicional_categoria;
    }
    
    protected String getCategoria() {
        return categoria;
    }

    protected void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    protected int getAdicional_categoria() {
        return adicional_categoria;
    }

    protected void setAdicional_categoria(int adicional_categoria) {
        this.adicional_categoria = adicional_categoria;
    }
    
}
    


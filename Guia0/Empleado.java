package Guia0;

public class Empleado extends Persona {
    protected String legajo;
    protected int antiguedad;
    protected int porc_antiguedad;
    protected String funcion;
    protected int salario;

    public Empleado(String legajo){       
        this.legajo=legajo;
    }
    
}

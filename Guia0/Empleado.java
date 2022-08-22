package Guia0;

public class Empleado extends Persona {
    protected String legajo;
    protected int antiguedad;
    protected int porc_antiguedad;
    protected String funcion;
    protected int salario;

    public Empleado(String legajo) {
        this.legajo = legajo;
    }

    public String getLegajo() {
        return legajo;
    }

    protected void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    protected int getPorc_antiguedad() {
        return porc_antiguedad;
    }

    protected void setPorc_antiguedad(int porc_antiguedad) {
        this.porc_antiguedad = porc_antiguedad;
    }

    protected String getFuncion() {
        return funcion;
    }

    protected void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    protected int getSalario() {
        return salario;
    }

    protected void setSalario(int salario) {
        this.salario = salario;
    }

    /* Polimorfismo por reemplazo del metodo toString de la superclase */
    public String toString() {
        return "Legajo: " + this.legajo.toString() + ", Antiguedad: " + this.antiguedad + " \n";
    }
}

package Guia0;

public class Tecnico extends Empleado {


    protected String titulo;
    protected int anio_titulo;
    protected int adicional_titulo;

    public Tecnico(String titulo, int anio_titulo, int adicional_titulo, String legajo) {
        super(legajo);
        this.titulo = titulo;
        this.anio_titulo = anio_titulo;
        this.adicional_titulo = adicional_titulo;
    }

    

    
}

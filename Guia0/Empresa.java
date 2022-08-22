package Guia0;

import java.util.*;

public class Empresa {
    
    public String nombre_Empresa;
    public List <Empleado> empleados = new LinkedList <Empleado> ();
    
    public Empresa (String nombre){
        nombre_Empresa = nombre;
    }
    
    public void agregarEmpleado (Empleado emp){
        empleados.add(emp);
    }
}

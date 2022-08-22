package Guia0;

import java.util.*;

public class Empresa {

    public String nombre_Empresa;
    public List<Empleado> empleados = new LinkedList<Empleado>();

    public Empresa(String nombre) {
        nombre_Empresa = nombre;
    }

    public void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
    }

    /*
     * Metodo que lista los empleados, de la empresa, que su antiguedad es mayor al
     * numero de años que deseemos comparar
     */
    public List<Empleado> empleados_antiguedad_mayor() {
        List<Empleado> empleados_cond = new LinkedList<Empleado>();
        for (int i = 0; i < this.empleados.size(); i++) {
            if (empleados.get(i).getAntiguedad() > 10) {
                empleados_cond.add(empleados.get(i));
            }
        }
        return empleados_cond;
    }
}

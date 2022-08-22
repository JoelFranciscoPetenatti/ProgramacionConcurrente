package Guia0;

public class Test_guia0 {

    public static void main() {
        Empresa empresa_1 = new Empresa("BPN");

        Empleado emp1 = new Empleado("bpn-100");
        emp1.setAntiguedad(4);
        Empleado emp2 = new Empleado("bpn-101");
        emp2.setAntiguedad(11);
        Empleado emp3 = new Empleado("bpn-102");
        emp3.setAntiguedad(5);
        Empleado emp4 = new Empleado("bpn-103");
        emp4.setAntiguedad(3);
        Empleado emp5 = new Empleado("bpn-104");
        emp5.setAntiguedad(20);
        Empleado emp6 = new Empleado("bpn-105");
        emp6.setAntiguedad(8);
        Empleado emp7 = new Empleado("bpn-106");
        emp7.setAntiguedad(6);
        Empleado emp8 = new Empleado("bpn-107");
        emp8.setAntiguedad(15);
        Empleado emp9 = new Empleado("bpn-108");
        emp9.setAntiguedad(18);
        // Agregando los empleados a la empresa
        empresa_1.agregarEmpleado(emp1);
        empresa_1.agregarEmpleado(emp2);
        empresa_1.agregarEmpleado(emp3);
        empresa_1.agregarEmpleado(emp4);
        empresa_1.agregarEmpleado(emp5);
        empresa_1.agregarEmpleado(emp6);
        empresa_1.agregarEmpleado(emp7);
        empresa_1.agregarEmpleado(emp8);
        empresa_1.agregarEmpleado(emp9);

        System.out.println(empresa_1.empleados_antiguedad_mayor().toString());
    }
}

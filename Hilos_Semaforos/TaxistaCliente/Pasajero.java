package Hilos_Semaforos.TaxistaCliente;

public class Pasajero extends Thread {
    private String nombre_pasajero;
    private Taxi taxi;

    public Pasajero(String nombre, Taxi taxi) {
        this.taxi = taxi;
        this.nombre_pasajero = nombre;
    }

    public void run() {
        while (true) {
            taxi.subirse();
            System.out.println(this.nombre_pasajero + " se subio al taxi");
            taxi.empezarViaje();
            taxi.bajarse();
            System.out.println(this.nombre_pasajero + " se bajo del taxi\n");
            taxi.liberarAsiento();
        }
    }
}

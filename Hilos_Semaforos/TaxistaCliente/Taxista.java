package Hilos_Semaforos.TaxistaCliente;

public class Taxista extends Thread {

    private String id_Taxista;
    private Taxi taxi;

    public Taxista(String id, Taxi taxi) {
        this.taxi = taxi;
        this.id_Taxista = id;
    }

    public void run (){
            while (true) {
                taxi.conducir();
                conduciendo();
                taxi.terminarViaje();
                System.out.println("viaje terminado");
            }
    }

    public void conduciendo(){
        System.out.println(this.id_Taxista +" viajando...");
        try {
            sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

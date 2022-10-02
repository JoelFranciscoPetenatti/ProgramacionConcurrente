package Hilos_Semaforos.TaxistaCliente;

import java.util.concurrent.Semaphore;

public class Taxi {

    protected Semaphore asiento = new Semaphore(1);
    protected Semaphore conducir = new Semaphore(0);
    protected Semaphore bajarse= new Semaphore(0);


    public void conducir(){
        try {
            conducir.acquire();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void subirse(){
        try {
            asiento.acquire();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bajarse(){
        try {
            bajarse.acquire();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void terminarViaje(){
        try {
            bajarse.release();
        } catch (Exception e) {}
    }

    public void empezarViaje(){
        try {
            conducir.release();
        } catch (Exception e) {}
    }

    public void liberarAsiento(){
        try {
            asiento.release();
        } catch (Exception e) {}
    }
}

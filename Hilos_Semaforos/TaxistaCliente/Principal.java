package Hilos_Semaforos.TaxistaCliente;

public class Principal {

    
    public static void main(String [] args) {
      Taxi taxi = new Taxi();
      Thread pasajero = new Pasajero("Pasajero_Uno",taxi);
      Thread taxista = new Taxista("taxi 1",taxi);
      
      pasajero.start();
      taxista.start();
      
      try {
      pasajero.join();
      taxista.join();
      } catch (Exception e) {
            System.out.println("Error");
      }
      
    /* main para un unico taxista y un unico pasajero */
/* 
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Thread taxista = new Taxista("taxi 1", taxi);
        Thread pasajero1 = new Pasajero("matias", taxi);
        Thread pasajero2 = new Pasajero("francisco",taxi);
        Thread pasajero3 = new Pasajero("Horacio", taxi);

        taxista.start();
        pasajero1.start();
        pasajero2.start();
        pasajero3.start();
        /*Thread clientes[] = new Pasajero[10];

        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Pasajero("el pasajero " + (i + 1), taxi);
        }
        taxista.start();
        for (int i = 0; i < clientes.length; i++) {
            clientes[i].start();
        }*//*intento fallido corre un solo pasajero */

    }
}

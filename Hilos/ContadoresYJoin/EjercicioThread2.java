package Hilos.ContadoresYJoin;

//Crear una clase llamada Contadador que contenga un atributo que sea un contador
//otro que sea el nombre del Hilo,
//Otro que sea el limite del contador, es decir, donde deba acabar
//Crea varios contadores y ejecutalos.

public class EjercicioThread2 {

    public static void main(String[] args) {
    //Creacion de contadores    
        Contador c1 = new Contador("Contador 1", 40);
        Contador c2 = new Contador("Contador 2", 20);
        Contador c3 = new Contador("Contador 3", 35);
        Contador c4 = new Contador("Contador 4", 50);
        Contador c5 = new Contador("Contador 5", 15);
        Contador c6 = new Contador("Contador 6", 32);
    //Creacion de Hilos    
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);
        Thread t5 = new Thread(c5);
        Thread t6 = new Thread(c6);
    //Damos inicio a los Hilos
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    //El join permite que hasta que cierto hilo no acabe no continua con los demas
    //Basicamente espera hasta que acabe cada hilo
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
        } catch (InterruptedException ex) {
            System.out.println("Error");
        }
        System.out.println("Fin de Progama");

    }

}

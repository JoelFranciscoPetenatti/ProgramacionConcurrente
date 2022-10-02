package Hilos_Semaforos.PruebaBasica;

    import java.util.concurrent.*;

    class Task implements Runnable {
        Semaphore semaphore = new Semaphore(1);
    
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("Hola Fran, soy "+ Thread.currentThread().getName());
                semaphore.release();
            } catch (Exception e) {
                System.out.println("ERROR");
            }
        }
    }
    
    public class PruebaBasica {
        public static void main(String[] args) {
            Task task = new Task();
            Thread t1 = new Thread(task);
            Thread t2 = new Thread(task);
            Thread t3 = new Thread(task);
            Thread t4 = new Thread(task);
            Thread t5 = new Thread(task);
            Thread t6 = new Thread(task);
    
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            t6.start();
        }
    }


















    


package Hilos.ProductorConsumidor;


 public class Productor extends Thread {
    
        private Buffer buffer;
        private final String letras = "abcdefghijklmnopqrstuvxyz";
    
        public Productor(Buffer b){
            this.buffer = b;
        }
        
        public void run(){
            while(true){
                try {
                    char c = letras.charAt((int) (Math.random() * letras.length()));
                    buffer.producir(c);
                    System.out.println("Depositado el caracter " + c + " del buffer");
                    
                    sleep((int) (Math.random() * 4000));
                } catch (InterruptedException ex) {
                    System.out.println("Error");
                }
            }
        }
        
    }

package Hilos.ProductorConsumidor;


public class Buffer {

    private char[] buffer;
    private int siguiente;
    private boolean estaVacia;
    private boolean estaLlena;
    
    public Buffer(int tamanio){
        this.buffer = new char[tamanio];
        this.siguiente = 0;
        this.estaVacia = true;
        this.estaLlena = false;
    }
    
    public synchronized char consumir(){
        while(this.estaVacia){
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Error");
            }
        }
        
        siguiente--;
        this.estaLlena = false;
        if(siguiente == 0){
            this.estaVacia = true;
        }
        
        notifyAll();
        
        return this.buffer[this.siguiente];
    }
    
    public synchronized void producir(char c){
        while(this.estaLlena){
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Error");
            }
        }
        
        buffer[siguiente] = c;
        siguiente++;
        this.estaVacia = false;
        if(siguiente == this.buffer.length){
            this.estaLlena = true;
        }
        
        notifyAll();
    }
    
}
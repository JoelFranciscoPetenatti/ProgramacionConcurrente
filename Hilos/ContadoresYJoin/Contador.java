package Hilos.ContadoresYJoin;

public class Contador implements Runnable {
    

private int contador;
private String nombre;
private int limite;

public Contador(String nombre, int limite){
    this.contador=0;
    this.nombre=nombre;
    this.limite=limite;
}

public void run(){
//Es bueno ponerle nombre al hilo para poder hacer el debug
//Debugear hilos es complicado ya que no hay un orden de ejecucion predefinido
    while(contador<limite){
        System.out.println("Hilo "+ nombre+ ": "+ contador);
        contador++;
    }
        System.out.println("Hilo "+ nombre+ " Ya ha acabado ");
    }
}



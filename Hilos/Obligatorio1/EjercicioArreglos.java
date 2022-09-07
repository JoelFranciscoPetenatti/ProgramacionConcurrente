package Hilos.Obligatorio1;

import java.util.Random;

/*Se adjunta la consigna:
6) Se dispone de un arreglo de números enteros comprendidos entre 1 y 10 con capacidad
para 50.000 números. Se desea disponer de un programa que efectúe la suma de
los componentes del arreglo utilizando una estrategia concurrente, que obtenga la
suma final mediante sumas parciales calculadas por una serie de hilos
independientes.
Escriba un programa que realice la tarea propuesta, y que cumpla con las
especificaciones siguientes:
● El arreglo debe llenarse con números enteros entre 1 y 10 generados
aleatoriamente. Nota: utilizar la clase Random de java.
● Habrá k hilos, entre los cuales se dividirá el trabajo a realizar: cada uno
debe ocuparse de proporcionar la suma parcial de un segmento del arreglo.
● Habrá un programa principal que creará y rellenará el arreglo de datos, y
escribirá el valor final resultante de la suma realizada por los hilos. /* */


public class EjercicioArreglos {
    
    public static void main(String[] args) {
        int[] arreglo = new int[50000];
        llenarArreglo(arreglo);
        int suma = sumaSecuencial(arreglo);

        MiHilo hilo1 = crearYComenzar(0, 10000, arreglo);
        MiHilo hilo2 = crearYComenzar(10001, 20000, arreglo);
        MiHilo hilo3 = crearYComenzar(20001, 30000, arreglo);
        MiHilo hilo4 = crearYComenzar(30001, 40000, arreglo);
        MiHilo hilo5 = crearYComenzar(40001, 49999, arreglo);

        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
            hilo5.join();
        } catch (InterruptedException e) {
            System.out.println("Error");
        }

        //Suma secuencial
        System.out.println("Suma Secuencial:" + suma);
        //SumaConcurrente

        System.out.println("Suma Concurrente: " + sumaConcurrente(hilo1, hilo2, hilo3, hilo4, hilo5));
    }

    public static int sumaConcurrente(MiHilo h1, MiHilo h2, MiHilo h3, MiHilo h4, MiHilo h5) {
        int suma = 0;
        suma = h1.getSuma() + h2.getSuma() + h3.getSuma() + h4.getSuma() + h5.getSuma();
        return suma;
    }

    public static int sumaSecuencial(int[] arr) {
        int longitud = arr.length;
        int suma = 0;
        int i;
        for (i = 0; i < longitud; i++) {
            suma = suma + arr[i];
        }
        return suma;
    }

    public static void llenarArreglo(int[] arr) {
        int longitud = arr.length;
        int i;

        for (i = 0; i < longitud; i++) {
            Random aleatorio = new Random();
            int x = aleatorio.nextInt(10);
            arr[i] = x;
        }
    }

    //Un método de fábrica que crea e inicia un hilo.
    public static MiHilo crearYComenzar(int inicio, int fin, int[] arreglo) {
        MiHilo miHilo = new MiHilo(inicio, fin, arreglo);
        miHilo.start(); //Inicia el hilo
        //miHilo.hilo.join();
        return miHilo;
    }
}


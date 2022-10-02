package Hilos.MostrandoNumerosYLetras;

/*Crear una clase llamada HiloNumerosLetras que 
implemente runnable y tenga de atributos un numero llamado tipo
Si el tipo es 1, mostrara los numero del 1 al 30 
Si el tipo es 2, mostrata las letras de la "a" a la "z"
*/

//En este caso los hilos no tienen prioridad, por lo que se ejectuan cuando tienen ganas basicamente
//Es decir no hay un orden predeterminado en la ejecucion de los hilos
//Este ejemplo se ejecuta sin un fin, simplemente son dos hilos que muestran numeros y letras a la vez, sin un stop



public class ejercicioThread1 {
    public static void main (String[]args){
//Creamos hilos
        HilosNumerosLetras h1= new HilosNumerosLetras(1);
        HilosNumerosLetras h2=new HilosNumerosLetras(2);
//Creamos los Hilos
        Thread t1 = new Thread(h1);
        Thread t2 =new Thread(h2);
//Ejecutamos el metodo .star() esto ejecuta el metodo run de cada hilo
//Cada hilo tiene su ejecucion
//Los hilos no tienen un orden especifico de ejecucion, simplemente se ejecuta el que primero llega
        t1.start();
        t2.start();
    }
}

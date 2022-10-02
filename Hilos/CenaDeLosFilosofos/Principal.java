package Hilos.CenaDeLosFilosofos;

/*Consigna:
 * La cena de los filósofos es un problema típico en programación de sincronización de procesos.
El enunciado es el siguiente:
Cinco filósofos alrededor de una mesa pasan su vida comiendo o pensando. Cada filósofo tiene un plato de arroz y un palillo a la izquierda de su plato. Cuando un filósofo quiere comer, cogerá los dos palillos de cada lado del plato y comerá. 
El problema es desarrollarel algoritmo que permita comer a los filósofos. Este algoritmo debe satisfacer la exclusión mutua (dos filósofos no pueden emplear el mismo palillo a la vez), además de evitar el interbloqueo y lainanición.
 */

public class Principal {
    
    public static void main (String []args){

        Mesa m = new Mesa(5);
        
        for(int i=1; i<=5;i++){
            Filosofo f = new Filosofo(m, i);
            f.start();
        }
    
    }
        


    }





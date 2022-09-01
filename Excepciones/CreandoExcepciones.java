package Excepciones;

import java.util.Random;
import java.util.Scanner;

class ExcepcionEdad extends Exception {
    /* Creamos la clase correspondiente a la excepcion que queremos crear */
    /*
     * Creamos la clase con dos contructores, uno con argumentos y el otro sin
     * argumentros
     */
    public ExcepcionEdad() {
    }

    public ExcepcionEdad(String arg) {
        super(arg);
    }
}

class ExcepcionRuleta extends Exception {
    /*
     * Creamos la clase correspondiente a la excepcion que queremos crear, en este
     * caso la Expecion correspondiente a la ruleta
     */
    public ExcepcionRuleta() {
    }

    public ExcepcionRuleta(String arg) {
        super(arg);
    }
}

class ExcepcionColeccion extends IndexOutOfBoundsException {
    public ExcepcionColeccion() {
        this("Intenta mostrar posiciones inexistentes");
    }

    public ExcepcionColeccion(String arg) {
        super(arg);
    }
}

public class CreandoExcepciones {
    /*
     * Metodo que recibe la edad de una persona y dispara una excepcion
     * si la persona es menor de edad
     */
    public static void menor_deEdad(int edad) {
        try {
            verificarEdad(edad);
        } catch (ExcepcionEdad e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void verificarEdad(int edad) throws ExcepcionEdad {
        if (edad >= 18) {
            System.out.println("Es mayor de edad");

        } else {

            throw new ExcepcionEdad("Es menor de edad");
        }
    }
    /*Metodo que recibe un numero de la rulet y dispara una excepcion
     * si no sale dicho numero
     */

     public static void ruleta(){
        Scanner sc= new Scanner(System.in);
        int numero;
        try{
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();
            Random aleatorio = new Random();
            int n=aleatorio.nextInt(36);
            verificarNumero(numero, n);
        
        }catch (ExcepcionRuleta e){
            e.printStackTrace();
        }
     }

     /*Creamos modulo correspondiente a la verificacion del numero random obtenido */
     public static void verificarNumero(int numero, int aleatorio) throws ExcepcionRuleta {
        if (numero == aleatorio) {
            System.out.println("FELICITACIONES HA GANADO");
        } else {
            throw new ExcepcionRuleta("El numero ganador es: <" + aleatorio + ">.Lo siento, su numero no ha salido");
        }
    }
    



}

package Excepciones;

import java.util.LinkedList;
import java.util.List;
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
    
    /*Metodo que recibe un numero de la ruleta y dispara una excepcion
     * si no sale dicho numero.
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

/*Creamos un metodo que permite ingresar 5 numeros a una coleccion
 * y trata de mostrar 7 valores de la misma
 */

public static void coleccion_Numeros() {
    List<Integer> coleccion = new LinkedList<Integer>();
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Ingrese 1er numero");
    num = sc.nextInt();
    coleccion.add(num);
    System.out.println("Ingrese 2do numero");
    num = sc.nextInt();
    coleccion.add(num);
    System.out.println("Ingrese 3er numero");
    num = sc.nextInt();
    coleccion.add(num);
    System.out.println("Ingrese 4to numero");
    num = sc.nextInt();
    coleccion.add(num);
    System.out.println("Ingrese 5to numero");
    num = sc.nextInt();
    coleccion.add(num);
    mostrarColeccion(coleccion);
}

public static void mostrarColeccion(List<Integer> coleccion) {
    try {
        for (int i = 0; i < coleccion.size(); i++) {
            verficarPosicion(i, coleccion);
        }
    } catch (ExcepcionColeccion e) {
        e.printStackTrace();
    }
}

public static void verficarPosicion(int i, List<Integer> coleccion) {
    if (i < coleccion.size()) {
        System.out.println("num: " + coleccion.get(i));
    } else {
        throw new ExcepcionColeccion();
    }
}

/*Creacion del main para testear los modulos que creamos */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //menor_deEdad(18);
    String respuesta = "si";

    /*
     * while (respuesta.equals("si")) {
     * ruleta();
     * System.out.println("Desea seguir jugando?");
     * respuesta = sc.nextLine();
     * 
     * }
     */

    //coleccion_Numeros(); 
}


}

package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseNineBis {
    public static void main(String[] args) {
        /*Realice un algoritmo que lea dos vectores de cien elementos y que calcule la suma de
éstos guardando su resultado en otro vector, el cual se debe presentar en forma
impresa.*/
        System.out.println("Programa para calcular la suma de los elementos de dos vectores y que el resultado de la suma \n" +
                "se guarde en otro vector");
        System.out.println("************************************************************************************************");
        //identar el codigo con CTRL + ALT + L

        //declaro los vectores y los inicializo
        int[] arrayNumbersA = new int[100];
        int[] arrayNumbersB = new int[100];
        int[] arrayNumbersC = new int[100];

        //metodo para igresar datos por teclado
        Scanner keyboard = new Scanner(System.in);

        //estrucura fori para cargar los datos de los dos vectores
        for (int i = 0; i < arrayNumbersA.length; i++) {

            System.out.println("Ingrese el valor para el arreglo A en la posicion " + i + ": ");
            arrayNumbersA[i] = keyboard.nextInt();

            System.out.println("Ingrese el valor para el arreglo B en la posicion " + i + ": ");
            arrayNumbersB[i] = keyboard.nextInt();

        }

        //estructura fori para guardar el proceso de suma en el tercer vector
        for (int i = 0; i < arrayNumbersA.length; i++) {
            arrayNumbersC[i] = arrayNumbersA[i] + arrayNumbersB[i];

        }

        //estructura fori para mostrar el resultado
        System.out.println("El resultado de la suma de los elementos de los vectores");
        for (int i = 0; i < arrayNumbersA.length; i++) {
            System.out.printf("indice: %d, valor: %d\n", i, arrayNumbersC[i]);

        }
    }
}

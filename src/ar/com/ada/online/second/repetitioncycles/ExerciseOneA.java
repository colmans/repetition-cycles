package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseOneA {
    public static void main(String[] args) {
        //son dos for en este ejercicio
        int resultSum = 0;
        //declarar el vector
        int[] arrayNumbers = new int[10]; //declaro el arreglo con 10 elementos porque el ejercicio lo dice

        Scanner keyboard = new Scanner(System.in);
        //programa para ingresar 10 elementos en el arreglo , cantidad de repeticiones y que sume todos esos numeros

        for (int i = 0; i < 10; i++) { // i<arrayNumbers.lenght para que se adapte al tamaño del arreglo
            System.out.printf("Ingrese el valor para la posicion %d en el arreglo:", i); //%d indica el numero de posicion
            arrayNumbers[i] = keyboard.nextInt();


        }

        for (int i = 0; i < arrayNumbers.length; i++) {
            resultSum += arrayNumbers[i]; // va ir sumando cada uno de los elementos que se ingresa
            //otra forma de codificar: resultSum  = resultSum + arrayNumbers[i];


        }

        System.out.printf("La suma de los elementos del arreglo es %d", resultSum);
    }
}

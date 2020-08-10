package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseOneB {
    public static void main(String[] args) {
        int resultSum = 0;
        int[] arrayNumbers = new int[10]; //declaro el array y el tamaño del array

        //metodo para ingresar los datos por teclado
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < arrayNumbers.length; i++) {

            System.out.printf("Ingrese el valor para la posicion %d del arreglo:", i);
            arrayNumbers[i] = keyboard.nextInt();

            resultSum = resultSum + arrayNumbers[i];


        }

        System.out.printf("La suma de los elementos del arreglo es: %d", resultSum);
    }
}

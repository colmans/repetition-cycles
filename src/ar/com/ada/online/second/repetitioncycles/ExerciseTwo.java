package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        System.out.println("Programa para obtener un vector (C) de N elementos que contenga la\n" +
                "suma de los elementos correspondientes de otros dos vectores (A y B).");
        System.out.println("*********************************************************************");
        //identar el codigo CTRL + ALT + L

        //DECLARO los vectores y la variable que guardara la cantidad de elementos que ingresa el usuario
        int[] arrayA;
        int[] arrayB;
        int[] arrayC;
        int sizeArray;

        //habilito Scanner para que el usuario ingrese los datos
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese cantidad de elementos del vector: ");
        sizeArray = keyboard.nextInt();

        //INICIALIZO los arrays con la variable sizeArray
        arrayA = new int[sizeArray];
        arrayB = new int[sizeArray];
        arrayC = new int[sizeArray];

        //primer FORI para guardar los elementos en el array
        for (int i = 0; i < sizeArray; i++) {
            System.out.println("Ingrese el valor para el arreglo A en la posicion " + i + ":");
            arrayA[i] = keyboard.nextInt();
            System.out.println("Ingrese el valor para el arreglo B en la posicion " + i + ":");
            arrayB[i] = keyboard.nextInt();
        }
        //segundo FORI para hacer el proceso de suma y guardarlo en el vector C
        for (int i = 0; i < sizeArray; i++) {
            arrayC[i] = arrayA[i] + arrayB[i];
        }

        //tercer FORI para mostrar los elementos almacenados en el vector C
        System.out.println("El resultado de la suma de los elementos del arreglo:");
        for (int i = 0; i < sizeArray; i++) {

            System.out.printf("indice: %d, valor: %d \n", i, arrayC[i]);

        }

    }
}

package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        //ejercicio 6(resuelto) con matrices (arreglos bidimensionales)
        int[][] matriz = new int[4][4]; //defino la matriz [filas][columnas]
        int zeroCounter = 0; //contador que dice el ejercicio

        //metodo para ingresar datos por teclado
        Scanner keyboard = new Scanner(System.in);
        //bucle doble FORI
        //el primer for me da el tamaño de las filas
        //el segundo for me da el tamaño de las columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {//matriz[i]porque entro en la fila i que corresponde a la columna i
                System.out.printf("Ingrese el valor para la matriz en la posicion %d, %d ", i, j);
                matriz[i][j] = keyboard.nextInt();//lleno la matriz con los datos que ingresan por el teclado

            }

        }
        //fori para peguntar si matriz en posicion i,j es igual 0, entonces el contador de cero = caontador de cero +1
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {//matriz[i]porque entro en la fila i que corresponde a la columna i
                if (matriz[i][j] == 0)//si en la posicion i,j = 0
                    zeroCounter = zeroCounter + 1; //aca va sumando cuando se cumple que una posicion i,j el usuario ingreso 0

            }


        }

        System.out.printf("La cantidad de ceros en la matriz es: %d", zeroCounter);
    }
}

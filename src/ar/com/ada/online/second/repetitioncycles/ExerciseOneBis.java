package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseOneBis {
    public static void main(String[] args) {

        System.out.println("Programa para obtener la matriz\n" +
                "transpuesta de cualquier matriz de orden M x N");
        //decalro las variables que van a contener las cantidades de filas y columnas
        int cantColumns;
        int cantRows;

        //declaro la matriz
        int[][] intMatrixOrigin;
        int[][] intMatrixTranspose;

        //metodo para ingresar datos por teclado, el usuario debe ingresar cantidad de filas y columnas
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese cantidad de filas:");
        cantRows = keyboard.nextInt();
        System.out.println("Ingrese cantidad de columnas");
        cantColumns = keyboard.nextInt();

        //inicializar las matrices con sus tamaños
        intMatrixOrigin = new int[cantRows][cantColumns];
        intMatrixTranspose = new int[cantColumns][cantRows]; //matriz traspuesta: su fila sera la columna de la matriz origen
        //matriz traspuesta sus columnas seran las filas de la matrix origen


        //primer FOR I para llenar la matriz origin
        for (int i = 0; i < intMatrixOrigin.length; i++) {
            for (int j = 0; j < intMatrixOrigin[i].length; j++) {
                System.out.printf("Ingrese el valor para la matrizOrigin en la posicion %d,%d:", i, j);
                intMatrixOrigin[i][j] = keyboard.nextInt();//se llana la matriz con los datos del usuario
            }
        }

        //FOR I para armar la matrixtraspost luego de ingresar los datos del usuario
        for (int i = 0; i < intMatrixOrigin.length; i++) {
            for (int j = 0; j < intMatrixOrigin[i].length; j++) {
                intMatrixTranspose[j][i] = intMatrixOrigin[i][j];


            }

        }


        // FOR I para mostrar la matriz origen

        for (int i = 0; i < intMatrixOrigin.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < intMatrixOrigin[i].length; j++) {
                System.out.print(intMatrixOrigin[i][j]);// para mostar en forma de matriz
                System.out.print(" | ");
            }
            System.out.println();
        }
        System.out.println();

        //FOR I para mostar la matrix traspuesta
        for (int i = 0; i < intMatrixTranspose.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < intMatrixTranspose[i].length; j++) {
                System.out.print(intMatrixTranspose[i][j]);// para mostar en forma de matriz
                System.out.print(" | ");
            }
            System.out.println();
        }


    }
}



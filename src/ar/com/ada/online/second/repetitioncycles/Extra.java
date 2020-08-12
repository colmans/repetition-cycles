package ar.com.ada.online.second.repetitioncycles;

public class Extra {

    public static void main(String[] args) {
        //clase para declarar un array de enteros y string e inicializar sin pedir datos
        int[] intArray = {1, 4, 6, 10, 100}; //vector de numeros inicializado
        String[] stringArray = {"Maria", "Pedro", "Julia"}; // vector de string inicializado

        //para declarar e inicilizar una matriz de enteros y otra de strings de diferentes tamaños
        int[][] intMatriz = {
                {3, 4, 8, 20}, //f0
                {5, 7, 18, 200},//f1
                {400, 1, 20, 500}//f2
        };

        System.out.println("\n");

        String[][] stringMatriz = {
                {"uno", "dos"}, //f0
                {"ocho", "trece"} //f1
        };

        System.out.println("\n");

        //for para mostrar el array de enteros
        for (int i = 0; i < intArray.length; i++) {
            //texto + concatenacion con la i + texto
            System.out.println("intArray[" + i + "]= " + intArray[i]);

        }
        System.out.println("\n");

        //for para mostrar el array de STRING
        for (int i = 0; i < stringArray.length; i++) {
            //textto + concatenacion con la i + texto
            System.out.println("stringArray[" + i + "]= " + stringArray[i]);

        }
        System.out.println("\n");
        //for para mostrar matriz de enteros
        for (int i = 0; i < intMatriz.length; i++) {
            for (int j = 0; j < intMatriz[i].length; j++) {
                System.out.println("intMatriz[" + i + "][" + j + "]= " + intMatriz[i][j]);


            }

        }
        System.out.println("\n");
        //for para mostrar matriz de string
        for (int i = 0; i < stringMatriz.length; i++) {
            for (int j = 0; j < stringMatriz[i].length; j++) {
                System.out.println("stringMatriz[" + i + "][" + j + "]= " + stringMatriz[i][j]);


            }

        }
    }
}


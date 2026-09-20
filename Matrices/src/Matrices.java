public class Matrices {
    static void main(String[] args) {
        // Definimos una matriz
        final var FILAS = 2;
        final var COLUMNAS = 3;
        int[][] matriz = new int[FILAS][COLUMNAS];
        // Modificar los valores de una matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        // Acceder a los valores
        System.out.println("Valor de [0][0]: " + matriz[0][0]);
        System.out.println("Valor de [1][1]: " + matriz[1][1]);

        // Recorrer filas
        for (int fil = 0; fil < FILAS; fil++){
            // Recorrer columnas
            for (int col = 0; col < COLUMNAS; col++){
                System.out.println("Valor [" + fil + "][" + col + "]: " + matriz[fil][col]);
            }
        }
        var matrizSimplificada = new int[][] {
                {100, 200, 300},
                {400, 500, 600},
                {700, 800, 900}
        };
    }
}
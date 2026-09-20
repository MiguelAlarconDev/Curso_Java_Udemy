public class RETO_SumaDiagonalMatriz {
    public static void main(String[] args) {
        System.out.println("*** SUMA DE LA DIAGONAL DE UNA MATRIZ ***");
        int[][] matriz = new int[3][3];
        int numInicial = 100;
        int sumaDiagonal = 0;
        // Llenar matriz de 100 en 100
        for (int fil = 0; fil < 3; fil++) {
            for (int col = 0; col < 3; col++) {
                matriz[fil][col] = numInicial;
                numInicial = numInicial + 100;
                if (fil == col) {
                    sumaDiagonal += matriz[fil][col];
                }
                System.out.print(matriz[fil][col] + " ");
            }
            System.out.println();
        }
        System.out.println("La suma de la diagonal de la matriz es: " +  sumaDiagonal);
    }
}
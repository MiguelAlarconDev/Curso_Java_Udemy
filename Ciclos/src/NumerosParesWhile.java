public class NumerosParesWhile {
    static void main(String[] args) {
        System.out.println("*** NUMEROS PARES DEL 1 AL 20 CON CICLO WHILE ***");
        var contador = 1;
        while (contador <= 20) {
            // Revisamos si es número par
            if (contador % 2 == 0)
                System.out.print(contador + " ");
            contador++;
        }
    }
}

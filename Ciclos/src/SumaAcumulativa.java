public class SumaAcumulativa {
    static void main(String[] args) {
        System.out.println("*** SUMA ACUMULATIVA ***");
        final var MAXIMO = 5;
        var acumuladorSuma = 0;
        var numero = 1;

        // Iterar los valores

        // While
        System.out.println("CICLO WHILE:");
        while (numero <= MAXIMO) {
            acumuladorSuma += numero;
            System.out.print(acumuladorSuma + " ");
            numero++;
        }
        System.out.println(" ");

        // Do while
        System.out.println("CICLO DO WHILE:");
        numero = 1;
        acumuladorSuma = 0;
        do {
            acumuladorSuma += numero;
            System.out.print(acumuladorSuma + " ");
            numero++;
        } while (numero <= MAXIMO);
        System.out.println(" ");

        // For
        System.out.println("CICLO FOR:");
        acumuladorSuma = 0;
        for (int i = 1; i <= MAXIMO; i++) {
            acumuladorSuma += i;
            System.out.print(acumuladorSuma + " ");
        }
    }
}

public class CicloWhile {
    static void main(String[] args) {
        System.out.println("*** CICLO WHILE ***");

        var contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador++);
        }
    }
}

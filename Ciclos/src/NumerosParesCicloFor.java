public class NumerosParesCicloFor {
    static void main(String[] args) {
        // Numeros pares del 0 al 20 con ciclo for
        System.out.println("*** CICLO FOR - NUMEROS DEL 0 AL 20 ***");
        for (var contador = 0; contador <= 20; contador++) {
            if (contador % 2 == 0)
                System.out.print(contador + " ");
        }
    }
}
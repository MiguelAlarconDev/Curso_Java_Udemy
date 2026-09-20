public class RETO_Numerosimpares {
    public static void main(String[] args) {
        System.out.println("*** NUMEROS IMPARES DEL 1 AL 20 CON DO WHILE ***");
        var contador = 1;
        do {
            if (contador % 2 != 0)
                System.out.print(contador + " ");
            contador++;
        } while (contador <= 20);
    }
}

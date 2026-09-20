import java.util.Scanner;

public class EJERCICIO_DentroDeRango {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        final int RANGO_MINIMO = 0;
        final int RANGO_MAXIMO = 5;
        System.out.print("Ingresa un numero: ");
        var numero = consola.nextInt();
        boolean enRango = (RANGO_MINIMO <= numero) && (RANGO_MAXIMO >= numero);
        System.out.println("Numero: " + numero + " -- ¿Está en rango?: " + enRango);
    }
}

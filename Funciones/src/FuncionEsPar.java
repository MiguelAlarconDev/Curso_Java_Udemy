import java.util.Scanner;

public class FuncionEsPar {
    // También se puede hacer con static boolean
    static void esPar(int num) {
        if (num % 2 == 0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");
    }

    public static void main(String[] args) {
        System.out.println("*** FUNCION ES PAR ***");
        var sc = new Scanner(System.in);
        System.out.print("Ingrese el número a evaluar: ");
        int numero = sc.nextInt();
        esPar(numero);
    }
}

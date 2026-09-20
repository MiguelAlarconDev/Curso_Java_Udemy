import java.util.Scanner;

public class FuncionSumar {
    static int sumar(int a, int b) {
        var resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** FUNCION SUMAR ***");
        System.out.print("Ingrese el primer numero entero: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int b = sc.nextInt();
        int resultadoFuncion= sumar(a, b);
        System.out.println("Resultado de la suma es: " + resultadoFuncion);
    }
}

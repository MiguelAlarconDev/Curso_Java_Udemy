import java.util.Scanner;

public class RETO_CompararDosNumeros {
    public static void main(String[] args) {
        System.out.println("*** EL MAYOR DE DOS NUMEROS ENTEROS ***");
        var sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        var num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el segundo numero: ");
        var num2 = Integer.parseInt(sc.nextLine());

        var numeroMayor = Math.max(num1, num2);
        System.out.print("El numero mayor es: " + numeroMayor);
    }
}

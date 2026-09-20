import java.util.Random;
import java.util.Scanner;

public class RETO_JuegoAdivinanzas {
    public static void main(String[] args) {
        System.out.println("*** ADIVINA EL NUMERO SECRETO ***");
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = random.nextInt(50)+1;
        int numeroIntentos = 0;
        boolean numeroEncontrado = false;
        do  {
            System.out.print("Ingresa el numero: ");
            int numeroAdivinado = sc.nextInt();
            numeroIntentos++;
            if (numeroAdivinado < numeroSecreto) {
                System.out.println("El número ingresado es menor que el número secreto");
            } else if (numeroAdivinado > numeroSecreto) {
                System.out.println("El número ingresado es mayor que el número secreto");
            } else {
                System.out.println("Adivinaste el número!");
                numeroEncontrado = true;
            }
        } while (!numeroEncontrado);
        System.out.println("Número secreto: " + numeroSecreto);
        System.out.println("Número de intentos: " + numeroIntentos);
    }
}
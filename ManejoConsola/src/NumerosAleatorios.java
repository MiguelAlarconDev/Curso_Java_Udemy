import java.util.Random;

public class NumerosAleatorios {
    static void main(String[] args) {
        System.out.println("*** NUMEROS ALEATORIOS ***");
        var random = new Random();

        // Generar un numero aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio: " + numeroAleatorio);

        // Generar un numero aleatorio entre 1 y 10
        var numeroAleatorio2 = random.nextInt(10) + 1;
        System.out.println("numeroAleatorio2: " + numeroAleatorio2) ;

        // Generar un numero aleatorio entre 0.0 y 0.1
        var flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteALeatorio: " + flotanteAleatorio);

         // Simular el lanzamiento de un dado
        var dado = random.nextInt(6) + 1;
        System.out.println("Resultado de lanzar el dado: " + dado);

    }
}

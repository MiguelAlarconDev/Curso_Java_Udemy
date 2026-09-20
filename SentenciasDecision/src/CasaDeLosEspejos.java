import java.util.Scanner;

public class CasaDeLosEspejos {
    static void main(String[] args) {
        System.out.println("*** CASA DE LOS ESPEJOS ***");
        var consola = new Scanner(System.in);
        System.out.print("¿Cuál es tu edad?: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.print("¿Tienes miedo a la oscuridad?: ");
        var tieneMiedoOscuridad = Boolean.parseBoolean(consola.nextLine());

        // Verificacion
        if (!tieneMiedoOscuridad && edad > 10) {
            System.out.println("\nBienvenid@ a la Casa de los espejos");
        } else {
            System.out.println("\nLo siento, no puedes ingresar");
        }
    }
}

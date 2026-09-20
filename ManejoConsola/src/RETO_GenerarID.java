import java.util.Random;
import java.util.Scanner;

public class RETO_GenerarID {
    public static void main(String[] args) {
        System.out.println("*** GENERADOR DE ID ***\n");
        // Debe solicitar nombres, apellidos  fecha de nacimiento
        // Debe generar un numero aleatorio de 4 digitos, si es menor a 4 digitos se completará con 0 a la izquierda
        // Juntar ejemplo: JU+PE+95+0756
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el nombre del empleado: ");
        String nombre = consola.nextLine();
        System.out.print("Ingresa el apellido del empleado: ");
        String apellido = consola.nextLine();
        System.out.print("Ingresa el año de nacimiento del empleado: ");
        String fecha = consola.nextLine();

        // Generar numero aleatorio de 4 digitos
        Random random = new Random();
        int numero = random.nextInt(10000);
        String codigo = String.format("%04d", numero);
        System.out.println("Codigo: " + codigo);

        System.out.println("\n---------------------------");
        System.out.print("CÓDIGO GENERADO: " );
        System.out.println(
                nombre.substring(0,2).toUpperCase()
                + apellido.substring(0,2).toUpperCase()
                + fecha.substring(fecha.length()-2)
                + codigo
        );
        System.out.println("---------------------------");

    }
}
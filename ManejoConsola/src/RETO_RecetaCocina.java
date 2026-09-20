import java.util.Scanner;

public class RETO_RecetaCocina {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("*** RECETAS DE COCINA ***");
        System.out.print("Ingresa el nombre: ");
        var nombreReceta = consola.nextLine();
        System.out.print("Ingresa los ingredientes: ");
        var ingredientes = consola.nextLine();
        System.out.print("Ingresa el tiempo de preparacion (min): ");
        var tiempo = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa la dificultad: ");
        var dificultad = consola.nextLine();

        System.out.println("\n--- Receta de cocina ---");
        System.out.println("Nombre receta: " + nombreReceta);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tiempo de preparación (min): " + tiempo);
        System.out.println("Dificultad: " + dificultad);
    }
}

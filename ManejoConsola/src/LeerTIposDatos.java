import java.util.Scanner;

public class LeerTIposDatos {
    static void main(String[] args) {
        // Leer distintos tipos de datos
        // Leer un tipo Int
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("Edad = " + edad);
        // Leer un tipo Double
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("Altura: " + altura);
        // Consumimos el caracter de salto de linea
        consola.nextLine();
        // Leer un tipo String
        System.out.print("Ingreas tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Nombre: " + nombre);

        // Conversión de datos
        System.out.print("Proporciona un valor entero: ");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero: " + entero);

        // Tipo florante
        System.out.print("Proporciona un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante: " + flotante);
        // Double.parseDouble()
        // Boolean.parseBoolean()
    }
}

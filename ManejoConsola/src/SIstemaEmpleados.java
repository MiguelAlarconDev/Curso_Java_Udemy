import java.util.Scanner;

public class SIstemaEmpleados {
    static void main(String[] args) {
        System.out.println("*** SISTEMA DE EMPLEADOS ***");
        var consola = new Scanner(System.in);

        // Nombre del empleado
        System.out.print("Nombre del empleado: ");
        var nombre = consola.nextLine();

        // Edad del empleado
        System.out.print("Edad del empleado: ");
        var edad = Integer.parseInt(consola.nextLine());

        // Salario del empleado
        System.out.print("Salario del empleado: ");
        var salario = Float.parseFloat(consola.nextLine());

        // Es jefe de departamento
        System.out.print("Es jefe de departamento (true/false): ");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        // Imprimir los valores del Empleado
        System.out.println("\n*** DATOS DEL EMPLEADO ***");
        System.out.println("\tNombre del empleado: " + nombre);
        System.out.println("\tEdad del empleado: " + edad);
        System.out.printf("\tSalario del empleado: $%.2f%n", salario);
        System.out.println("\tEs jefe de departamento: " + esJefeDepartamento);
    }
}

public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** FORMATEO DE CADENAS ***");
        var nombre = "Matias";
        var edad = 18;
        var salario = 21000.50;

        // String format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f"
                ,nombre, edad, salario);
        System.out.println(mensaje);

        // Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f"
            ,nombre, edad, salario);
        
        // Formateo con text block
        var numeroEmpleado = 12;
        mensaje = """
                %nDetalle persona:\s
                ------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d
                \tSalario: $%.2f
                """.formatted(nombre, numeroEmpleado, edad, salario);
        System.out.println(mensaje);

        // Formateo con text block y printf directamente
        System.out.printf("""
                %nDetalle persona:\s
                ------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d
                \tSalario: $%.2f
                """, nombre, numeroEmpleado, edad, salario);
    }
}
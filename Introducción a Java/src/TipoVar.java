public class TipoVar {
    static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***");
        // Sin el uso del var
        String nombre1 = "Juan";
        System.out.println("Nombre1: " + nombre1);
        // Con el uso de var
        var nombre2 = "Carlos";
        System.out.println("Nombre2: " + nombre2);
        // Definir otras variables usando var
        var edad = 30;
        System.out.println("Edad: " + edad);
        var sueldo = 5000.5F; // se infiere tipo float
        System.out.println("Sueldo: " + sueldo);
        var esCasado = false; // se infiere tipo boolean
        esCasado = true;
        // esCasado = "No"; no podemos asignar un tipo distinto al boolean

        // Se debe definir su valor
        // Se deb poder inferir el tipo de dato
    }
}

public class ArgumentosVariables {
    public static void main(String[] args) {
        //imprimirNumeros(1, 2, 3, 4, 5, 6, 7, 8); //varargs
        variosParametros("Karla", 10, 20, 30);
    }

    private static void variosParametros(String nombre, int... numeros) {
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }

    static void imprimirNumeros(int... numeros) {
        for (var i = 0; i < numeros.length; i++)
            System.out.print(numeros[i] + " ");
    }
}

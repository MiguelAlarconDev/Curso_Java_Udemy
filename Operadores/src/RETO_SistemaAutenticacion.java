import java.util.Scanner;

public class RETO_SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** SISTEMA DE AUTENTICACION ***");
        var sc = new Scanner(System.in);
        final String USUARIO = "miguel";
        final String CONTRASENIA = "123";

        System.out.print("Ingrese su usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contrasenia = sc.nextLine();

        boolean esValido = (USUARIO.equals(usuario)) && (CONTRASENIA.equals(contrasenia));
        System.out.println("Es valido: " + esValido);
    }
}

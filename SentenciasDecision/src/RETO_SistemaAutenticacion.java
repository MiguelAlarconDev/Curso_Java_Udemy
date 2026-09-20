import java.util.Scanner;

public class RETO_SistemaAutenticacion {
    static void main() {
        System.out.println("*** SISTEMA DE AUTENTICACION ***");
        var sc = new Scanner(System.in);
        final String usuario = "admin";
        final String clave = "123";

        System.out.println(" ");
        System.out.print("Ingresa tu usuario: ");
        String usuario1 = sc.nextLine();
        System.out.print("Ingresa tu clave: ");
        String clave1 = sc.nextLine();

        if (!usuario1.equals(usuario) && !clave1.equals(clave)) {
            System.out.println("Usuario y clave incorrectos");
        } else if  (usuario1.equals(usuario) && !clave1.equals(clave)) {
            System.out.println("Clave incorrecta");
        } else if (!usuario1.equals(usuario)) {
            System.out.println("Usuario incorrecto");
        } else {
            System.out.println("Usuario y clave correctos");
        }
    }
}
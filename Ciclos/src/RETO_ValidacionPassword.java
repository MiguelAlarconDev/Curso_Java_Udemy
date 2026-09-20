import java.util.Scanner;

public class RETO_ValidacionPassword {
    static void main(String[] args) {
        System.out.println("*** VALIDACION DE PASSWORD ***");
        var sc = new Scanner(System.in);
        int lenthPassword;
        boolean passwordCheck = false;
        do {
            System.out.println("""
                Cree su contraseña:
                Debe tener al menos 6 caracteres
                """);
            String password =  sc.nextLine();
            lenthPassword = password.length();
            if (lenthPassword < 6) {
                System.out.println("La contraseña debe tener al menos 6 caracteres");
            } else {
                System.out.println("¡Contraseña creada con éxito!");
                passwordCheck = true;
            }
        } while (!passwordCheck);
    }
}
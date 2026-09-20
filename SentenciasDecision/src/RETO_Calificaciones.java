import java.util.Scanner;

public class RETO_Calificaciones {
    public static void main(String[] args) {
        System.out.println("*** SISTEMA DE CALIFICACIONES ****");
        var sc = new Scanner(System.in);
        System.out.print("Ingresa tu calificación: ");
        double calificacion = Double.parseDouble(sc.nextLine());

        String calificacionLetra = "";
        if (calificacion >= 9 && calificacion <= 10) {
            calificacionLetra = "A";
        } else if (calificacion < 9 && calificacion >= 8) {
            calificacionLetra = "B";
        } else if (calificacion < 8 && calificacion >= 7) {
            calificacionLetra = "C";
        } else if (calificacion < 7 && calificacion >= 6) {
            calificacionLetra = "D";
        } else if  (calificacion < 6 && calificacion >= 0) {
            calificacionLetra = "F";
        } else {
            calificacionLetra = "Valor desconocido";
        }

        System.out.printf("""
                ----------------------
                Calificacion en numeros: %.2f
                Calificacion en letras : %s
                """, calificacion, calificacionLetra);
    }
}
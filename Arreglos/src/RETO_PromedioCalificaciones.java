import java.util.Scanner;

public class RETO_PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** PROMEDIO DE CALIFICACIONES ***");
        var sc = new Scanner(System.in);
        double sumaAcumulada = 0;
        double promedio;
        int cantidadNotas;
        System.out.print("Ingrese la cantidad de calificaciones a promediar: ");
        cantidadNotas = Integer.parseInt(sc.nextLine());
        var notas = new double[cantidadNotas];
        // System.out.println("La cantidad de notas a evaluar es: " + cantidadNotas);
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese la calificación en la posición " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
            sumaAcumulada += notas[i];
            }
        promedio = (sumaAcumulada/cantidadNotas);
        System.out.println("--------------------------");
        System.out.println("El promedio final es: " + promedio);
    }
}
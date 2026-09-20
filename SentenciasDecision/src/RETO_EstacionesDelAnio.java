import java.util.Scanner;

public class RETO_EstacionesDelAnio {
    public static void main(String[] args) {
        System.out.println("*** ESTACION DEL AÑO SEGUN EL MES ***");
        var sc = new Scanner(System.in);
        System.out.print("Introduce el número del mes del año: ");
        int mes = Integer.parseInt(sc.nextLine());
        String estacion;
        if (mes >= 9 && mes <= 11) {
            estacion = "Otoño";
        } else if (mes >= 6 && mes <= 8) {
            estacion =  "Invierno";
        } else if (mes >= 3 && mes <= 5) {
            estacion =  "Primavera";
        } else if (mes <= 2 && mes > 0 || mes == 12) {
            estacion = "Verano";
        } else {
            estacion = "Estación desconocida";
        }

        System.out.printf("""
                --------------------
                Numero del mes: %d
                Estacion: %s
                """, mes, estacion);
    }
}

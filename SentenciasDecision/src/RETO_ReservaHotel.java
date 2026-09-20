import java.util.Scanner;

public class RETO_ReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** SISTEMA DE RESERVA DE HOTEL ***");
        var sc = new Scanner(System.in);
        System.out.print("Ingrese nombre del cliente: ");
        var nombreCliente = sc.nextLine();
        System.out.print("Ingrese días de estadía: ");
        var diasEstadia = Integer.parseInt(sc.nextLine());
        System.out.print("Indique si es cuarto con vista al mar (true/false): ");
        var tieneVistaAlMar =  Boolean.parseBoolean(sc.nextLine());
        final double COSTO_SIN_VISTA_MAR = 150.50;
        final double COSTO_CON_VISTA_MAR = 140.50;
        String mensaje;
        double montoTotal;
        if  (tieneVistaAlMar) {
            montoTotal = COSTO_CON_VISTA_MAR * diasEstadia;
            mensaje = "Sí :)";
        } else {
            montoTotal = COSTO_SIN_VISTA_MAR * diasEstadia;
            mensaje = "No :(";
        }

        System.out.println("\n*** INFORMACIÓN DE LA RESERVA ***");
        System.out.println("\tNombre del cliente: " + nombreCliente);
        System.out.println("\tDías de estadía: " +  diasEstadia);
        System.out.println("\tTiene vista al mar: " +  mensaje);
        System.out.println("\tMonto total: " + montoTotal);
    }
}

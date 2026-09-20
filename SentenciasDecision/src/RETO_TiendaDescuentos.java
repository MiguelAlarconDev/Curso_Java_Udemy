import java.util.Scanner;

public class RETO_TiendaDescuentos {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("*** DESCUENTO SEGUN CONDICIONES ***");
        System.out.print("Ingrese el monto a comprar: ");
        var montoCompra = sc.nextDouble();
        sc.nextLine();
        System.out.print("Indique si es miembro de la tienda (si/no): ");
        String esMiembro = sc.nextLine();
        System.out.println("-----------------------");

        double descuento = 0;
        if (esMiembro.equalsIgnoreCase("si")) {
            if (montoCompra > 1000) {
                descuento = 10;
            } else {
                descuento = 5;
            }
        } else {
            descuento = 0;
        }
        System.out.printf("Tu descuento es de: %.0f%%\n", descuento);
        System.out.println("-----------------------");
    }
}
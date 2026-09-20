import java.util.Scanner;

public class EJERCICIO_DescuentoVIP {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("*** DESCUENTO VIP ***");
        System.out.print("Ingrese cantidad de artículos a comprar: ");
        int cantidad = sc.nextInt();
        System.out.print("¿Es miembro de la tienda? (true, false): ");
        boolean miembro = sc.nextBoolean();
        var tieneDescuento = (10 <= cantidad) && (miembro == true);
        System.out.println("-----------------------------");
        System.out.println("Tiene descuento: " + tieneDescuento);
    }
}

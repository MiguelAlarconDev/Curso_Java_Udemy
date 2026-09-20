import java.util.Scanner;

public class RETO_AreaPerimetroRectangulo {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("*** AREA Y PERIMETRO DE UN RECTANGULO ***");
        System.out.print("Ingrese la medida de la base del rectangulo (en cm): ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la medida de la altura del rectangulo (en cm): ");
        double altura = sc.nextDouble();
        var area = base * altura;
        var perimetro = (2*base) + (2*altura);
        System.out.println(" ");
        System.out.printf("""
                Area del rectangulo: %.2f cm.
                Perimetro: %.2f cm.
                """, area, perimetro);
    }
}
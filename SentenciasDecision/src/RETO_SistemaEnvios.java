import java.util.Scanner;

public class RETO_SistemaEnvios {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        final int COSTO_NACIONAL = 10;
        final int COSTO_INTERNACIONAL = 20;
        System.out.println("*** SISTEMA DE ENVIOS ***");
        System.out.print("¿Es un envío nacional o inernacional?: ");
        String destino = sc.nextLine();
        System.out.print("¿Cuál es el peso (en kg) del paquete?: ");
        double  peso = Double.parseDouble(sc.nextLine());
        String destinoNormalizado = destino.toLowerCase();

        int tarifaxkg =0;
        double tarifa = 0;
        switch (destinoNormalizado) {
            case "nacional":
                tarifaxkg = COSTO_NACIONAL;
                tarifa =  tarifaxkg * peso;
                break;
            case "internacional":
                tarifaxkg = COSTO_INTERNACIONAL;
                tarifa = tarifaxkg * peso;
                break;
            default:
                System.out.println("Solo envíos nacionales o internacionales");
        }

        System.out.printf("""
                -----------------------
                 INFORMACION DEL ENVIO
                -----------------------
                Destino: %s
                Peso: %.2f kg
                Tarifa x kilo: $%d
                Tarifa: $%.2f 
                """, destino, peso, tarifaxkg, tarifa);
    }
}
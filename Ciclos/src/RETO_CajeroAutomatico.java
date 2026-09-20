import java.util.Scanner;

public class RETO_CajeroAutomatico {
    static void main(String[] args) {
        var sc = new Scanner(System.in);
        double saldoActual = 1000.00;
        boolean salida = false;
        while (!salida) {
            System.out.println("""
                CAJERO AUTOMATICO
                1. Depositar
                2. Retirar
                3. Consultar saldo
                4. Salir
                """);
        System.out.print("Ingrese el número de la operación que va a realizar: ");
        int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDepositar = sc.nextDouble();
                    saldoActual += montoDepositar;
                    System.out.println("Monto depositado: " +  montoDepositar);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetirar = sc.nextDouble();
                    if (montoRetirar > saldoActual) {
                        System.out.println("El monto a retirar es mayor al saldo actual");
                        System.out.println(" ");
                        break;
                    } else {
                        saldoActual -= montoRetirar;
                        System.out.println("Monto retirado: " +  montoRetirar);
                        System.out.println(" ");
                        break;
                    }
                case 3:
                    System.out.println("Saldo actual: " + saldoActual);
                    System.out.println(" ");
                    break;
                case 4:
                    salida = true;
            }
        }
    }
}
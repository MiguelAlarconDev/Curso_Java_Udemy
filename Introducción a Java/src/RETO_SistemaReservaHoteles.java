public class RETO_SistemaReservaHoteles {
    public static void main(String[] args) {
        System.out.println("*** Sistema de reserva de hoteles ***");
        String nombre = "Miguel";
        int diasEstancia = 4;
        final float TARIFA_DIARIA = 60.55f;
        final boolean VISTA_AL_MAR = false;

        System.out.println("NOMBRE: " + nombre);
        System.out.println("DIAS DE ESTANCIA: " + diasEstancia);
        System.out.println("TARIFA DIARIA: " + TARIFA_DIARIA);
        System.out.println("VISTA AL MAR: " + VISTA_AL_MAR);

        // Modificar valores
        System.out.println("------------------------------------");

        nombre = "Javier";
        diasEstancia = 5;
        System.out.println("NOMBRE: " + nombre);
        System.out.println("DIAS DE ESTANCIA: " + diasEstancia);
        System.out.println("TARIFA DIARIA: " + TARIFA_DIARIA);
        System.out.println("VISTA AL MAR: " + VISTA_AL_MAR);
    }
}

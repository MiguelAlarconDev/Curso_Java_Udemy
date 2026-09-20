public class DiaSemanaExpresiones {
    public static void main(String[] args) {
        System.out.println("*** DIA DE LA SEMANA CON SENTENCIA SWITCH MEJORADA***");
        var dia = 5; // Suponiendo que 1 es lunes, 2 es martes, etc.

        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Dia inválido: " + dia);
        }
    }
}

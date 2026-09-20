package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("-- PRUEBA DE LA CLASE PERSONA --");
//        var persona1 = new Persona();
//        persona1.setNombre("Sergio");
//        persona1.setApellido("Almanares");
//        System.out.println("Ingrese nombre: " + persona1.getNombre());
//        System.out.println("Ingrese apellido: " + persona1.getApellido());
//        System.out.println();
        System.out.println("Variable estatica: " + Persona.contadorPersonas);
        var objeto1 = new Persona("Layla", "Acosta");
        System.out.println(objeto1);
        System.out.println("Variable estatica: " + Persona.contadorPersonas);
        var objeto2 = new Persona("Ian", "Gomez");
        System.out.println(objeto2);
        System.out.println("Variable estatica: " + Persona.contadorPersonas);
    }
}
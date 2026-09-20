public class PersonaP {
    String nombre;
    String apellido;

    void mostrarPersona() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
    }

    static void main(String[] args) {
        System.out.println("*** CREACION DE CLASE Y DE OBJETO PERSONA ***");
        var objeto1 = new PersonaP();
        objeto1.nombre = "Layla";
        objeto1.apellido = "Acosta";
        objeto1.mostrarPersona();

        // Segundo objeto
        System.out.println();
        var objeto2 = new PersonaP();
        objeto2.nombre = "Ian";
        objeto2.apellido = "Gómez";
        objeto2.mostrarPersona();
    }
}
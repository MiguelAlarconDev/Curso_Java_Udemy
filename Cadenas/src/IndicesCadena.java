public class IndicesCadena {
    public static void main(String[] args) {
        // MAnejo de indices en una cadena
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);
        // Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0); // Recuperar el caracter "H"
        System.out.println("primerCaracter = " + primerCaracter);
        // Recuperar el último caracter
        var ultimoCaracter = cadena1.charAt(9); // Recuperar el caracter "o"
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        // Recuperar la letra "M"
        var caracterM = cadena1.charAt(5);
        System.out.println("caracterM = " + caracterM);
    }
}

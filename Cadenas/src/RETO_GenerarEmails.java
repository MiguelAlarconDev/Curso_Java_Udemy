public class RETO_GenerarEmails {
    public static void main(String[] args) {
        System.out.println("*** GENERADOR DE EMAILS ***");
        // Nombre de usuario
        var nombreUsuario = "Ubaldo Acosta Soto";
        var nombreUsuarioNormalizado = nombreUsuario.toLowerCase().replace(" ",".");
        //System.out.println(nombreUsuarioNormalizado);
        System.out.println("Nombre usuario = " + nombreUsuario);
        System.out.println("Nombre usuario normalizado  = " + nombreUsuarioNormalizado);

        // Dominio email
        var nombreEmpresa = "Global Mentoring";
        var extensionDominio = ".com.mx";
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append("@");
        constructorCadenas.append(nombreEmpresa.toLowerCase().replace(" ",""));
        constructorCadenas.append(extensionDominio);
        var dominioEmail = constructorCadenas.toString();
        //System.out.println(dominioEmail);
        System.out.println("\nNombre empresa = " + nombreEmpresa);
        System.out.println("Extensión de dominio = " + extensionDominio);
        System.out.println("Dominio de email normalizado = " + dominioEmail);

        var email = nombreUsuarioNormalizado.concat(dominioEmail);
        System.out.println("Email generado = " + email);
    }
}

public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** OPERADORES UNARIOS ***");
        int a = 3, b = 2, resultado;
        var c = true;
        // Operador unario +
        resultado = +a;
        System.out.println("Resultado +a: " + resultado);
        // Operador unario -
        resultado = -a;
        System.out.println("Resultado -a: " + resultado);

        // Operadores unarios incremento/decremento
        // Pre incremento
        a = 3;
        resultado = ++a; // primero se incrementa el valor
        System.out.println("Resultado ++a: " + resultado);
        System.out.println("a pre incremento: " + a);
        // Post incremento
        a = 3;
        resultado = a++; // primero se usa el valor de la varieble luego se incrementa
        System.out.println("Resultado a++: " + resultado);
        System.out.println("a post incremento: " + a);


        // Pre decremento
        b = -2;
        resultado = --b;
        System.out.println("Resultado --b: " + resultado);
        System.out.println("b pre decremento: " + b);

        // Post decremento
        b = -2;
        resultado = b--;
        System.out.println("Resultado b--: " + resultado);
        System.out.println("b post decremento: " + b);
    }
}

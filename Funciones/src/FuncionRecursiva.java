public class FuncionRecursiva {
    static void funcionRecursiva(int numero) {
        if (numero == 1)
            System.out.print(numero + " ");
        else
            funcionRecursiva(numero - 1);
            System.out.print(numero + " ");

    }

    public static void main(String[] args) {
        System.out.println("*** IMRPIMIR LOS VALORES DEL 1 AL 5 ***");
        funcionRecursiva(5);
    }
}
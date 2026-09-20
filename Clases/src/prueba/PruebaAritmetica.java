package prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
    System.out.println("*** EJEMPLO ARITMETICA ***");
    var aritmetica1 =  new Aritmetica();
    System.out.println("Atributo operando1: " + aritmetica1.getOperando1());
    aritmetica1.setOperando1(5);
    aritmetica1.setOperando2(7);
    aritmetica1.sumar();
    aritmetica1.restar();
    System.out.println();
    var aritmetica2 = new Aritmetica();
    aritmetica2.operando1 = 12;
    aritmetica2.operando2 = 16;
    aritmetica2.sumar();
    aritmetica2.restar();
    var aritmetica3 = new Aritmetica(5, 7);
    aritmetica3.sumar();
    aritmetica3.restar();
    }
}
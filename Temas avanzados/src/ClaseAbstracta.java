public class ClaseAbstracta {
    public static void main(String[] args) {
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}

// Clase abstracta
abstract class FiguraGeometrica { // No se puede instanciar
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica {
    public void dibujar() {
        System.out.println("Se debe dibujar un rectángulo");
    }
}

class Circulo extends FiguraGeometrica {
    public void dibujar() {
        System.out.println("Se debe dibujar un círculo");
    }
}


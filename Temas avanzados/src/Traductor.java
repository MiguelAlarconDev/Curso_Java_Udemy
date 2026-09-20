public interface Traductor {
    // public y abstract
    void traducir();

    // métodos con implementación por default
    default void iniciarTraductor() {
        System.out.println("Iniciando traductor ...");
    }
}

class Ingles implements Traductor {
    public void traducir() {
        System.out.println("Traduzco a inglés");
    }
}

class Frances implements Traductor {
    @Override
    public void iniciarTraductor() {
        System.out.println("Iniciando traductor en francés ...");
    }
    public void traducir() {
        System.out.println("Traduzco a francés");
    }
}

class PruebaTraductor {
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}
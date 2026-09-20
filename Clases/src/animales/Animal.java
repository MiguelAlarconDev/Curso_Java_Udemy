package animales;

public class Animal {
    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido(){
        System.out.println("El perro hace wauf");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido(){
        System.out.println("El gato hace miau");
    }
}

class PruebaAnimal {

    // Metodo polimorfico
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        // Objeto de la clase padre Animal
        var animal1 =  new Gato();
        imprimirSonido(animal1);
    }
}
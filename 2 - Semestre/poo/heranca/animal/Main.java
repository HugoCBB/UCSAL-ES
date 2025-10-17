package poo.heranca.animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.latir();

        Cachorro cachorro = new Cachorro("Bob", 10);
        cachorro.latir();
    }
}

package poo.heranca.animal;

public class Cachorro extends Animal {
    Cachorro(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void latir() {
        System.out.println("Au au au au ");
    }
}

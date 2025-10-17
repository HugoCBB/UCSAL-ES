package poo.heranca.pessoa;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        if (this.nome.equals(null)) {
            System.out.println("Nome nao definido");
            return null;
        }
        return this.nome;
    }

    public int getIdade(){
        if (this.idade <= 0) {
            System.out.println("Idade invalida");
            return 1;
        }
        return this.idade;
    }
}

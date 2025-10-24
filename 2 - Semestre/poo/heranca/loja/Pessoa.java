package poo.heranca.loja;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected Conta conta;

    protected String setNome(String nome) { 
        if (nome.equals(null) || nome.length() < 4) {
            System.out.println("Digite um nome valido");
            return null;
        }
        this.nome = nome;
        return this.nome;
    }

    protected int setIdade(int idade) {
        this.idade = idade;
        return this.idade;
    }
    
    protected String getNome() { return this.nome; }
    protected int getIdade() { return this.idade; }

}



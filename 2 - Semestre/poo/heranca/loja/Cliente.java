package poo.heranca.loja;

public class Cliente extends Pessoa{

    public Cliente(String nome, int idade, String senha ) {
        this.nome = setNome(nome);
        this.idade = setIdade(idade);
        this.conta = new Conta(senha);
    }


}

package poo.Pessoa;

public class Pessoa {
    private  String nome;
    private int idade;
    private String profissao;

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public String getProfissao(){
        return this.profissao;
    }
}

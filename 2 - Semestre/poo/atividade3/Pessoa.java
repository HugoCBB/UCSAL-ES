package poo.atividade3;

import java.util.Scanner;

public class Pessoa {
    String nome;
    private String profissao;
    private int idade;

    public Pessoa(String nome, int idade, String profissao){
        this.nome = nome;
        this.profissao = profissao;
        this.idade = idade;
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Profissao: " + this.profissao);
    }

}

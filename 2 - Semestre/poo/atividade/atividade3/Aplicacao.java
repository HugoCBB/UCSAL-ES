package poo.atividade.atividade3;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Pessoa pessoa1 = recebeDados();
        Pessoa pessoa2 = recebeDados();
        
        System.out.println("|----------PESSOAS---------|");
        System.out.println("Primeira pessoa");
        pessoa1.exibirDados();
        System.out.println();

        System.out.println("Segunda pessoa");
        pessoa2.exibirDados();
    }

    public static Pessoa recebeDados(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome pessoa: ");
        String nome = scan.next();

        System.out.print("Digite a idade pessoa: ");
        int idade = scan.nextInt();

        System.out.print("Digite a profissao pessoa: ");
        String profissao = scan.next();

        System.out.println("==============================");
        return new Pessoa(nome, idade, profissao);
    }
}

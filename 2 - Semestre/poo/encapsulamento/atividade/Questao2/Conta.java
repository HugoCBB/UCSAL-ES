
package atividade.Questao2;

import java.util.Random;
import java.util.Scanner;

public class Conta {
    private String nome;
    private int idade;
    private long numeroConta;
    private double saldo = 0.0;
    private boolean status;

    private Conta abrirConta(String nome, int idade){
        if (!setNome(nome)) {
            this.status = false;
            return null;
        }

        if (!setIdade(idade)) {
            this.status = false;
            return null;
        }

        setNumeroConta();
        this.status = true;
        System.out.println("Conta aberta com sucesso");
        return this;
    }

    public Conta Hub(){
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println(" BANCO UCSAL");
        System.out.println("--------------");
        
        System.out.println("Defina um nome");
        String nome = scan.next();

        System.out.println("Defina uma idade");
        int idade = scan.nextInt();
        return abrirConta(nome, idade);
    }

    public void exibirDados(){
        System.out.println("Numero da conta: " + this.getNumeroConta());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.idade);
        System.out.println("Saldo: " + this.saldo);
    }

    public void escolhas(){
        if (!this.status) {
            System.out.println("Crie uma conta antes de entrar na pagina de usuario");
            return;
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("PAGINA DE USUARIO");
        System.out.println("-----------------");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("0 - Sair");
        int esc = scan.nextInt();

        switch (esc) {
            case 1:
                System.out.println("Defina um valor de deposito valido");
                double valorDeposito = scan.nextDouble();
                depositar(valorDeposito);
                break;
                
            case 2:
                System.out.println("Defina um valor de saque");
                double valorSaque = scan.nextDouble();
                sacar(valorSaque);
                break;
            case 0:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Valor de escolha invalida");
                break;
        }

    }
    
    private void depositar(double valor) {
        if (!this.status) {
            System.out.println("Crie uma conta antes de depositar");
            return;
        }
        
        if (valor <= 0) {
            System.out.println("Valor de deposito invalido");
            return;
        }
        
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso");
    }
    
    private void sacar(double valor){
        if (!this.status) {
            System.out.println("Crie uma conta antes de depositar");
            return;
        }
        
        if (valor > this.saldo || valor <= 0) {
            System.out.println("Valor de saque invalido");
            return;
        }
        
        this.saldo -= valor;
        System.out.println("Saque realizado com sucesso");
    }

    

    private boolean setIdade(int idade) {
        if (idade < 18) {
            System.out.println("Idade menor de 18 anos");
            return false;
        }
        this.idade = idade;
        return true;
    }

    private void setNumeroConta() { 
        Random rand = new Random();
        this.numeroConta = rand.nextLong(100);
    }
    
    private boolean setNome(String nome) { 
        if (nome.length() <= 0) {
            System.out.println("Nome invalido, defina um nome valido");
            return false;
        }
        this.nome = nome;
        return true;
    
    }

    private String getNome() {
        if (!this.status) {
            System.out.println("Crie uma conta antes de requisitar o nome");
            return null;
        }
        return this.nome;
    }
    
    private long getNumeroConta() {
        if (!this.status) {
            System.out.println("Crie uma conta antes de requisitar o numero da conta");
            return 0;
        }
        return this.numeroConta;
    }
}

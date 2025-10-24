package poo.heranca.loja;

import java.util.Random;
import java.util.Scanner;

public class Conta {
    private long agencia;
    private String senha;
    private double saldo = 0;
    private double limiteSaquePorDia = 1000;
    private int tentativaSaque = 0;

    private boolean status = true;

    private Random rand = new Random();
    private Scanner scan = new Scanner(System.in);

    public Conta(String senha) {
        this.senha = setSenha(senha);
        this.agencia = setAgencia();
    }

    public boolean sacar(double valor) {
        if (!this.status) {
            System.out.println("Usuario nao permitido realizar saques");
            return false;
        }

        if (valor > this.saldo) {
            System.out.println("saque maior que o saldo");
            return false;
        }

        if (valor > this.limiteSaquePorDia) {
            System.out.println("Limite de saque por dia excedido. Limite restante: " + this.limiteSaquePorDia);
            return false;
            
        }

        if (this.limiteSaquePorDia == 0) {
            System.out.println("Limite de saques por dia ja estabelecido");
            return false;
        }

        boolean analiseSaque = this.analisarSaque();
        if (analiseSaque) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
            this.tentativaSaque = 0;
            
            return true;
        }
        
        this.saldo -= valor;
        this.limiteSaquePorDia -= valor;
        this.tentativaSaque = 0;
        System.out.println("Saque realizado com sucesso");
        return true;
    }

    private boolean analisarSaque() {
        System.out.println("Digite a sua senha: ");
        String senha = scan.next();
        if (!senha.equals(this.senha)) {
            System.out.println("Senha invalida, saque nao permitido");
            this.tentativaSaque++;
    
            if (this.tentativaSaque >= 3) {
                System.out.println("Usuario nao permitido realizar saque");
                return false;
            }

            return false;           
        }
        return true;

    }

    public boolean depositar(double valor) {
        if (!this.status) {
            System.out.println("Usuario nao permitido realizar depositos");
            return false;
        }

        if (valor <= 0) {
            System.out.println("Valor de deposito invalido");
            return false;
        }
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso");
        return true;
    }

    public void exibirDadosConta() {
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Saldo: "+ this.saldo);
        System.out.println("Limite de saque por dia: " + this.limiteSaquePorDia);

    }

    private long setAgencia() {
        return this.rand.nextLong(100, 200);
    }

    private String setSenha(String senha) {
        if (senha.length() < 6) {
            return "Digite uma senha com mais de 6 digitos";
        }
        this.senha = senha;
        return this.senha;
    }

    
    
}

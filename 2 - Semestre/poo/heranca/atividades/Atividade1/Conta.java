package poo.heranca.atividades.Atividade1;

public class Conta {
    protected String nome;
    protected long numeroDaConta;
    private double saldo = 1000;

    public void setNumeroDaConta(long numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getNumeroDaConta() {
        return this.numeroDaConta;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSaldo() { 
        return this.saldo;
    }

    public void deposito(double valor){
        if (valor <= 0) {
            System.out.println("Valor de deposito invalido, digite um valor valido");
            return;
        }
        this.saldo += valor;
    }

    public void saque(double valor){
        if (valor <= 0 || this.saldo < valor) {
            System.out.println("Valor de saque invalido, digite um valor valido");
            return;
        }
        this.saldo -= valor;

    }

}
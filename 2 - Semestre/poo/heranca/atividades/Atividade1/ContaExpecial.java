package poo.heranca.atividades.Atividade1;

public class ContaExpecial extends Conta {
    private double limite = 2000;

    public double getLimite() { return this.limite;}

    @Override
    public void saque(double valor) {
        if (this.limite < valor || this.limite <= 0){
            System.out.println("Limite indisponivel");
            return;
        }
        
        if (getSaldo() <= 0) {
            System.out.println("Saldo insuficiente");
            return;
        }
        this.limite -= valor;
        super.saque(valor);

    }
    
}

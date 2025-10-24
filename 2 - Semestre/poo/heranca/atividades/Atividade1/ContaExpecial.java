package poo.heranca.atividades.Atividade1;

public class ContaExpecial extends Conta {
    private double limite = 2000;

    public double getLimite() { return this.limite;}

    public void saque(double valor) {
        
        if (this.saldo <= 0) {
            if (this.limite < valor || this.limite <= 0) {
                System.out.println("Limite indisponivel");
                return;
            }
            
            if (valor <= 0) {
                System.out.println("Valor de saque invalido");
                return;
            }

            this.limite -= valor;
        } else {
            if (this.saldo < valor ) {
                System.out.println("Saldo indisponivel");
                return;
            }

            if (valor <= 0) {
                System.out.println("Valor de saque invalido");
                return;
            }
            
            this.saldo -= valor;
        }

    
    }
    
}

package poo.heranca.atividades.Atividade1;

public class AppConta {
    public static void main(String[] args) {
        ContaExpecial conta = new ContaExpecial();
        System.out.println(conta.getSaldo());
        System.out.println(conta.getLimite());
        conta.saque(1000);

        System.out.println(conta.getLimite());
        System.out.println(conta.getSaldo());
        conta.saque(500);

        System.out.println(conta.getLimite());
        System.out.println(conta.getSaldo());
        conta.saque(1501);
    
    }
    
}

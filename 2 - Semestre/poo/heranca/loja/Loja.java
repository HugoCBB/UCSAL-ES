package poo.heranca.loja;

public class Loja {
    public static void main(String[] args) {
        Cliente cli = new Cliente("Hugo", 20, "202002020");
        cli.conta.exibirDadosConta();
        System.out.println("=====================");
        System.out.println();
        cli.conta.depositar(2000);
        cli.conta.exibirDadosConta();
        System.out.println("=====================");
        cli.conta.sacar(999);
        cli.conta.exibirDadosConta();
        System.out.println();
        
        System.out.println("=====================");
        System.out.println();
        
        cli.conta.sacar(1000);
        cli.conta.exibirDadosConta();

        
    }
    
}

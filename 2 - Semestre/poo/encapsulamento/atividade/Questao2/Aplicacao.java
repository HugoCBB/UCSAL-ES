package poo.encapsulamento.atividade.Questao2;

public class Aplicacao {
    public static void main(String[] args) {
        Conta pessoa = new Conta();
        pessoa.Hub();
        System.out.println("==============================");
        pessoa.exibirDados();
        System.out.println("==============================");
        
        while (true) {
            pessoa.escolhas();
            pessoa.exibirDados();
        }
    }
    
}

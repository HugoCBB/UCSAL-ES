package atividade.Questao4;

public class Aplicacao {
    public static void main(String[] args) {

        Produto p1 = new Produto("Cafeteira Elétrica", "CF-2023", 150.00);

        System.out.println("--- Dados Iniciais ---");
        System.out.println("Nome: " + p1.getProdNome());
        System.out.println("Preço: " + String.format("R$%.2f", p1.getPreco()));

  
        System.out.println("\n--- Aplicando Desconto (15%) ---");
        p1.aplicarDesconto(15.0);


        System.out.println("\n--- Modificando Nome e Checando Preço ---");
        p1.setProdNome("Cafeteira Expressa Pro");
        System.out.println("Novo Nome: " + p1.getProdNome());
        System.out.println("Preço Atual: " + String.format("R$%.2f", p1.getPreco()));
        
        System.out.println("\n--- Aplicando Segundo Desconto (5%) ---");
        p1.aplicarDesconto(5.0);
    }
}
package poo.escolhas;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i=0, esc = 1;
        
        while (esc != 0) {
            i++;

            System.out.println("Cliente " + i);
            System.out.println("Digite um nome");
            String nome = scan.next();

            System.out.println("Digite um email");
            String email = scan.next();

            System.out.println("Digite um telefone");
            String telefone = scan.next();
            
            Cliente client = new Cliente(i,nome, email, telefone);
            System.out.println("Cliente cadastrado com sucesso!");
            System.out.println("Digite 0 para sair ou 1 para continuar");
            esc = scan.nextInt();
            
        }
        }
    
}

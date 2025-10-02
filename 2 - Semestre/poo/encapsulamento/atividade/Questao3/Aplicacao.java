package atividade.Questao3;

public class Aplicacao {
    public static void main(String[] args) {
        
        Funcionario func1 = new Funcionario(101, "Joana Silva", 4500.758);

        System.out.println("--- Dados Iniciais ---");
        System.out.println("ID: " + func1.getFuncionarioId());
        System.out.println("Nome: " + func1.getFuncionarioNome());
        
        System.out.println("Salário: " + func1.getFuncionarioSalarioFormatado()); 
        
        System.out.println("\n--- Modificando Dados ---");
        
       
        func1.setFuncionarioNome("Joana Silveira");
        
        
        func1.setFuncionarioId(102);

        System.out.println("Novo ID: " + func1.getFuncionarioId());
        System.out.println("Novo Nome: " + func1.getFuncionarioNome());
        System.out.println("Salário (Não modificado): " + func1.getFuncionarioSalarioFormatado());
    }
}
package poo.encapsulamento.atividade.Questao3;

public class Funcionario {

    private int funcionarioId;
    private String funcionarioNome;
    private double funcionarioSalario;

    public Funcionario(int id, String nome, double salario) {
        this.funcionarioId = id;
        this.funcionarioNome = nome;
        this.funcionarioSalario = salario;
    }

    public int getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public String getFuncionarioNome() {
        return funcionarioNome;
    }

    public void setFuncionarioNome(String funcionarioNome) {
        this.funcionarioNome = funcionarioNome;
    }

    
    public String getFuncionarioSalarioFormatado() {
        return String.format("$%.2f", this.funcionarioSalario);
    }
    

}
package poo.encapsulamento.atividade.Questao1;
public class Aplicacao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Hugo");
        pessoa.setIdade(18);
        pessoa.setPais("Brasil");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getPais());
    }
}

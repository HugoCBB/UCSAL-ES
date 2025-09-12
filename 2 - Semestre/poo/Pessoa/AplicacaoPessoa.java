package poo.Pessoa;

public class AplicacaoPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.setNome("Maicon");
        p1.setIdade(20);
        p1.setProfissao("Medico");
        
        p2.setNome("Oliveira");
        p2.setIdade(10);
        p2.setProfissao("Piloto de formula 1");
        

        System.out.println("|----------PESSOAS----------|");
        System.out.println("Primeira pessoa");
        System.out.println("Nome: "+p1.getNome());
        System.out.println("Idade: "+p1.getIdade());
        System.out.println("Profisão: "+p1.getProfissao());
        
        System.out.println();
        System.out.println("Segunda pessoa");
        System.out.println("Nome: "+p2.getNome());
        System.out.println("Idade: "+p2.getIdade());
        System.out.println("Profisão: "+p2.getProfissao());
    }    
}

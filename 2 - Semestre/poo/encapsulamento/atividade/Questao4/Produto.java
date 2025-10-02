package atividade.Questao4;

public class Produto {

    private String prodNome;
    private String prodCodigo;
    private double preco;

    public Produto(String nome, String codigo, double preco) {
        this.prodNome = nome;
        this.prodCodigo = codigo;
        this.preco = preco;
    }


    public String getProdNome() {
        return prodNome;
    }

    public void setProdNome(String prodNome) {
        this.prodNome = prodNome;
    }


    public String getProdCodigo() {
        return prodCodigo;
    }

    public void setProdCodigo(String prodCodigo) {
        this.prodCodigo = prodCodigo;
    }

    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
      
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: Preço não pode ser negativo.");
        }
    }


  
    public void aplicarDesconto(double porcentagem) {
        if (porcentagem > 0 && porcentagem <= 100) {

            double valorDesconto = this.preco * (porcentagem / 100.0);
            this.preco -= valorDesconto;
            System.out.println("Desconto de " + porcentagem + "% aplicado. Novo preço: " 
                               + String.format("R$%.2f", this.preco));
        } else {
            System.out.println("Erro: Porcentagem de desconto inválida.");
        }
    }
}
package poo.atividade.atividade4;

public class Cachorro {
	private String nome;
	private String cor;
	private boolean treinando;
	private double peso;
	
	public Cachorro(String nome, String cor, double peso , boolean treinando) {
		this.nome = nome;
		this.cor = cor;
		this.peso = peso;
		this.treinando = treinando;
	}
	
	public void exibirDados() {
		System.out.println("Nome do cahorro: " + this.nome);
		System.out.println("Cor do cachorro: " + this.cor);
		System.out.println("Peso do cachorro: "+ this.peso);
	}
	
	public boolean treinar(boolean treinando) {
		if ( treinando != true) {
			System.out.println("Cachorro não esta treinando");
			this.treinando = false;
			return false;
		}
		System.out.println("Cachorro esta treinando");
		this.treinando = true;
		return true;
	}
	
	public void comparaCor(String corCachorro2) {
		if (this.cor.equals(corCachorro2)) {
			System.out.println("Cachorro com cores iguais");
			return;
		}
		System.out.println("Cachorro com cores diferentes");
	}
	
	public void porte() {
		if ((this.peso >= 25) && (this.peso <= 45)) {
			System.out.println("Cachorro de porte grande");
			return;
		}
		System.out.println("Cachorro nao e de porte grande");
		return;
	}
	
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Maicon", "Marrom", 20, false);
		Cachorro dog2 = new Cachorro("Bob", "Marrom", 25, true);
		dog.comparaCor(dog2.cor);
		
		dog.exibirDados();
		dog.treinar(true);
		
		dog.porte();
	}
    
}

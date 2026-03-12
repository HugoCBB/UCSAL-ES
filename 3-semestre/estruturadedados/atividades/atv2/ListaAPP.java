
public class ListaAPP {

	public static void main(String[] args) {

			ListaEncadeada minhaLista = new ListaEncadeada();
			
			// adiciona objetos na lista
			minhaLista.add("José");
			minhaLista.add("Maria");
			minhaLista.add("Jesus");
			minhaLista.add("Tiago");
			minhaLista.add("Pedro");
			minhaLista.add("Judas");
			minhaLista.add("João");
			
			// imprime a lista
			minhaLista.print();

			// Adiciona na posicao 2 o objeto com o valor judas
			System.out.println(" Adiciona na posicao 2 o objeto com o valor judas");
			minhaLista.add(2,"Judas");
			minhaLista.print();
			
			// Remove o elemento na posicao especifica
			System.out.println("Removido elemento da posicao 2");
			minhaLista.remove(2);
			minhaLista.print();
			
			// Remove a primeira ocorrencia do elemento criado
			System.out.println("Removido a primeira ocorrencia do nome Tiago na Lista");
			minhaLista.remove("Tiago");
			minhaLista.print();

			// Ele modifica o elemento de acordo com a sua posicao
			System.out.println("Modifica o elemento Maria para Jorge Alberto");
			minhaLista.set(1, "Jorge Alberto");
			minhaLista.print();
			

	}

}

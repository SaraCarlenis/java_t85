package aula_06_collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionPilha {

	public static void main(String[] args) {
		
		Deque<String> pilha = new ArrayDeque<String>();
		
		//Pilha motra sempre começa a mostrar desde o último elemento
		
		pilha.push("Azul");
		pilha.push("Verde");
		pilha.push("Cinça");
		pilha.push("Vermelho");
		pilha.push("Preto");
		pilha.push("Amarelho");
		
		pilha.pop(); // deleta a última posição
		
		System.out.println("A cor azul ainda está na pilha? " + pilha.contains("Azul"));// verifica se o colocar azul está na lista ainda
		
		for(var cor : pilha) {
			System.out.println(cor);
		}
		
	}

}

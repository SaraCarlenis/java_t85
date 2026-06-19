package aula_06_collections;

import java.util.ArrayList;
import java.util.Comparator;

public class CollectionArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>(); // Integer armazena numeros inteiros
		
		numeros.add(1); //o add é que se disesse > adiciona 1 em numeros
		numeros.add(3); //add > adiciona 3 em numeros
		numeros.add(5); //add > adiciona 5 em numeros
		numeros.add(7); //add > adicionar 7 em numeros
		numeros.add(9);
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
		System.out.println("O objetos que está presente no índice 1: " + numeros.get(1)); //O get pega o valor da posição. o get devolve onde está o objeto 1
		System.out.println("O objetos que está presente no índice 1: " + numeros.indexOf(7)); // pega o índice dposição
		
		numeros.set(3, 25); //serve para substituir o valor que está em uma determinada posição por outro
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
		numeros.remove(0); //remove o primeiro valor
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
		//ordena em ordem crescente
		numeros.sort(null);
		
		//ordena em ordem decrecente
		numeros.sort(Comparator.reverseOrder());
		
	}
}

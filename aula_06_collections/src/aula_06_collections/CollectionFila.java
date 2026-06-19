package aula_06_collections;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionFila {

	public static void main(String[] args) {
		
		//Collection fila sempre remove o primeiro elemento
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Thiago");
		fila.add("Maria");
		fila.add("Sara");
		fila.add("Vinicius");
		fila.add("Michell");
		
		fila.remove(); // remove o primeiro elemento
		fila.remove(); // remove o primeiro elemento
		
		System.out.println("A Sara ainda na fila? " + fila.contains("Sara")); //Procura se Sara está na lista
		
        LinkedList<String> lista = (LinkedList<String>) fila; //Converte para LinkedList para acessar por índice
        
        int posicao = lista.indexOf("Michell");//Declaro int para posição que recebe a listaindeOf para acessar a lista. Procura a posição da Michael 
			if(posicao != -1) {
				System.out.println("Sara está na posição: " + posicao);
			}else {
				System.out.println("Sara não está na lista");
		}
		
		for(var cliente : fila){
			System.out.println(cliente);
		}
		
	}

}

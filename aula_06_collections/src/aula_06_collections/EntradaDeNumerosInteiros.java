package aula_06_collections;

import java.util.HashSet; //Importa a classe HashSet. Implementação de Set
import java.util.Scanner;
import java.util.Set; //Importa a interface Set (coleção que não permite repetidos)

public class EntradaDeNumerosInteiros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> listaNumeros = new HashSet<>(); //Cria um Set de inteiros, (HashSet) ela não aceita valores repetidos
		
		
		for(int i = 0; i < 10; i++) { //Roda 10 vezes para pedir números ao usuário
			System.out.println("Digite um numero: "); //Exibe mensagem pedindo um número
				listaNumeros.add(leia.nextInt()); //Lê o número digitado e adiciona ao Set
		}
		
		System.out.println("Números repedido não serão mostrados na tela.");
		System.out.println("Os números são: " + listaNumeros); //Mostra todos os números armazenados no Set
		
		leia.close();
	}

}

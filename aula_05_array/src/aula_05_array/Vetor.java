package aula_05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		//Criando vetores
		//Vetor inicializado com dados
		int vetorInteiros[] = {10, 20, 70, 45, 78, 100}; // dentro das chaves colocamos os valores predefinidos
		
		//Criando vetor vazio
		float vetorReais[] = new float[5];
		
		//Para visualizar o que tem dentro do vetor
		System.out.printf("\nvetorInteiros[2] = %d \n", vetorInteiros[2]);
		
		//Caso quiser listar todo os dados dentro do vetorInteiro
		for(int i = 0; i < 6; i++) {
			System.out.printf("\nPosição do vetorInteiros[%d] = %d\n", i, vetorInteiros[i]);
		}
		
		//Como inserir dados no vetorReais
				for(int i = 0; i < vetorReais.length; i++) {
					System.out.printf("\nDigite um valor Reals para a posição %d = \n", i);
					vetorReais[i] = leia.nextFloat();
				}
				
		//Como Organizar o Vetor em Ordem Crescente 		
		Arrays.sort(vetorReais);
		//Como listar todas as posições do meu array (length)
		for(int i = 0; i < vetorReais.length; i++) {
			System.out.printf("\nPosição vetorReais[%d] = %.2f\n", i, vetorReais[i]);
		}
		
		/*
	 	//Como Organizar o Vetor em Ordem Descrecente. 
	 	/// Quando você quer listar os elementos de um vetor em ordem decrescente, 
	 	/// precisa começar pelo último índice e ir diminuindo até chegar ao primeiro.	
		///Arrays.sort(vetorReais); // organiza as posições
		//Como listar todas as posições do meu array (length)
		for(int i = vetorReais.length - 1; i >= vetorReais.length; i--) {
			System.out.printf("\nPosição vetorReais[%d] = %.2f\n", i, vetorReais[i]);
		}
		 */
		
		System.out.println("Tamanho do vetorReais: " + vetorReais.length);
		leia.close();
	}

}

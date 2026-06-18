package aula_05_array;

import java.util.Scanner;

public class BuscaInteiros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Criando o array
		int numeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		System.out.println("****** Jogo de Números Inteiros ******"); 
		System.out.println("Digite o número que você deseja encontrar: "); //Entrada de dados
		int numDigitado = leia.nextInt(); // armazena o número inserido pelo usuário
		boolean numEncontrado = false; // declarando uma variavel tipo boolean para utilizar no laço for. Começa como false e só vira true se o número for achado.
		
		for(int i = 0; i < numeros.length; i++) { //iniciando o laço for para percorrer todas as posicoes do array
			if(numeros[i] == numDigitado) { // se o numero na posicao do ídice for == ao número digitado
				System.out.println("O número " + numDigitado + " está localizado na posição: " + i); // mostrara a mensagem no console
				numEncontrado = true; // verifica se o nro foi encontrado, se for true quebra o laco e finaliza a execução.
				break;
			}
		}
			if(!numEncontrado) { // se o numEncontrado for diferente do que existe na minha lista, mostra a mensagem Não foi encontrado!
				System.out.println("Não foi encontrado");
			}
		
		leia.close();
}
}

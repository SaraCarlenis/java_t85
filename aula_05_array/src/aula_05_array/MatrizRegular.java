package aula_05_array;

import java.util.Scanner;

public class MatrizRegular {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//Declarando um array com 3 posições e (3 linhas e 3 colunas)
		int matrizInteiros[][] = {
									{10, 15, 20}, //posição 0		
									{5, 55,60}, //posição 1
									{75, 80, 85} //posição 2
								};
		
		for(int linha = 0; linha < matrizInteiros.length; linha++) {
			for(int coluna = 0; coluna < matrizInteiros[linha].length; coluna++)
			System.out.printf("\nmatrizInteiros[%d][%d] = %d\n", linha, coluna, matrizInteiros[linha][coluna]);
		}
		
		double matrizDouble[][] = new double[2][2];  // Criando matrizDouble 2x3
		
		for(int linha = 0; linha < matrizInteiros.length; linha++) {
			for(int coluna = 0; coluna < matrizDouble[linha].length; coluna++) {
			System.out.printf("\nDigite um número para a posição [%d][%d] = ", linha, coluna);
			matrizDouble[linha][coluna] = leia.nextDouble();
			}
	}
		leia.close();
	}
}

package aula_04_repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade, esporte, totalRespostas = 0, somaIdade = 0, futebol = 0, maiorDeIdade = 0;
		double mediaIdades = 0;
		char continua = 'S';
		
		while(continua == 'S') {
			System.out.println("*******************************************");
			System.out.println("***  Pesquisa Sobre Esportes Favoritos  ***");
			System.out.println("*******************************************");
			System.out.print("Digite a sua idade:");
			idade = leia.nextInt();
			
			do {
				System.out.println("Escolha o seu esporte favito:");
				System.out.println("1 - Futebol");
				System.out.println("2 - Voleibol");
				System.out.println("3 - Basquete");
				System.out.println("4 - outros");
				esporte = leia.nextInt();
				
			}while(esporte < 1 || esporte >4);
			
			totalRespostas++;
			
			somaIdade += idade;
			
			if(esporte == 1) {
				futebol++;
			}
			
			if(idade >= 18 && esporte == 2) {
				maiorDeIdade ++;
			}
			do {
				System.out.println("Deseja continuar? (S/N)");
				continua = leia.next().toUpperCase().charAt(0);
			}while(!(continua == 'S') && !(continua == 'N'));
		}
		mediaIdades = somaIdade / totalRespostas;
		
		System.out.printf("Total de pessoas que gostam de Futebol: %d\n", futebol);
		System.out.printf("Total de pessoas maiores de 18 anos: %d\n", maiorDeIdade);
		System.out.printf("Média das idades: %.2f\n", mediaIdades);
		leia.close();
	}

}

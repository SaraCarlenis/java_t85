package aula_03_condicionais;

import java.util.Scanner;

public class Lista01LaçoCondicionalIf {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
//Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.
		
		System.out.println("*** Desafio da Soma ***");
		
		System.out.println("Digite um número: ");
		int num1 = leia.nextInt();
		
		System.out.println("Digite outro número: ");
		int num2 = leia.nextInt();
		
		System.out.println("Digite mais um número: ");
		int num3 = leia.nextInt();
		
		int soma = num1 + num2;
		
		if(soma > num3) {
			System.out.printf("\nResultado: %d + %d = %d. Comparando com %d, é maior.", num1, num2,soma, num3);
		}else if(soma == num3) {
				System.out.printf("\nResultado: %d + %d = %d. Comparando com %d, é igual.", num1, num2,soma, num3);	
		}else {
				System.out.printf("\nResultado: %d + %d = %d. Comparando com %d, é menor.", num1, num2,soma, num3);	
		}
		
		leia.close();
	}
}

package aula_03_condicionais;

import java.util.Scanner;

public class Lista2ParOuImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
//Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela
//uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo
		
		System.out.println("     *** Verificador de Números ***     ");
		
		System.out.println("Digite um número: ");
		int num1 = leia.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.printf("\nO número %d é par.", num1);
		}else {
			System.out.printf("\nO número %d é ímpar", num1);
		}
		
		if(num1 > 0) {
			System.out.printf("\nO número %d é positivo!", num1);
		}else {
			System.out.printf("\nO número %d é negativo!", num1);
		}
		
		leia.close();		
	}

}

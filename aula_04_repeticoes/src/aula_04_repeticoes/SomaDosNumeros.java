package aula_04_repeticoes;

import java.util.Scanner;

public class SomaDosNumeros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int somaNumerosPositivos = 0;
		
		do { // faça primeiro
		System.out.println("Digite um numero inteiro");
		numero = leia.nextInt();
			if(numero >= 1) {
				somaNumerosPositivos += numero; 
			}
		}while(numero != 0); //O número é diferente de zero. Se for, repete; se não for, para.
			System.out.printf("\nA soma dos números positivos é: %d ", somaNumerosPositivos);
			
			leia.close();
	}
}

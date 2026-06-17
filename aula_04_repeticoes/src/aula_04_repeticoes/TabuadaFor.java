package aula_04_repeticoes;

import java.util.Scanner;

public class TabuadaFor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digit um número: ");
		numero = leia.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", numero, i, numero * i);
		}
		
		leia.close();
	}

}

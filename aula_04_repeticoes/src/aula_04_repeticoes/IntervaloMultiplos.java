package aula_04_repeticoes;

import java.util.Scanner;

public class IntervaloMultiplos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Declaração das variáveis
		int num1;
		int num2;
		
		//utilizando os laço de repetiração if e do ...while 
		do {
		    System.out.println("**** O primeiro número deve ser menor que o segundo número ****");
		    System.out.print("Digite o primeiro número: ");
		    num1 = leia.nextInt();

		    System.out.print("Digite o segundo número: ");
		    num2 = leia.nextInt();

		    if (num1 >= num2) {
		        System.out.println("Ops, intervalo inválido!");
		        System.out.println("Tente novamente...\n");
		    }

		} while (num1 >= num2);
		
		for(int i = num1; i <= num2; i++) {
			if((i % 3 == 0) && (i % 5 == 0)) {
				System.out.printf("\n%d é multiplo de 3 e 5", i);
			}
		}
		leia.close();
	}
}
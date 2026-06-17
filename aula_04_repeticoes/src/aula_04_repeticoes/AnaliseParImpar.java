package aula_04_repeticoes;

import java.util.Scanner;

public class AnaliseParImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numPar = 0;
		int numImpar = 0;
		
		for(int i = 1; i <= 10; i++) { //i começa em 1 e vai até 10
			System.out.println("Digite o " + i + "º número:");
			int num = leia.nextInt();
			if(num % 2 == 0){
				numPar++;
			}else {
				numImpar++;
			}
		}
		System.out.printf("\nTotal de números pares: %d \nTotal números ímpares: %d", numPar, numImpar);

		leia.close();
	}

}

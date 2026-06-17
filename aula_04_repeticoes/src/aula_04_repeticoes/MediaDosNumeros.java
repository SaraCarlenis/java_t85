package aula_04_repeticoes;

import java.util.Scanner;

public class MediaDosNumeros {

	public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			int numero;
			int somaDosNumeros = 0;
			int contador = 0;
			
			do {
				System.out.println("Digite um número: ");
				numero = leia.nextInt();
				
				if(numero != 0 && numero % 3 == 0 ) {
					somaDosNumeros += numero;
					contador++;
				}
			}while(numero != 0);
				if(contador > 0) {
					double media = (double) somaDosNumeros / contador;
					System.out.printf("\nA média de todos os números múltiplos de 3 é: %.1f", media);
				}else {
				System.out.println("Nenhum número multiplo por 3 foi digitado");
				}
			leia.close();
	}
}

package aula_03_condicionais;

import java.util.Scanner;

public class CondicionaisEncadeado {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float media = 0.0f;
		
		System.out.println("Digite a primeira nota:");
		float nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		float nota2 = leia.nextFloat();

		System.out.println("Digite a terceira nota:");
		float nota3 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if(media > 5) {
			System.out.printf("\nAluno com media de: %.2f. Aprovado!", media);
		}else if(media == 5) {
			System.out.printf("\nAluno com media de: %.2f. Aluno de Exame!", media);
		}else {
			System.out.printf("\nAluno com media de: %.2f. Aluno Reprovado!", media);
		}
	}

}

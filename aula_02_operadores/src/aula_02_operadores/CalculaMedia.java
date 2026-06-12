package aula_02_operadores;

import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Declarando as 4 notas dos participantes
		float nota1, nota2, nota3, nota4, media;
		
		
		//Entrada dos dados
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		//Hora do calculo
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.printf("A média das notas é: %.2f", media);
		
		
		//Atividade adicional, verificando se o aluno foi aprovado ou não
		if(media < 5) {
			System.out.println("\nReprovado!");
		}else {
			System.out.println("\nAprovado!");
		}
		
		
		leia.close();
	}

}

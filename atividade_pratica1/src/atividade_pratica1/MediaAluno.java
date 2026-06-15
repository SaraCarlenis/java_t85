package atividade_pratica1;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = leia.nextLine();
		
		float nota1, nota2, nota3, nota4, media;
		
		//Entrada de Dados
		System.out.println("Digite a primeira nota (0 a 10): ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota (0 a 10): ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota (0 a 10): ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota (0 a 10): ");
		nota4 = leia.nextFloat();
		
		System.out.println("Notas digitadas: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4);
		System.out.println("Está correta? \n1- SIM \n2- NÃO");
		int resposta = leia.nextInt();
		
		if(resposta == 1) {
			
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println(nome + ", a media das suas notas é: " + media);
		
		if (media >= 7) {
            System.out.println("Parabéns, você foi aprovado(a)!");
        } else if (media >= 5) {
            System.out.println("Você está em recuperação!");
        } else {
            System.out.println("Lamentamos informar que você foi reprovado!");
        }
    } else if (resposta == 2) {
        System.out.println("Ops, notas descartadas. Por favor, tente novamente!");
    } else {
        System.out.println("Opção inválida! Digite apenas 1 ou 2.");
    }

    leia.close();
}
}
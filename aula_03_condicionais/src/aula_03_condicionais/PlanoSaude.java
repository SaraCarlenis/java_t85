package aula_03_condicionais;

import java.util.Scanner;

public class PlanoSaude {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("---Convenios dísponiveis---");
		System.out.println("---Para crianças de 0 até 10 anos, o valor do plano é: R$100,00");
		System.out.println("---De 11 até 29 anos, o valor do plano é: R$200,00");
		System.out.println("---De 30 até 45 anos, o valor do plano é: R$300,00");
		System.out.println("---De 46 até 59 anos, o valor do plano é: R$500,00");
		System.out.println("---De 60 até 65 anos, o valor do plano é: R$600,00");
		System.out.println("---De 66 anos para cima, o valor do plano é: R$1000,00");
		
		System.out.println("\nDigite seu nome: ");
		String nome = leia.next();
		
		System.out.println("\nDigite sua idade: ");
		int idade = leia.nextInt();
		

		if(idade > 0 && idade <= 10) {
			System.out.println("A mensalidade do plano correspondente é: R$100,00");
		}else if(idade >= 11 && idade <=29) {
			System.out.println("A mensalidade do plano correspondente é: R$200,00");
		}else if(idade >= 30 && idade <= 45) {
			System.out.println("A mensalidade do plano correspondente é: R$300,00");
		}else if(idade >=46 && idade <=59) {
			System.out.println("A mensalidade do plano correspondente é: R$500,00");
		}else if(idade >= 60 && idade <= 65)
			System.out.println("A mensalidade do plano correspondente é: R$600,00");
		else
			System.out.println("A mensalidade do plano correspondente é: R$1000,00");
		leia.close();
	}
}

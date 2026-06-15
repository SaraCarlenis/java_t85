package aula_03_condicionais;

import java.util.Scanner;

public class SistemaDoadores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
//Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação. 
//Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do doador e se é a primeira doação (boolean). 
//De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue. 
		
		System.out.println("==================================");
		System.out.println("   Sistema de Avaliação de Doadores");
		System.out.println("==================================");
		
		System.out.println("A seguir serão necessário inserir alguns dados para saber se está APTO para doar sangue ou NÃO");
		
		System.out.println("Digite seu nome: ");
		String nome = leia.next();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = leia.next();
		
		System.out.println("Digite sua idade: ");
		int idade = leia.nextInt();
		
		System.out.println("Primeria vez doando sangue?");
        System.out.println("Digite 1 para SIM ou 2 para NÃO: ");
        int resposta = leia.nextInt();
		boolean primeiraVez = (resposta == 1);
		
		if(idade >= 18 && idade <= 69 && primeiraVez == false) {
			System.out.printf("%s %s está aptó para doar sangue!", nome, sobrenome);
		}else if(idade >= 60 && idade <= 69 && primeiraVez == true) {
			System.out.printf("%s %s NÃO está apto para doar sangue!", nome, sobrenome);
		}else {
		    System.out.printf("%s %s NÃO está apto para doar sangue!%n", nome, sobrenome);
		}
		leia.close();
	}

}

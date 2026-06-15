package aula_03_condicionais;

import java.util.Scanner;

public class CondicionalVF {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 21;
		System.out.println("Digite seu nome: ");
		String nome = leia.next();
		
		if(idade >= 18) {
			System.out.printf("O participante: %s é maior de idade.", nome);
		}else {
			System.out.printf("O participante: %s é menor de idade.", nome);
		}
		
		leia.close();
	}

}

package atividade_pratica1;

import java.util.Scanner;

public class SistemaAutorizacao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("==================================");
		System.out.println("      Autorização de Entrada      ");
		System.out.println("==================================");
		
		System.out.println("Digite seu nome: ");
		String nome = leia.nextLine();
		
		System.out.println("Qual é sua idade: ");
		int idade = leia.nextInt();
		if(idade >= 18) {
			System.out.println(nome + ", seu acesso foi liberado!");
			}else {
				System.out.println("Possui permissão do seu responsável?");
	            System.out.println("1 - SIM");
	            System.out.println("2 - NÃO");
	            int resposta = leia.nextInt();
	            
	            if(resposta == 1) {
	            	System.out.println(nome + ", seu acesso foi liberado com autorização!");
	            }else {
	            	System.out.println(nome + ", seu acesso foi negado!");
	            }
		}
		
		System.out.println();
		
		leia.close();
	}

}

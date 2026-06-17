package aula_03_condicionais;

import java.util.Scanner;

public class LacoCondicionalSwitch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("*****************Tabela de Preços***********************");
		System.out.println(" Opção | Produto           ----------   Preço Unitario  ");
		System.out.println("********************************************************");
		System.out.println("1-       Cachorro Quente   ----------    R$ 10.00       ");
		System.out.println("2-       X-Salada          ----------    R$ 15.00       ");
		System.out.println("3-       X-Bacon           ----------    R$ 18.00       ");
		System.out.println("4-       Bauru             ----------    R$ 12.00       ");
		System.out.println("5-       Refrigerante      ----------    R$ 8.00        ");
		System.out.println("6-       Suco de Laranja   ----------    R$ 13.00       ");
		System.out.println("********************************************************");
 
		System.out.println("Escolha a opção do produto que deseja comprar de (1 a 6): ");
		int opcao = leia.nextInt();
		
		System.out.println("Digite a quantidade: ");
		int quantidade = leia.nextInt();
		
		double total = 0;
		
		switch(opcao) {
		case 1:
			total = quantidade * 10;
		break;	
		
		case 2:
			total = quantidade * 15;
		break;
		
		case 3:
			total = quantidade * 18;
		break;
			
		case 4:
			total = quantidade * 12;
		break;
			
		case 5:
			total = quantidade *8;
		break;
			
		case 6:
			total = quantidade * 13;
		break;
		default:
			System.out.println("Opção Inválida!");
		}
		
		System.out.printf("Opção: %d. \nQuantidade: %d. \nValor total: %.2f", opcao, quantidade, total);
		
		leia.close();
	}
	}

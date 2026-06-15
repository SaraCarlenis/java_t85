package aula_03_condicionais;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("***********Sistema de Conta Bancária****************");
		System.out.println("   Código da Operação       |          Operação     ");
		System.out.println("****************************************************");
		System.out.println("       1                    |          Saldo        ");
		System.out.println("       2                    |          Saque        ");
		System.out.println("       3                    |          Deposito     ");
		System.out.println("***********************************************");
 		
		System.out.println("Digite uma opção para poder seguir com o operação, de (1 a 3):");
		int codigo = leia.nextInt();
		
		float saldo = 1000.00f;
		
		switch(codigo) {
		case 1:
			System.out.printf("\nVocê selecionou a opção: %d \nSeu saldo atual é: %.2f", codigo, saldo);
		break;	
		
		case 2:
			System.out.println("Por favor, digite o valor do saque: ");
			float saque = leia.nextFloat();
			if(saldo < saque) {
				System.out.printf("O valor do saque é maior do que saldo em conta. Saldo em conta: %.2f. \nTente novamente!", saldo);
			}else {
				saldo -= saque;
				System.out.printf("\nVocê selecionou a opção: %d \nSeu saldo atual é: %.2f", codigo, saldo);
			}
		break;
		
		case 3:
			System.out.println("Por favor, digite o valor do deposito: ");
			float deposito = leia.nextFloat();
			saldo += deposito;
			System.out.printf("Após deposito de %.2f, seu saldo atual ficou em: %.2f", deposito, saldo);
		break;
			
		default:
			System.out.println("Ops, parece que você digitou uma opção invalida. Tente novamente!");
		}
		
		leia.close();
 
	}
}
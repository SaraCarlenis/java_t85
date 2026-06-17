package aula_03_condicionais;

import java.util.Scanner;

public class CalculadoraSimples {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("***********Calculadora Básica*****************");
		System.out.println("   Código            |          Operação      ");
		System.out.println("**********************************************");
		System.out.println("     1               |          Soma          ");
		System.out.println("     2               |          Subtração     ");
		System.out.println("     3               |          Multiplicação ");
		System.out.println("     4               |          Divisão       ");
		System.out.println("***********************************************");
 
		System.out.println("Que tal jogar com a calculadora e fazer alguns cálculos?");
		
		System.out.println("Digite uma opção para poder seguir com o operação, de (1 a 4):");
		int codigo = leia.nextInt();
		
		System.out.println("Digite um número: ");
		float num1 = leia.nextFloat();
		
		System.out.println("Digite outro número: ");
		float num2 = leia.nextFloat();
		
		switch(codigo) {
		case 1:
			float totalSoma = num1 + num2;
			System.out.printf("\nVocê selecionou a opção: %d \n%.1f + %.1f = %.1f", codigo, num1, num2, totalSoma);
		break;	
		
		case 2:
			float totalSubtracao = num1 - num2;
			System.out.printf("\nVocê selecionou a opção: %d \n%.1f - %.1f = %.1f", codigo, num1, num2, totalSubtracao);
		break;
		
		case 3:
			float totalMultiplicacao = num1 * num2;
			System.out.printf("\nVocê selecionou a opção: %d \n%.1f * %.1f = %.1f", codigo, num1, num2, totalMultiplicacao);
		break;
			
		case 4:
			if (num2 != 0) {
				float totalDivisao = num1 / num2;
                System.out.printf("\nVocê selecionou a opção: %d \\n%.1f * %.1f = %.1f", codigo, num1, num2, totalDivisao);
            } else {
                System.out.println("Erro: resto da divisão por ZERO não é permitido.");
            }
			break;
			
		default:
			System.out.println("Ops, parece que você digitou uma opção invalida. Tente novamente!");
		}
		
		leia.close();
	}
}

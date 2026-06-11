package aula_01_variaveis;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num1 = 10;
		int num2 = 5;
		int somatotal = num1 + num2;
		float num3, num4;
		
		
		System.out.println("O primeiro número é: " + num1);
		System.out.println("O segundo número é: " + num2);
		System.out.println(num1 + " + " + num2 + " = " + somatotal);
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		
		System.out.print("Digite o primeiro valor real: ");
		num3 = leia.nextFloat();
		
		System.out.print("Digite o segundo valor real: ");
		num4 = leia.nextFloat();
		
		System.out.printf("%.2f x %.2f = %.2f ", num3, num4, num3 * num4);
	}

}

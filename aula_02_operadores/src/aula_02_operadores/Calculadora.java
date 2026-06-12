package aula_02_operadores;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.println("---- Calculadora Básica ----");
		
		System.out.println("\nDigite o primero número: ");
		num1 = leia.nextDouble();
		
		System.out.println("\nDigite o primero número: ");
		num2 = leia.nextDouble();
		
		System.out.printf("\n%.2f + %.2f = %.2f", num1, num2, num1 + num2);
		System.out.printf("\n%.2f + %.2f = %.2f", num1, num2, num1 - num2);
		System.out.printf("\n%.2f + %.2f = %.2f", num1, num2, num1 * num2);
		System.out.printf("\n%.2f + %.2f = %.2f", num1, num2, num1 / num2);
		System.out.printf("\n%.2f + %.2f = %.2f", num1, num2, Math.pow(num1, num2));
		System.out.printf("\n%.2f + %.2f = %.2f", num1, num2, Math.sqrt(num1));

		
		leia.close();
	}

}

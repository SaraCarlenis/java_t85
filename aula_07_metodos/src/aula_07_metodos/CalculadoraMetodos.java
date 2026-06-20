package aula_07_metodos;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double num1, num2;
		
		sobre();
		
		System.out.println("**** Calculadora Básica ****");
		
		System.out.println("Digite o primeiro número:");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número:");
		num2 = leia.nextInt();
		
		System.out.printf("\n %.2f + %.2f = %.2f%n", num1, num2, somar(num1, num2));  //Passamos nosso método somar e os valores que serão somados que foram declaradas no main
		System.out.printf("\n %.2f - %.2f = %.2f%n", num1, num2, subtrair(num1, num2));
		System.out.printf("\n %.2f * %.2f = %.2f%n", num1, num2, multiplicacao(num1, num2));
		System.out.printf("\n %.2f / %.2f = %.2f%n", num1, num2, divisao(num1, num2));
		leia.close();
	}

	public static double somar(double numero1, double numero2) {
		return numero1 + numero2;
	}
	
	public static double subtrair(double numero1, double numero2) {
		return numero1 - numero2;
}
	public static double multiplicacao(double numero1, double numero2) {
		return numero1 * numero2;
	}	
	public static double divisao(double numero1, double numero2) {
		return numero1 / numero2;
}
	
	public static void sobre() {
		System.out.println("Projeto Calculadora Básica");
		System.out.println("Desenvolvido por: Sara");
	}
}
	

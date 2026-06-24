package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;
		
		//criamos um loop para que a operação seja finalizada somente quando der certo
		do {
		//antes da primeira entrada de dados inserimos a execao
		try {
		System.out.println("Digite o Dividendo: ");
		dividendo = ler.nextInt();
				
		System.out.println("Digite o Divisor: ");
		divisor = ler.nextInt();
				
		divide(dividendo, divisor);
		
		loop = false;
		
		}catch (InputMismatchException error) {
			System.err.println("Erro de digitação " + error.getMessage());
			ler.nextLine();
		}catch (ArithmeticException error) {
			System.err.println("Erro de calculo " + error.getMessage());
			ler.nextLine();
			}finally {
				System.out.println("Obrigada pela prefêrencia!");
			}
		}while(loop);
		}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}

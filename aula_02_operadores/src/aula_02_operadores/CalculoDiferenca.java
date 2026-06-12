package aula_02_operadores;

import java.util.Scanner;

public class CalculoDiferenca {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		//Dados de entrada
		
		System.out.println("---- CALCULANDO DIFERENÇAS ENTRE OS NÚMEROS DIGITADO ----");

		System.out.println("\nDigite um número: ");
		n1 = leia.nextFloat();
		
		System.out.println("\nDigite outro número: ");
		n2 = leia.nextFloat();
		
		System.out.println("\nDigite mais um número: ");
		n3 = leia.nextFloat();
				
		System.out.println("\nDigite o último número: ");
		n4 = leia.nextFloat();
		
		//Calculando diferença
		float resultado = (n1 * n2) - (n3 * n4);
		
        System.out.printf("Os números digitado foram:\nNúmero1 = %.2f \nNúmero2 = %.2f \nNúmero3 = %.2f \nNúmero4 %.2f", n1, n2, n3, n4);
        System.out.printf("\nDiferença = (%.2f * %.2f) - (%.2f * %.2f)\n", n1, n2, n3, n4);
		
		System.out.printf("\nDiferenças dos números digitados: %.2f", resultado);
		
		leia.close();
	}

}

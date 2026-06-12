package aula_02_operadores;

import java.util.Scanner;

public class DescontoLojas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		final double VALOR_MINIMO_FRETE_GRATIS = 150.00;
		
		System.out.println("Digite o valor total da compra: R$");
		double valorCompra = leia.nextDouble();
		
		System.out.println("O cliente é prime?");
		boolean isPrime = leia.nextBoolean();
		
		boolean ganhouFrete = valorCompra >= VALOR_MINIMO_FRETE_GRATIS;
		
		System.out.println("----- Status do pedido -----");
		System.out.printf("\nValor da compra em reais: %.2f", valorCompra);
		System.out.printf("\nCliemte Prime? %b", isPrime);
		System.out.printf("\nFrete gratis? %b", ganhouFrete);
		
		
		leia.close();
	}
}

package exercicios_praticas;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o raio do Círculo: ");
		float raioCirculo = leia.nextFloat();
		
		double areaDoCirculo = Math.PI * Math.pow(raioCirculo, 2);
		
		System.out.printf("A área do círculo é: %.2f", areaDoCirculo);
		
		leia.close();
	}

}

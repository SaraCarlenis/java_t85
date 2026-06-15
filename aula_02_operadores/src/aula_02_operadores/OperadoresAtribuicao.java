package aula_02_operadores;

public class OperadoresAtribuicao {

	public static void main(String[] args) {
		
		int num1 = 4;
		int num2 = 4;
		int num3 = 4;
		int num4 = 4;
		int num5 = 4;
		int num6 = 4;
		
		System.out.println("Atribuição com Soma: " + (num1 += 2));
		System.out.println("Atribuição com Subtraçõa: " + (num1 -= 2));
		System.out.println("Atribuição com Multiplicação: " + (num1 *= 2));
		System.out.println("Atribuição com Divisão: " + (num1 /= 2));
		System.out.println("Atribuição com Módulo: " + (num1 %= 2));
		
	}

}

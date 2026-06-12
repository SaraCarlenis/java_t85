package aula_02_operadores;

import java.util.Scanner;

public class Fluxograma {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Digite salário
		System.out.println("Digite seu salario: R$");
		float salario = leia.nextFloat();
				
		//Digite o abono
		System.out.println("\nDigite o abono a receber: R$");
		float abono = leia.nextFloat();
			
		//Novo salario
		float novoSalario = salario + abono;
		
		//exiba o novo salario
		System.out.printf("\nNovo salário é: %.2f", novoSalario);		
		
		leia.close();
	}

}

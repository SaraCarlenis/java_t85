package aula_02_operadores;

import java.util.Scanner;

public class FolhaPagamento {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Declarando variaveis
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		
		//Dados de entrada
		System.out.println("Digite o nome do funcionário: ");
        String nome = leia.nextLine();
        
		System.out.println("\nDigite o sálario bruto: R$");
		salarioBruto = leia.nextFloat();
		
		System.out.println("\nDigite o adicional noturno: R$");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("\nDigite o valor das horas extras: R$");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite os descontos: R$");
		descontos = leia.nextFloat();
		
		//Calculando todos os valores
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		//Mostrando resultado total
		System.out.println("\n--- Holerite ---");
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Adicional Noturno: " + adicionalNoturno);
        System.out.println("Horas Extras" + horasExtras * 5);
        System.out.println("Descontos: " + descontos);
		System.out.printf("\nSálario Líquido: %.2f R$ ", salarioLiquido);
		
		leia.close();
	}

}

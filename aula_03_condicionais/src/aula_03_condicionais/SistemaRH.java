package aula_03_condicionais;

import java.util.Scanner;

public class SistemaRH {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("***********Reajuste Salarial de Colaboradores*****************");
		System.out.println("Código Cargo |  Cargo       ----------  Percentual do Reajuste");
		System.out.println("**************************************************************");
		System.out.println("1-              Gerente       ----        10%                 ");
		System.out.println("2-              Vendedor      ----        7%                  ");
		System.out.println("3-              Supervisor    ----        9%                  ");
		System.out.println("4-              Motorista     ----        6%                  ");
		System.out.println("5-              Estoquista    ----        5%                  ");
		System.out.println("6-              Técnico de TI ----        8%                  ");
		System.out.println("**************************************************************");
 
		System.out.println("Sejá Benvindo ao Site de Reajuste Sálarial");
		
		System.out.println("Por favor, digite seu nome: ");
		String nome = leia.nextLine();
		
		System.out.println("Por favor, digite seu sobrenome: ");
		String sobrenome = leia.nextLine();
		
		System.out.println("Digite a opção valida a seu cargo de (1 a 6): ");
		int codCargo = leia.nextInt();
		
		if (codCargo < 1 || codCargo > 6) {
            System.out.println("Opção Inválida!...");
            leia.close();
            return; //Valida se a opção digitada é correta
		}
		
		System.out.println("Por favor informe seu sálario atual: ");
		float salarioAtual = leia.nextFloat();
		
		float novoSalario = salarioAtual;
		String cargo = "";
		
		switch(codCargo) {
		case 1:
			cargo = "Gerente";
			novoSalario = salarioAtual * 1.10f; //10% de aumento
		break;	
		
		case 2:
			cargo = "Vendedor";
			novoSalario = salarioAtual * 1.07f; //7% de aumento
		break;
		
		case 3:
			cargo = "Supervisor";
			novoSalario = salarioAtual * 1.09f; //9% de aumento
		break;
			
		case 4:
			cargo = "Motorista";
			novoSalario = salarioAtual * 1.06f; //6% de aumento
		break;
			
		case 5:
			cargo = "Estoquista";
			novoSalario = salarioAtual * 1.05f; //5% de aumento
		break;
			
		case 6:
			cargo = "Técnico de TI";
			novoSalario = salarioAtual * 1.08f; //8% de aumento
		break;
		}
		
		System.out.printf("\n%s %s. \nCargo: %s. \nNovo sálario com reajuste: R$ %.2f", nome, sobrenome, cargo, novoSalario);
		
		leia.close();
 
	}
}
package atividade_pratica1;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.println("***************CALCULADORA SIMPLES******************");
		System.out.println("          Código da Operação |    Função            ");
		System.out.println("****************************************************");
		System.out.println("      			1           |     SOMA              ");
		System.out.println("				2	        |     SUBTRAÇÃO         ");
		System.out.println(" 				3           |     MULTIPLICAÇÃO     ");
		System.out.println("                4           |     DIVISÃO           ");
		System.out.println("                5           |     RESTO DA DIVISÃ   ");
		System.out.println("****************************************************");
		
		
		//Entrada de Dados
		System.out.println("Escolha o código da operação:");
        int operacao = leia.nextInt();
        
        System.out.println("Digite o primero número: ");
		num1 = leia.nextDouble();
		
		System.out.println("Digite o primero número: ");
		num2 = leia.nextDouble();
        
        double resultado = 0;
        String nomeOperacao = "";
        
        //Laço Condicionar Switch Case
        switch(operacao) {
        case 1:
        	nomeOperacao = "Soma";
        	resultado = num1 + num2;
            System.out.printf("Operação: %s. \nResultado: %.0f + %.0f = %.0f", nomeOperacao, num1, num2, resultado);
        	break;
        case 2:
        	nomeOperacao = "Subtração";
        	resultado = num1 - num2;
            System.out.printf("Operação: %s. \nResultado: %.0f - %.0f = %.0f", nomeOperacao, num1, num2, resultado);
        	break;
        case 3:
        	nomeOperacao = "Multiplicação";
        	resultado = num1 * num2;
            System.out.printf("Operação: %s. \nResultado: %.0f * %.0f = %.0f", nomeOperacao, num1, num2, resultado);
        	break;
        case 4:
        	if(num2 != 0) { //Verifica se o segundo número é diferete de zero
        		nomeOperacao = "Divisão";
            	resultado = num1 / num2;
                System.out.printf("Operação: %s. \nResultado: %.0f / %.0f = %.0f", nomeOperacao, num1, num2, resultado);

        	}else {
        		System.out.println("Divisão por ZERO não é permitida."); //Caso for igual a zero ira mostrar uma mensagem informativa
        		leia.close();
        		return;
        	}
        	break;
        case 5:
        	if (num2 != 0) {
                nomeOperacao = "Resto da divisão";
                resultado = num1 % num2;
                System.out.printf("Operação: %s - Resultado: %.2f %% %.2f = %.2f\n",
                                  nomeOperacao, num1, num2, resultado);
            } else {
                System.out.println("Erro: resto da divisão por ZERO não é permitido.");
                leia.close();
                return;
            }
            break;
        }
        leia.close();
	}
}

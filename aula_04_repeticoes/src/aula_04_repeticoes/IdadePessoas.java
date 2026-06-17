package aula_04_repeticoes;

import java.util.Scanner;

public class IdadePessoas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		int totalMenores = 0;
		int totalMaiores = 0;
		
		
		while (idade >= 0) { //Enquanto idade for maior que sera, ele executara o código abaixo
            System.out.print("Digite sua idade: ");
            idade = leia.nextInt();

            if (idade < 0) {
            	System.out.println("Você digitou um numero negativo!");
                break; //Se a idade por menor do que zero, será mostrada uma mensagem e o break ira quebrar o bloco
            }

            if (idade < 21) {
                totalMenores++;
            } else if (idade > 50) {
                totalMaiores++;
            }
        }

        // Resultado final
        System.out.printf("\nTotal de pessoas menores de 21 anos: %d", totalMenores);
        System.out.printf("\nTotal de pessoas maiores de 50 anos: %d", totalMaiores);

        leia.close();
    }
}
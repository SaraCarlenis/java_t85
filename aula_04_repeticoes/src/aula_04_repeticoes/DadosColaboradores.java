package aula_04_repeticoes;

import java.util.Scanner;

public class DadosColaboradores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        double somaIdade = 0;
        int idade;
        int genero;
        int areaDoAnalista;
        char continua = 'S';
        double mediaIdades = 0;

        int totalBackend = 0, totalFrontendMulheresCisTrans = 0, totalMobileHomensMaior40 = 0,
            totalFullStackMenor30 = 0, totalRespostas = 0;

        while (continua == 'S' || continua == 's') {
            System.out.println("******* Analises de Dados *******");
            System.out.println("Bem-vindo(a)! \nPrecisamos de algumas informações para análise interna da empresa.");

            System.out.println("Digite sua idade: ");
            idade = leia.nextInt();
            somaIdade += idade;

            System.out.println("*** Escolha sua Identidade de Gênero: ***");
            System.out.println("1 - Mulher Cis");
            System.out.println("2 - Homem Cis");
            System.out.println("3 - Não Binario");
            System.out.println("4 - Mulher Trans");
            System.out.println("5 - Homem Trans");
            System.out.println("6 - Outros");
            genero = leia.nextInt();

            System.out.println("*** Pessoa Desenvolvedora: ***");
            System.out.println("1 - Backend");
            System.out.println("2 - Frontend");
            System.out.println("3 - Mobile");
            System.out.println("4 - FullStack");
            areaDoAnalista = leia.nextInt();

            totalRespostas++;

            if (areaDoAnalista == 1) {
                totalBackend++;
            } else if (areaDoAnalista == 2 && (genero == 1 || genero == 4)) {
                totalFrontendMulheresCisTrans++;
            } else if (areaDoAnalista == 3 && (genero == 2 || genero == 5)) {
                if (idade > 40) {
                    totalMobileHomensMaior40++;
                }
            } else if (areaDoAnalista == 4 && genero == 3) {
                if (idade < 30) {
                    totalFullStackMenor30++;
                }
            }

            do {
                System.out.println("Deseja continuar? (S/N)");
                continua = leia.next().toUpperCase().charAt(0);
            } while (continua != 'S' && continua != 'N');
        }

        if (totalRespostas > 0) {
            mediaIdades = somaIdade / totalRespostas;
        }

        System.out.println("********** Resultado da Pesquisa **********");
        System.out.printf("\nTotal pessoas desenvolvedoras Backend: %d", totalBackend);
        System.out.printf("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: %d", totalFrontendMulheresCisTrans);
        System.out.printf("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d", totalMobileHomensMaior40);
        System.out.printf("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: %d", totalFullStackMenor30);
        System.out.printf("\nNúmero total de pessoas que responderam à pesquisa: %d", totalRespostas);
        System.out.printf("\nA média de idade das pessoas que responderam à pesquisa: %.2f", mediaIdades);
        System.out.printf("\n*******************************************");

        leia.close();
    }
}	
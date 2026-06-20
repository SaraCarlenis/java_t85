package aula_07_metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaAlunos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<List<String>> alunos = new ArrayList<>();
		
		List<String> aluno = new ArrayList<>();
		
		int opcao = -1;
		
		while(opcao != 0) {
			System.out.printf("**\n1 Digite a opção desejada \n**");
			System.out.println("*******************************");
			System.out.println(" 1 - Registrar aluno:          ");
			System.out.println(" 2 - Listar todos os Alunos    ");
			System.out.println(" 3 - Calcular Media Geral      ");
			System.out.println(" 0 - Sair                      ");
			System.out.println("Digite a opção desejada:       ");
			opcao = leia.nextInt();
			leia.nextLine();
			
		switch(opcao) {
		case 1:
			System.out.println("Digite o nome do aluno: ");
			String nomeAluno = leia.nextLine();
			aluno.add(nomeAluno);
			System.out.println("Digite a idade do aluno " + nomeAluno);
			int idade = leia.nextInt();
			aluno.add(String.valueOf(idade));
			System.out.println("Digite a nota do aluno " + nomeAluno);
			int notaAluno = leia.nextInt();
			aluno.add(String.valueOf(notaAluno));
			alunos.add(aluno);
			break;
			
		case 2:
			if(alunos.isEmpty()) {
				System.out.println("Lista de alunos vazia!");
			} else {
				System.out.println("Lista de alunos: ");
				for(List<String> listaAlunos : alunos){
					System.out.println("nome: " + listaAlunos.get(0));
				}
				System.out.println(" ");
			}
			break;
			
		case 3:
            calculaMedia(alunos);
			break;
			
		case 0:
			System.out.println("Obrigada pela contribuição!");
			break;
			
		default:
			System.out.println("Opção incorreta. Tente novamente! \n");
			
			}
		}
		leia.close();
	}
	public static void calculaMedia(ArrayList<List<String>> alunos) {
		if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno registrado!");
        } else {
            int soma = 0;
            for (List<String> listaAlunos : alunos) {
                soma += Integer.parseInt(listaAlunos.get(2)); //Pega a nota
            }
            double media = (double) soma / alunos.size();
            System.out.printf("\nA média das notas é: %.1f ", media);
        }
	}
}


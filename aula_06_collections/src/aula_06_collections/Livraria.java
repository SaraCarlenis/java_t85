package aula_06_collections;

import java.util.Scanner;
import java.util.Stack;

public class Livraria {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Stack<String> livros = new Stack<>();
		
		int opcao = -1;
		
		while(opcao != 0) {
		System.out.println("*** Digite a opção desejada ***");
		System.out.println("*******************************");
		System.out.println(" 1 - Adicionar Livro na pilha  ");
		System.out.println(" 2 - Listar todos os Livros    ");
		System.out.println(" 3 - Retirar Livro da pilha    ");
		System.out.println(" 0 - Sair                      ");
		System.out.println("Digite a opção desejada: ");
		opcao = leia.nextInt();
		leia.nextLine();
		
		switch(opcao) {
		case 1: 
			System.out.println("Qual seria o nome do livro: ");
			String nomeLivro = leia.nextLine();
			livros.push(nomeLivro);
			System.out.println("Livro '" + nomeLivro + "' adicionado!");
			System.out.println(" ");
			break;
			
		case 2:	
			if(livros.empty()) {
				System.out.println("Pilha vazia!");
			} else {
				System.out.println("Lista de Livros na Pilha: ");
				for(String livro : livros) {
					System.out.println(livro);
				}
				System.out.println(" ");
			}
			break;
			
		case 3:
			if(livros.empty()) {
				System.out.println("A pilha está vazia! \n");
			}else {
				String livroRetirado = livros.pop();
				System.out.println("Livro retirado: " + livroRetirado);
				
				System.out.println("Pilha atualizada:");
				for(String livro : livros) {
					System.out.println(livro);
				}
			}
			break;
			
		case 0:	
			System.out.print("\nVolte sempre! \n");
			break;
			
		default:
			System.out.print("\nOps, opção incorreta. Tente novamente! \n");
		}
		}
		leia.close();
	}

}

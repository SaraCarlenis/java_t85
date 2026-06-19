package aula_06_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AppBanco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		int opcao = -1;
		
		while(opcao != 0) {
		System.out.println("*** Digite a opção desejada ***");
		System.out.println("*******************************");
		System.out.println(" 1 - Adicionar Cliente na Fila ");
		System.out.println(" 2 - Listar todos os Clientes  ");
		System.out.println(" 3 - Retirar Cliente da Fila   ");
		System.out.println(" 0 - Sair                      ");
		System.out.println("Digite a opção desejada: ");
		opcao = leia.nextInt();
		leia.nextLine();
		
		switch(opcao) {
		case 1:
			System.out.println("Digite o nome do cliente");
			String nomeCliente = leia.nextLine();
			fila.add(nomeCliente);
			System.out.println("Cliente " + nomeCliente + " foi adicionado!\n");
			break;
			
		case 2:
			if(fila.isEmpty()) {
				System.out.println("A fila está vazia!");
			}else {
				System.out.println("Lista de Clientes na Fila:");
				for(String cliente : fila) {
					System.out.println(cliente);
				}
			}
			break;
			
		case 3:
			String revisaoLista = fila.poll();
			if(revisaoLista == null) {
				System.out.println("A fila está vazia!");
			}else {
				System.out.println("Cliente atendido: " + revisaoLista);
		        System.out.println("Fila atualizada:");
		        for(String cliente : fila) {
		            System.out.println(cliente);
		        }
			}
			break;
			
		case 0:
			System.out.println("Volte sempre!");
			break;
			
		default:
			System.out.println("Opção incorreta. Tente novamente!");
		}
		}
		
		leia.close();
	}

}

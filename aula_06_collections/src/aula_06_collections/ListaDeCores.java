package aula_06_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaDeCores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>(); //Parte da Biblioteca collection
		
		for(int i = 0; i < 5; i++) { //Verifica se as cores digitada pelo usuário são menos que 5, quando atigir encerrar o bloco
			System.out.println("Digite uma cor: ");
			cores.add(leia.nextLine());
		}
		
		for(String cor : cores) { //forEach cor recebe cores e mostra na tela a lista de cores digitadas
			System.out.println("Lista das cores digitadas: " + cor);
			}
		
		Collections.sort(cores); // utilizamos a collection sort para ordenas de forma crescente
		
		for(String cor : cores) { //forEach cor recebe cores e mostra na tela a lista de forma crescente
			System.out.println("Cores ordenadas de forma alfabetico: " + cor);
			}
		
		leia.close();
	}

}

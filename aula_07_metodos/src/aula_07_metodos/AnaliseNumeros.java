package aula_07_metodos;

import java.util.ArrayList;
import java.util.List;

public class AnaliseNumeros {

	public static void main(String[] args) {
		
		List<Integer> numeroArray = new ArrayList<>();
		
		System.out.println("Lista de Números Inteiros:");
		numeroArray.add(5);
		numeroArray.add(20);
		numeroArray.add(40);
		numeroArray.add(9);
		numeroArray.add(3);
		
		resultadoSoma(numeroArray);
		
	}
	
	public static void resultadoSoma(List<Integer> lista) { //Dentro dos parametros passamos um tipo lista do tipo inteiros 
		int soma = 0;
		int media = 0;
		int numMaior = 0;
		
		for(int numero : lista) {
			System.out.println(numero);
			soma += numero;
			if(numero > numMaior) {
				numMaior = numero;
			}
		}

		media = soma/lista.size();
		System.out.println("A soma total de todos os números é: " + soma);
		System.out.println("A media dos números é: " + media);
		System.out.println("O maior número é: " + numMaior);
	}
}

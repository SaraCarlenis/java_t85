package aula_05_array;

public class MatrizInteiros {

	public static void main(String[] args) {
		
		int[][] matriz = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
		
			int somaPrincipal = 0;
			int somaSecundaria = 0;

	        System.out.print("Elementos da Diagonal Principal: ");
	        for (int i = 0; i < matriz.length; i++) {
	            System.out.print(matriz[i][i] + " ");
	            somaPrincipal += matriz[i][i];
	        }
	        
	        System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaPrincipal);


	        System.out.println();

	        System.out.print("Elementos da Diagonal Secundária: ");
	        for (int i = 0; i < matriz.length; i++) {
	            System.out.print(matriz[i][matriz.length - 1 - i] + " ");
	            somaSecundaria += matriz[i][matriz.length - 1 - i];
	            }
	        System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + somaSecundaria);
	    }
	}

package exercicios_praticas;

import java.util.Scanner;

public class TempoEmSegundos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o tempo em segundos: ");
		int tempoEmSegundos = leia.nextInt();
		
		int horas = tempoEmSegundos / 3600;
		int minutos = (tempoEmSegundos % 3600) / 60;
		int segundos = tempoEmSegundos % 60;
		
		
		System.out.printf("Tempo expresso em (hh:mm:ss): %d : %d : %d ", horas, minutos, segundos);
		
		leia.close();
	}

}

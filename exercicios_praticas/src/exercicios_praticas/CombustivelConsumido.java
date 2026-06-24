package exercicios_praticas;

import java.util.Scanner;

public class CombustivelConsumido {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double rendimento = 12; //o carro faz 12 km por litro de combustível.
		
		System.out.println("Digite o tempo gasto na viagem: ");
		double tempoGasto = leia.nextDouble();
		
		System.out.println("Digite a velocidade média (em KM por horas): ");
		double velocidadeMedia = leia.nextDouble();
		
		double distancia = tempoGasto * velocidadeMedia; //Calcula a distância percorrida.
		
		double combustivelGasto = distancia / rendimento; //Calcula o combustível consumido.
		
		System.out.printf("\nRendimento do combustível em litros é: %.2f", rendimento);
		System.out.printf("\nTotal combustível gasto em litros é: %.2f", combustivelGasto);
		
		
		
		leia.close();
	}

}

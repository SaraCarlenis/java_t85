package aula_07_metodos;

import java.util.List;
import java.util.ArrayList;

public class ControleEstoque {

	public static void main(String[] args) {
		
		List<String> estoque = new ArrayList<>();
		
		System.out.println("Lista de Produtos no Estoque");
		estoque.add("Monitor");
		estoque.add("TouchPad");
		estoque.add("Teclado");
		estoque.add("Monitor");
		estoque.add("TouchPad");
		estoque.add("Teclado");
		estoque.add("Monitor");
		estoque.add("TouchPad");
		
		avaliacaoEstoque(estoque);
	}
	
	public static void avaliacaoEstoque(List<String> lista) {
		int quantidadeMonitor = 0;
		int quantidadeTeclado = 0;
		int quantidadeTouchPad = 0;
		
		for(String produto : lista) {
			if(produto.equals("Monitor")) {
				quantidadeMonitor++;
			} else if(produto.equals("Teclado")) {
				quantidadeTeclado++;
			} else if(produto.equals("TouchPad")) {
				quantidadeTouchPad++;
			}
		}
		
		System.out.println("Produto Monitor: " + quantidadeMonitor );
		System.out.println("Produto Teclado: " + quantidadeTeclado );
		System.out.println("Produto TouchPad: " + quantidadeTouchPad );
		}
	}

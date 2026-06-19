package aula_06_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
	
	//Foco do Set é não ter dados repetidos 

	public static void main(String[] args) {
		Set<String> frutas = new HashSet<String>(); // declaramos a collection Set
		
		ArrayList<String> ListaFrutas = new ArrayList<String>(Arrays.asList("Abacaxi", "Banana", "Melão")); //Podemos incluir varios elementos ao mesmo tempo
		
		frutas.add("Abacate");
		frutas.add("abacate");
		frutas.add("Morango");
		frutas.add("Maça");
		frutas.add("Abacate");
		frutas.add("Laranja");
		frutas.addAll(ListaFrutas); // desse jeito chamamos nosso arrayList para mostrar todas as frutas declaradas nele
		
		
		for(String fruta : frutas) { //utilizamos o forEach, para ele percorrer fruta por fruta
			System.out.println(fruta);
		}
		
		System.out.println("Fruta Laranja está presente? " + frutas.contains("Laranja")); // verifica se dentro da collection set tem a fruta laranja: true ou false
		frutas.remove("Laranja"); //remove a fruta
		
		for(String fruta : frutas) { //Refazendo o for para verificar quais frutas estão na lista e analisar se Laranja foi removida 
			System.out.println(fruta);
		
		}
		System.out.println("Fruta Laranja está presente? " + frutas.contains("Laranja")); // verificando se laranja esta dentro da collectio set
	}
}
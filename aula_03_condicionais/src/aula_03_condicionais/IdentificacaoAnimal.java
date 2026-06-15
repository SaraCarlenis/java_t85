package aula_03_condicionais;

import java.util.Scanner;

public class IdentificacaoAnimal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada das 3 palavras
        String tipo = sc.nextLine();
        String classe = sc.nextLine();
        String alimentacao = sc.nextLine();

        String animal = "";

        // Estrutura de decisão
        if (tipo.equals("vertebrado")) {
            if (classe.equals("ave")) {
                if (alimentacao.equals("carnivoro")) {
                    animal = "aguia";
                } else if (alimentacao.equals("onivoro")) {
                    animal = "pomba";
                }
            } else if (classe.equals("mamifero")) {
                if (alimentacao.equals("onivoro")) {
                    animal = "homem";
                } else if (alimentacao.equals("herbivoro")) {
                    animal = "vaca";
                }
            }
        } else if (tipo.equals("invertebrado")) {
            if (classe.equals("inseto")) {
                if (alimentacao.equals("hematofago")) {
                    animal = "pulga";
                } else if (alimentacao.equals("herbivoro")) {
                    animal = "lagarta";
                }
            } else if (classe.equals("anelideo")) {
                if (alimentacao.equals("hematofago")) {
                    animal = "sanguessuga";
                } else if (alimentacao.equals("onivoro")) {
                    animal = "minhoca";
                }
            }
        }
        
        System.out.println(animal);

        sc.close();
    }
}
package aula_08_java;

public class TestaFarmacia {

	public static void main(String[] args) {
		Farmacia p1 = new Farmacia("Dipirona", 15.00f, 1, 100, "Analgesicos");
		Farmacia p2 = new Farmacia("Shampoo", 20.00f, 2, 30, "Higiene");
		Farmacia p3 = new Farmacia("Desloratadina", 10.00f, 5, 500, "Antialegicos");

		p1.visualizar();		
		p2.visualizar();
		p3.visualizar();
	}

}

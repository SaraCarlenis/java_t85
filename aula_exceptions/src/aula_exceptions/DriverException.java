package aula_exceptions;

public class DriverException extends Exception {

	/**
	 * 
	 */
	
	//serial version ID = Quando criamos um objeto em java e esse objeto herda uma classe
	// serializable, para que um objeto seja serializado. Ele é utilizado para que a versao
	//da classe seja compativel
	private static final long serialVersionUID = 1L;

	public DriverException() {
	}
	
	//manda mensagem ao usuário
	public DriverException(String mensagem) {
		super(mensagem);
	}
	
	

}

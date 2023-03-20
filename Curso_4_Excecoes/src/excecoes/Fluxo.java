package excecoes;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Inicio do Main");
		try {
			metodo1();
		} catch(ArithmeticException | NullPointerException | MinhaExcecao e) {
			String msg = e.getMessage();
			System.out.println("Exception " + msg);
			e.printStackTrace();

		} 
		System.out.println("Fim do Main");
	}

	public static void metodo1() {
		System.out.println("Inicio metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}

	public static void metodo2() {
		System.out.println("Inicio metodo 2");
		
		throw new MinhaExcecao("Deu muito errado");
		
		// System.out.println("Fim do metodo 2");
	}

}

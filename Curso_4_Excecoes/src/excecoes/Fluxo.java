package excecoes;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Inicio do Main");
		try {
			metodo1();
		} catch(Exception e) {
			String msg = e.getMessage();
			System.out.println("Pegando a Excecao " + msg);
			e.printStackTrace();

		} 
		System.out.println("Fim do Main");
	}

	public static void metodo1() throws MinhaExcecao {
		System.out.println("Inicio metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}

	public static void metodo2() throws MinhaExcecao {
		System.out.println("Inicio metodo 2");
		throw new MinhaExcecao("deu muito errado");
		// System.out.println("Fim do metodo 2");
	}

}

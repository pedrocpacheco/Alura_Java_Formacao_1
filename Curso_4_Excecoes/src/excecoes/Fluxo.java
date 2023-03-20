package excecoes;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Inicio do Main");
		metodo1();
		System.out.println("Fim do Main");
	}
	
	public static void metodo1() {
		System.out.println("Inicio metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}
	
	public static void metodo2() {
		System.out.println("Inicio metodo 2");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;
		}
		System.out.println("Fim do metodo 2");
	}
	
}

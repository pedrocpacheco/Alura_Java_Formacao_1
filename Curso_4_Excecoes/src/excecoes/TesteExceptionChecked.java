package excecoes;

public class TesteExceptionChecked {

	public static void main(String[] args) {
		
		Classe c = new Classe();
		try {
			c.deposita();
		} catch(MinhaExcecao e) {
			System.out.println("tratamento");
		}
		
	}
	
}

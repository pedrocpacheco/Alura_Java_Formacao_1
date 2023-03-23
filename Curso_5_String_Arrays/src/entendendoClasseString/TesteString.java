package entendendoClasseString;

public class TesteString {

	public static void main(String[] args) {
		
		// Não pode ser alterada
		String nome = "Pedro"; // Hoje em dia é melhor String assim
		String outroNome = new String("Outro Jeito de escrever");
						  
//		Alocando valor retornado | o metodo retorna uma String
		nome = nome.replace("P", "p"); // .replace nao muda Sr que usa ele
		// podiamos ter salvo em outra variavel, com o String novoNovo = nome.replace("P", "p");
		System.out.println(nome);
		
		// Metodos String
		// .charAt
		char charNaPosicao = nome.charAt(2);
		System.out.println(charNaPosicao);
		
		// .indexOf (tem varios)
		int indexOf = nome.indexOf("ro");
		System.out.println(indexOf);
		
		// .substring
		String sub = nome.substring(1);
		System.out.println(sub);
	
		// .length
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		// .isempty e trim 
		String vazio = " ";
		System.out.println(vazio.isEmpty());
		String vazioSemEspaco = vazio.trim(); // tira os espaços
		System.out.println(vazio.isEmpty());
		
		// .contais
		String email = "emailparateste@hotmail.com";
		System.out.println("Vendo se email contem @: ");
		System.out.println(email.contains("@"));
		System.out.println("Vendo se email contem .com: ");
		System.out.println(email.contains(".com"));
		
		
	}
	
}

package heranca;

public class TesteGerente {

	public static void main(String[] args) {

		// 1- Criando Objeto da Subclasse Gerente
		Gerente luane = new Gerente("Luane", "504040", 3000.0, 12);

		// 2- Usando metodos da Superclasse Gerente a partir de objeto sub
		System.out.println(luane.getNome());
		System.out.println(luane.getCpf());
		System.out.println(luane.getSalario());
		
		// 3- Usando metodo exclusivo da subclasse
		System.out.println(luane.getSenha());
		
		// 4- Usando metodo "sobscrito" sem polimorfismo
		System.out.println(luane.getBonificacao());

		Autenticavel gerente = new Gerente();
	
		Administrador pedro = new Administrador();
		
		pedro.setSalario(2000);
		pedro.setSenha(12);
		
		System.out.println(pedro.autentica(12));
		
		
	}
	
}

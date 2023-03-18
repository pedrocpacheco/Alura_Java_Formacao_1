package heranca;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		
		// Criando Objeto da Superclasse Funcionario
		Funcionario pedro = new Funcionario("Pedro", "5502020-2", 2500.00);
		
		// Usando metodos da Superclasse Funcionario
		System.out.println(pedro.getNome());
		System.out.println(pedro.getBonificacao());
	
		// Criando Objeto da Subclasse Gerente
		Gerente luane = new Gerente("Luane", "504040", 3000.0, 12);
		
		// Usando metodos da Superclasse Gerente a partir de objeto sub
		System.out.println(luane.getNome());
		System.out.println(luane.getCpf());
		System.out.println(luane.getSalario());
		//Usando metodo exclusivo da subclasse
		System.out.println(luane.getSenha());
		
	}
	
}

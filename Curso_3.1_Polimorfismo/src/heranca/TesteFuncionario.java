package heranca;

public class TesteFuncionario {

	public static void main(String[] args) {

		// Criando Objeto da Superclasse Funcionario
		Funcionario pedro = new Gerente("Pedro", "5502020-2", 2500.00, 111);

		// Usando metodos da Superclasse Funcionario
		System.out.println(pedro.getNome());
		System.out.println(pedro.getBonificacao());

	}

}

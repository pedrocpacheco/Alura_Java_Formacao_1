package heranca;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario pedro = new Funcionario("Pedro", "5502020-2", 2500.00);
		
		System.out.println(pedro.getNome());
		System.out.println(pedro.getBonificacao());
		
	}
	
}

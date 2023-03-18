package heranca;

public class Gerente extends Funcionario {

	private int senha;
	
	public Gerente() {
		
	}
	
	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else{
			return false;
		}
		
		}
	
	// 1- Reescrita de metodos
	@Override
	public double getBonificacao() {
		System.out.println("Chamado o metodo de Bonificação do Gerente");
		return super.getBonificacao() + super.salario; // super é usado quando falamos de algo definido na superclasse
		// utilizamos o metodo da super classe dentro de um da sub
	}
	
	
	
}
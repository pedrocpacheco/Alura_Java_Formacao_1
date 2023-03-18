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
	public double getBonificacao() {
		return super.salario; // super é usado quando falamos de algo definido na superclasse
		
	}
	
	// 2- utilizando super.metodo
	public double getBonfiicacaoComSuper() {
		return super.getBonificacao() + super.getSalario();
	} // utilizamos o metodo da super classe dentro de um da sub
	
	
}

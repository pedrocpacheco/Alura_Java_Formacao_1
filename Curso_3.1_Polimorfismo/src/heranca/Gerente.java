package heranca;

public class Gerente extends Funcionario implements Autenticavel{

private int senha;
private Autenticador autenticador;
	
	public Gerente() {
		
	}
	
	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
		this.autenticador = new Autenticador();
	}
	
	public int getSenha() {
		return senha;
	}
	 
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
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
		return 100; // super é usado quando falamos de algo definido na superclasse
		// utilizamos o metodo da super classe dentro de um da sub
	}
	
	
}

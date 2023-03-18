package heranca;

public class ControleBonificacao {

	private double soma;
	
	public void registra(Funcionario f) {
		this.soma = this.soma + f.getBonificacao();
	}
	// Esse metodo se aplica tanto para Funcionarios, Gerentes e Editor de video
	// Pois TODOS são eles funciorios, por originarem da Superclasse Funcionario
	
	
	public double getSoma() {
		return soma;
	}
	
	
}
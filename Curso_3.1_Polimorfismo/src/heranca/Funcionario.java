package heranca;

// nao pode criar objetos dessa classe
public abstract class Funcionario {

	private String nome;
	private String cpf;
	protected double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario (String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	// Corpo do metodo sera feito pelos filhos
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}

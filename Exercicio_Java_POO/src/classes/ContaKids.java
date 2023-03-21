package classes;

import excecoes.IntInvalidoException;
import excecoes.StringInvalidaException;

public class ContaKids extends Conta{

	public ContaKids(String agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public String getExecucao() {
		String execucao = "Você executou uma Conta Kids";
		return execucao;
	}
	
	@Override
	public void setTitular(String nome, int idade) throws StringInvalidaException {
		this.titular = new Cliente();
		this.titular.setNome(nome);
		if(idade > 18) {
			throw new IntInvalidoException("Conta Kids só aceitam menores de 18 anos");
		}
		this.titular.setIdade(idade);
	}

}

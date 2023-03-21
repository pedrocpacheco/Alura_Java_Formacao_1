package classes;

import excecoes.IntInvalidoException;
import excecoes.StringInvalidaException;

public class ContaIdosos extends Conta{

	public ContaIdosos(String agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public String getExecucao() {
		String execucao = "Você executou uma Conta Idoso";
		return execucao;
	}
	
	@Override
	public void setTitular(String nome, int idade) throws StringInvalidaException {
		this.titular = new Cliente();
		this.titular.setNome(nome);
		if(idade < 65) {
			throw new IntInvalidoException("Conta Idosos só aceitam maiores de 65 anos");
		}
		this.titular.setIdade(idade);
	}
	}



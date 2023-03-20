package classes;

import excecoes.IntInvalidoException;

public class ContaPoupanca extends Conta implements InvestirDesinvestir{

	int saldo;
	Investidor investidor;

	public ContaPoupanca() {
		this.investidor = new Investidor();
	}
	
	// Metodos da Classe Abstrata
	
	public void setSaldo(int valor) {
		if(saldo < 0) {
			throw new IntInvalidoException("Seu saldo é invalido mutchacho");
		}
		this.saldo = valor + 100;
	}


	public int getSaldo() {
		return this.saldo;
	}
	
	
	// Metodos da Interface
	@Override
	public void investir(int valor) {
		this.investidor.investir(valor);
	}

	@Override
	public void desisvestir(int valor) {
		this.investidor.desisvestir(valor);
	}


	@Override
	public String getExecucao() {
		String execucao = "Você executou uma Conta Poupanca!";
		return execucao;
	}
		
	
}
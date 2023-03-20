package classes;

import excecoes.IntInvalidoException;

public class ContaCorrente extends Conta implements InvestirDesinvestir{

	int saldo;
	Investidor investidor;
	
	// Construtor
	public ContaCorrente() {
		this.investidor = new Investidor();
	}
	
	// Metodos Interface
	@Override
	public void investir(int valor) {
		this.investidor.investir(valor);
	}

	@Override
	public void desisvestir(int valor) {
		this.investidor.desisvestir(valor);
		
	}
	
	// Metodos Unicos
	public void setSaldo(int valor) {
		if(saldo < 0) {
			throw new IntInvalidoException("Seu saldo é invalido mutchacho");
		}
		this.saldo = valor + 100;
	}


	public int getSaldo() {
		return this.saldo;
	}

	// Metodo Herdado
	@Override
	public String getExecucao() {
		String execucao = "Você executou uma Conta Corrente";
		return execucao;
	}

	
}

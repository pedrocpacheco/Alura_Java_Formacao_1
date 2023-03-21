package classes;

import excecoes.IntInvalidoException;

public class ContaPoupanca extends Conta implements InvestirDesinvestir {

	private int saldo;
	private Investidor investidor;

	public ContaPoupanca(String agencia, int numero) {
		super(agencia, numero);
		this.investidor = new Investidor();
	}

	// Metodos da Interface
	@Override
	public int investir(int valor) {
		return this.investidor.investir(valor);
	}

	@Override
	public int desisvestir(int valor) {
		return this.investidor.desisvestir(valor);
	}

	// Metodos da Classe Abstrata

	public void setSaldo(int valor) {
		if (saldo < 0) {
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
		String execucao = "Você executou uma Conta Poupanca!";
		return execucao;
	}

}

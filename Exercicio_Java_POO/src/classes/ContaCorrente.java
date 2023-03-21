package classes;

import excecoes.IntInvalidoException;

public class ContaCorrente extends Conta implements InvestirDesinvestir {

	private int saldo;
	private Investidor investidor;

	// Construtor
	public ContaCorrente(String agencia, int numero) {
		super(agencia, numero);
		this.investidor = new Investidor();
	}

	// Metodos Interface
	@Override
	public int investir(int valor) {
		return this.saldo += this.investidor.investir(valor);
	}

	@Override
	public int desisvestir(int valor) {
		return this.investidor.desisvestir(valor);

	}

	// Metodos Unicos
	public void setSaldo(int valor) {
		if (saldo < 0) {
			throw new IntInvalidoException("Seu saldo é invalido mutchacho");
		}
		this.saldo = valor + 200;
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

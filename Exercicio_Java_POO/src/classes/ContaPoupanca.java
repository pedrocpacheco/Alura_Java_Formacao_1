package classes;

import excecoes.IntInvalidoException;

public class ContaPoupanca extends Conta implements Investidores{

	double saldo;

	// Metodos da Classe Abstrata
	@Override
	public void setSaldo(double valor) {
		if(saldo < 0) {
			throw new IntInvalidoException("Seu saldo é invalido mutchacho");
		}
		this.saldo = valor + 1000;
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}
	
	
	// Metodos da Interface
	@Override
	public void Investir(int valor) {
		this.saldo += valor*10;
	}

	@Override
	public void Desisvestir(int valor) {
		this.saldo -= valor*10;
	}
		
	
}

package classes;

import excecoes.IntInvalidoException;
import excecoes.StringInvalidaException;

public abstract class Conta {

	Cliente titular;
	String agencia;
	int numero;
	static int total;
	
	public Conta() {
		
	}
	
	public abstract String getExecucao();
	
	public Conta(String agencia, int numero) {
		Conta.total++;
		System.out.println("Existem atualmente " + Conta.total + ", contas!");
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("A Conta de numero" + this.numero + ", foi criada na agencia " + this.agencia);
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) throws StringInvalidaException {
		for(int i = 0; i < agencia.length(); i++) {
			char ch = agencia.charAt(i);
			if(!Character.isLetter(ch)) {
				throw new StringInvalidaException("O nome da sua agencia é invalido");
			} 
			this.agencia = agencia;
		}
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		if(numero < 0) {
			throw new IntInvalidoException("O numero da sua agencia é invalido");
		}
	}
	
}
package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22);
		
		System.out.println(cc.toString());
		
	}
	
}

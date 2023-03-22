package br.com.alura;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente();
		conta.setNumero(10);
		System.out.println(conta.getNumero());
		
		

	}

}

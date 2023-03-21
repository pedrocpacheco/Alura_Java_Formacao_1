package testes;

import classes.ContaCorrente;
import classes.ContaIdosos;
import classes.ContaKids;
import classes.ContaPoupanca;
import classes.ControleExecucoes;
import excecoes.StringInvalidaException;

public class TesteContas {
	
	public static void main(String[] args) throws StringInvalidaException {
		
		// Criação das Contas
		ContaCorrente cc = new ContaCorrente("AgenciaCorrente", 123);
		cc.setTitular("Pedro", 17);
		
		ContaPoupanca cp = new ContaPoupanca("AgenciaPoupanca", 456);
		cp.setTitular("Luane", 19);
		
		ContaKids ck = new ContaKids("AgenciaKids", 789);
		ck.setTitular("Daniel", 16);
		
		ContaIdosos ci = new ContaIdosos("AgenciaIdosos", 91011);
		ci.setTitular("João", 80);
		
		// Controle Execucao
		ControleExecucoes controle = new ControleExecucoes();
		controle.registra(cc); // Adicionando cc ao array execucoes
		controle.registra(cp); // Adicionando cp ao array execucoes
		controle.registra(ck); // Adicionando ck ao array execucoes
		controle.registra(ci); // Adicionando ci ao array execucoes
		
		System.out.println(controle.getExecucoes()); // Printando o array execucoes
		
		// Metodos Exclusivos
		cc.setSaldo(1000);
		System.out.println(cc.getSaldo());
		
		cp.setSaldo(1000);
		System.out.println(cp.getSaldo());
		
		// Metodos Interface
		cc.investir(20);
		System.out.println(cc.getSaldo());
		
		cp.desisvestir(10);
		System.out.println(cp.getSaldo());
		
	}

}

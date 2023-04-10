package arrays;

import arrays.classes.Conta;
import arrays.classes.ContaCorrente;
import arrays.classes.ContaPoupanca;

public class ReferencesInheritanceArrays {

public static void main(String[] args) {
		
		// Creating Array of Contas
		Conta[] accounts = new Conta[5];
		
		// Creating ContasSubClasses Objects
		ContaCorrente accountCorrente = new ContaCorrente(1, 12);
		ContaPoupanca accountPoupanca = new ContaPoupanca(2, 12);
		
		//Referencing the ContasCorrente and ContaPoupanca Objects into Conta Array
		accounts[0] = accountCorrente;
		accounts[1] = accountPoupanca;
		
		// Creating References to the Contas Referecnes
		ContaCorrente refCorrente = (ContaCorrente) accounts[0]; // Cast needed because accounts[] is type Conta
		
		System.out.println(accountCorrente.getNumero());
		
		// Casting the wrong type of Conta
		try {
			ContaCorrente refCorrente2 = (ContaCorrente) accounts[1]; // accounts[1] is ContaPoupanca
		} catch(ClassCastException e) {
			System.out.println("ClassCastException Ocurred");
		}
		
	}
	
}

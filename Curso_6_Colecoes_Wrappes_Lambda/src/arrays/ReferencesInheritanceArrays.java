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
		
		System.out.println(refCorrente.getNumero());
		
		// Casting the wrong type of Conta
		try {
			ContaCorrente refCorrente2 = (ContaCorrente) accounts[1]; // accounts[1] is ContaPoupanca
		} catch(ClassCastException e) {
			System.out.println("ClassCastException Ocurred");
		}
		
		// Creating a Object Array
		Object[] objects = new Object[2];
		
		// Creating Objects of Conta Subclasses
		ContaCorrente objectCorrente = new ContaCorrente(3, 22);
		ContaPoupanca objectPoupanca = new ContaPoupanca(4, 22);
		
		// Adding the Objects of "Conta Type" to the Array of "Object Type"
		objects[0] = objectCorrente;
		objects[1] = objectPoupanca;
		
		// Creating a reference to the objectContas
		ContaCorrente contaReference = (ContaCorrente) objects[0]; // Cast needed because objects[] Type Object
		System.out.println("I could only use this: " + contaReference.getNumero() + ", because of the Cast.");
				
		
		
	}
}

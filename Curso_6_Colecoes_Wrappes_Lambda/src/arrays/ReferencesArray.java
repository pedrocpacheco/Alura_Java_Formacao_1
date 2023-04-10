package arrays;

import arrays.classes.Conta;

public class ReferencesArray {

	public static void main(String[] args) {
		
		// Creating Array of Contas
		Conta[] accounts = new Conta[5];
		
		// Creating Contas Objects
		Conta account = new Conta(1, 12);
		Conta account2 = new Conta(2, 12);
		
		// Putting the reference of the account Object in the Array
		accounts[0] = account;
		accounts[1] = account2;
		
		// Using a getMethod of by a reference of Conta Object in the array
		System.out.println("The Account 1 Number Is: " + accounts[0].getNumero());
		System.out.println("The Account 2 Number Is: " + accounts[1].getNumero());
	
		// Creating another referece to a account information
		int ref = accounts[0].getNumero();
		System.out.println("Using New Reference (ref): " + ref + " | Using Array Reference (accounts[0]): " + accounts[0].getNumero() + " | Using Creation Reference (account): " + account.getNumero());
				
		
	}
	
	
}

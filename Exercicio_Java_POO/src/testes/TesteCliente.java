package testes;

import classes.Cliente;
import excecoes.StringInvalidaException;

public class TesteCliente {

	public static void main(String[] args) throws StringInvalidaException {
		
		try(Cliente pedro = new Cliente()){
			pedro.setNome("Pedro");
			pedro.setIdade(17);
		} catch(Exception e) {
			System.out.println("Ocorreu um erro na criação do Cliente");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 

		
	}
	
}

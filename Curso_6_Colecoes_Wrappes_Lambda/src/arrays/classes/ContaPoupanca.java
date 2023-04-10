package arrays.classes;

public class ContaPoupanca extends Conta{

	public ContaPoupanca() {
		
	}
	
	public ContaPoupanca(int agencia, int numero) {
		
	}
	
	public void deposita(double valor) {
		super.saldo += valor * 2;
	}
	
}

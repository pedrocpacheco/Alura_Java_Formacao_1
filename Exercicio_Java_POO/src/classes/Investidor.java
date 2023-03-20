package classes;

public class Investidor implements InvestirDesinvestir{

	int saldo;
	
	@Override
	public void investir(int valor) {
		this.saldo += valor*10;
	}

	@Override
	public void desisvestir(int valor) {
		this.saldo -= valor*10;
	}
	
}

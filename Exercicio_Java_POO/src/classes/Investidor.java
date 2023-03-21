package classes;


public class Investidor implements InvestirDesinvestir{

	 int saldo;
	
	@Override
	public int investir(int valor) {
		return this.saldo += valor*10;
	}

	@Override
	public int desisvestir(int valor) {
		return this.saldo -= valor*10;
	}
	
}

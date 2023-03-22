package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta {

	public ContaCorrente() {
		
	}
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		return super.saca(valor + 0.20);
	}
		
    @Override
    public void deposita(double valor) {
    	super.saldo += valor + 10;
    	
    }
	
	
}

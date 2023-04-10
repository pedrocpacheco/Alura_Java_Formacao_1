package arrays.classes;

public class ContaCorrente extends Conta {

	public ContaCorrente() {
		
	}
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor){
		super.saca(valor + 0.20);
	}
		
    @Override
    public void deposita(double valor) {
    	super.saldo += valor + 10;
    	
    }
	
    @Override
    public String toString() {
    	return super.toString() + "ContaCorrente, Numero: " + super.getNumero() + " | Agencia: " + super.getAgencia();
    }
	
}

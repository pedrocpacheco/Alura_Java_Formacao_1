package bytebankexcecoes;

public class TesteSaca {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 123);
		
		conta.deposita(200.0);
		try {
			conta.saca(210.0);
		} catch(Exception e) {
			System.out.println("Saldo Insuficiente");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(conta.getSaldo());
		
	}
	
}

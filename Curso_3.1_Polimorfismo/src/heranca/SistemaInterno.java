package heranca;

public class SistemaInterno  {

	private int senha = 2222;
	
	public void autentica(Autenticavel g) {
		if(g.autentica(this.senha)) {
			System.out.println("Pode entrar no Sistema");
		} else {
			System.out.println("Não pode entrar no sistema");
		}
	} 
	
}

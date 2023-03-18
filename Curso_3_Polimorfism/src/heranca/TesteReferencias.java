package heranca;

public class TesteReferencias {

	public static void main(String[] args) {
		
		// 1- Referencia do Tipo Gerente -> Obj Gerente
		Gerente g1 = new Gerente();
		
		g1.setNome("Daniel"); // Usa Metodos de Sup-Funcionario
		System.out.println(g1.getNome());
		
		g1.setSenha(10); // Usa Metodos de Sub-Gerente
		System.out.println(g1.autentica(10));
		
		
		// 2- Referenncia  do Tipo Func -> Obj Gerente
		Funcionario g2 = new Gerente();
		
		g2.setNome("Carlos"); // Usa metodos de Sup-Funcioario
		System.out.println(g1.getNome());
		
		//g2.setSenha(10); // Não connsegue usar metodos de Sub-Gerente
		//System.out.println(g2.autentica(10)); 
		/* Por g2 ser do tipo Funcionario
		 * Mesmo referenciando um Objeto Gerente
		 * Ela não connsegue utilizar metodos de gerente
		 */
		
		// 3- Criando ControleBonificação para enteder o Polimorfismo
		Gerente g3 = new Gerente();
		g3.setSalario(5000.0);
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g3);
		controle.registra(f1);
		
		System.out.println(controle.getSoma());
		
		
	}
	
}

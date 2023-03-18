package heranca;

public class EditorVideo extends Funcionario{

	@Override
	public double getBonificacao() {
		System.out.println("Chamado o metodo de Bonificação do Editor de Vídeo");
		return 1100;
	}
	
}

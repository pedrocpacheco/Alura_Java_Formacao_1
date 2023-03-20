package classes;

public class ContaIdosos extends Conta{

	@Override
	public String getExecucao() {
		String execucao = "Você executou uma Conta Idoso";
		return execucao;
	}

}

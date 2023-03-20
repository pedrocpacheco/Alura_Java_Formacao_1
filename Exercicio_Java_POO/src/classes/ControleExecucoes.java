package classes;

import java.util.ArrayList;
import java.util.List;

public class ControleExecucoes {

	List<String> execucoes = new ArrayList<>(Conta.total);

	
	public void registra(Conta c) {		
		execucoes.add(c.getExecucao());
	}
	
	public List<String> getExecucoes() {
		return execucoes;
	}
	
	
}

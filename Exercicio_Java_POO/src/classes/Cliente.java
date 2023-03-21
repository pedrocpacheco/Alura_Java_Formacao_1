package classes;

import excecoes.IntInvalidoException;
import excecoes.StringInvalidaException;

public class Cliente implements AutoCloseable {

	private String nome;
	private int idade;
	
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) throws StringInvalidaException {
		for(int i = 0; i < nome.length(); i++) {
			char ch = nome.charAt(i);
			if(Character.isLetter(ch)) {
				this.nome = nome;
			}else {
				throw new StringInvalidaException("Você digitou um nome invalido");
			}
		}
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		if(idade < 0) {
			throw new IntInvalidoException("A idade é invalida");
		}
		this.idade = idade;
	}

	@Override
	public void close() {
		System.out.println(this.getNome());
		System.out.println(this.getIdade());
	}
	
	
	
}

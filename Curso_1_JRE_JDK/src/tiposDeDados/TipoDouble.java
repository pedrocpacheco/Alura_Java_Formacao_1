package tiposDeDados;

public class TipoDouble {

	public static void main(String[] args) {
		// double contem ponto flutuante
		double salario = 1250.70;
		System.out.println(salario);

		// Divindindo int que "teria" resultado double
		int divisaoIntDouble = 3 / 2; 
		System.out.println(divisaoIntDouble); // Resultado será 3, poins int 
		
		// Dividindo valores em double
		
			// Divisão Errada
		double divisaoErrada = 5 / 2; // Resultado será 3, pois os dois valores são ints
		System.out.println(divisaoErrada);
		
			// Divisão certa
		double divisaoCerta = 5.0 / 2; // Resultado será 2.5, pois o valor 5.0 é um double
		System.out.println(divisaoCerta);
		
		// Casting
			// Forçando valor double para virar int
		double salarioCasting = 1270.50;
		int valor = (int) salarioCasting; // Forçando o valor double salarioCasting, a ir para uma variavel int
		System.out.println(valor);
		
		
	}
	
}

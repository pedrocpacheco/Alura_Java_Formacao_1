package arrays;

public class TesteArrays {
	public static void main(String[] args) {
		
		int[] ages = new int[5];
		
		ages[0] = 17;
		ages[1] = 18;
		ages[2] = 19;
		
		int agePedro = ages[0];
		int ageLuane = ages[1];
		int ageJoao = ages[2];

		System.out.printf("Pedro's age Is: %d | Luane's age Is: %d | João's age Is: %d", agePedro, ageLuane, ageJoao);
		System.out.println("\nO tamanho do Array é de: " + ages.length);
		
	}

}

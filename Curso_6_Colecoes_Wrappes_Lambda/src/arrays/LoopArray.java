package arrays;

public class LoopArray {
	public static void main(String[] args) {
		
		int[] ages = new int[5];
		
		// Multipling the Age by Itself
		for(int i = 0; i < ages.length; i++){
			ages[i] = i*i;
		}
		
		//Printing the age
		for(int i = 0 ; i < ages.length; i++) {
			System.out.println("The Current Age Is: " + ages[i]);
		}
		
	}
}

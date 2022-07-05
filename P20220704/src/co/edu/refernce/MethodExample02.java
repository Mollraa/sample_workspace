package co.edu.refernce;

public class MethodExample02 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++)
		printGugudan(i);
	}
	
	public static void printGugudan(int dan) {
		for (int i = 1; i<= 9; i++) {
			System.out.printf("%d * %d = %d \n", dan, i, (1 * 9));
		}
	}
}

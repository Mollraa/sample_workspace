package co.edu;

public class BitOperator {
	public static void main(String[] args) {
		int num = 10;
		int result =~num; //-11
		result++; //-10
		System.out.println(result);
		
		//대입연산자 : =, +=, -=, *=, /= .....
		String names = "백진희";
		names = names + " 김민수";
		names += " 노은경";
		
		System.out.println(names);
		
		result = result -2;
		result -= 2;
		System.out.println(result);
		
		
		
	}
}
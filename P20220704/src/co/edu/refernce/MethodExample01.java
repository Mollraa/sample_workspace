package co.edu.refernce;

public class MethodExample01 {
	public static void main(String[] args) {
		//실행구문
//		long sum = sum(20); //arguments(매개값)
//		showInfo("백진희희", 18);
//		showInfo("은경언뉘이잉", 20);
//		printStar(50, "♡♥♡♥♡♥♡♥");
		for(int i= 2; i<=5; i++)  //2~5단 까지 보여주라
		printGugudan(i);
		
	}
		
	public static void printGugudan(int dan) {
		for (int i = 1; i <=100; i++) {   //1단에서 100단까지 보여줫!
//			System.out.println("2 * " + i + " = " + (2 * i));
			System.out.printf("%d * %d = %d \n", dan, i,(dan *i));
		}
		System.out.println();
	}
	
	public static void printStar(int times, String shape) {
		for (int i = 1; i <= 4; i++) {
			for (int j =1; j <= i; j++) {
				System.out.print(shape);
			}
			System.out.println();
			
		}
	}

		
	public static void showInfo(String name, int age) {
		System.out.println("반갑습니당~ " + name + "입니다~! 나이는 " + age + "살 입니다.");
	}
	
	
	//정의구문
	public static long sum(int num) { //parameter(매개변수)
		int result = num * 2;
		return (long) result;  //자동형변환(promotion)		
	}

}

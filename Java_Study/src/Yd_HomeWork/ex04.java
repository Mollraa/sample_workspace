package Yd_HomeWork;

public class ex04 {
	public static void main(String[] args) {
		// 문제4) 아래와 같이 변수가 초기화되어있을 경우
		// 결과값을 저장할 변수의 타입을
		// 지정하고 값을 변수값을 출력하세요.
		byte a = 35;
		byte b = 25;
		int c = 463;
		long d = 1000L;

		long result100 = a + b + c + d; // 연산식
		System.out.println("reult100: " + result100 + "\n"); // 연산한 변수값 출력
		/*
		 * 4-1) result1 = a + c + d; System.out.println(result1);
		 */
		long result1 = a + c + d;
		System.out.println("result1: " + result1 + "\n");
		/*
		 * 4-2 ) result2 = a + b + c; System.out.println(result2);
		 */
		int result2 = a + b + c;
		System.out.println("result2: " + result2 + "\n");
		/*
		 * 4-3 ) double e = 45.31; result3 = c + d + e; System.out.println(result3);
		 */
		double e = 45.31;
		double result3 = c + d + e;
		System.out.println("result3: " + result3);

	}
}

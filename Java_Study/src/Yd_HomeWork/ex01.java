package Yd_HomeWork;

public class ex01 {
	public static void main(String[] args) {
		/*
		 * 문제1) 정수형 변수 2개를 선언 후 각각 37과 91로 값을 초기화 후 변수를 출력하라. 
		 * 출력예시) "변수명1: 변수값, 변수명2: 변수값"
		 */

		int num1 = 91; 
		int num2 = 37; //변수선언
		System.out.printf("num: %d, num2: %d\n", num1, num2); //변수출력
		
		/* 문제2) 문제 1번의 변수를 이용하여 각 연산을 수행한 결과를 출력하라.
		   2.1) 91 더하기 37
		   2.2) 91 빼기 37
		   2.3) 91 곱하기 37
		   2.4) 91 나누기 37 */

		int result1 = num1 + num2; //연산식
		System.out.printf("%d + %d : %d\n", num1, num2, result1); //출력문
		int result2 = num1 - num2;
		System.out.printf("%d - %d : %d\n", num1, num2, result2);
		int result3 = num1 * num2;
		System.out.printf("%d * %d : %d\n", num1, num2, result3);
		double result4 = (double) num1 / num2;
		System.out.printf("%d / %d : %.1f", num1, num2, result4);
	}
}

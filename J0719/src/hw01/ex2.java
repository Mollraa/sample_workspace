package hw01;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		// 문제4) 변수 val의 값이 양수일 경우엔 변수 값을,
		// 아닐 경우엔 0을 담는 변수를 선언하세요. (단, 삼항연산자를 사용)
		
		//int val = 1; //변수1을 선언
		//int intResult = (val > 0) ? val : 0; //삼항연산자로 intresult를 (조건문0보다클경우) 참:거짓; 
		//System.out.println(intResult); //결과값 도출
		
		Scanner scn = new Scanner(System.in);
		int vall = scn.nextInt();
		int result = (vall > 0) ? vall : 0;
		System.out.println("결과: " + result);

		/*
		 * 문제 5) 다음과 같이 두 개의 정수가 주어졌을 경우 두 정수 중에서 음수가 있다면 'One of a or b is negative
		 * number'를, 만일 그렇지 않다면 'both a and b are zero or more'를 출력하도록 구현하세요.
		 */
		int a = 10;
		int b = -8;
		String strResult;
		
		while(true) {
			System.out.println("숫자를 입력하세요: ");
			//String strResult;
			//if(a.equal)
		}
		//System.out.println(strResult);

	}
}

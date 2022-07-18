package Yd_Study;

import java.util.Scanner;

public class Study01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String strNum1 = scn.nextLine();        //strNum1,2 를 사용자가 입력하는 값을 넣도록 선언해주었습니다.
		String strnum2 = scn.nextLine();
		int num1 = Integer.parseInt(strNum1);   // 입력값을 넣은 문자열을 연산식에 대입하기위해
		int num2 = Integer.parseInt(strnum2);   // str1=num1, str2=num2 로 정수형으로 변환해주었습니다.

		int result1 = num1 + num2;                                    //num1 과 num2 의 연산식을 담아주는 result1을 선언하였습니다.
		System.out.println(num1 + " + " + num2 + "의 결과:" + result1); //연산식 괄호안의 결과값을 모니터에 출력하기위해 println()메소드를 입력하여 출력하게 했습니다. 

		int result2 = num1 - num2;
		System.out.println(num1 + " - " + num2 + "의 결과:" + result2);

		int result3 = num1 * num2;
		System.out.println(num1 + " * " + num2 + "의 결과:" + result3);

		double result4 = (double) num1 / num2;
		System.out.println(num1 + " / " + num2 + "의 결과:" + result4);

	}


}

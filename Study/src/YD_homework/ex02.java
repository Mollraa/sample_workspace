package YD_homework;

public class ex02 {
	public static void main(String[] args) {
		// 문제1) 아래와 같이 각 변수를 초기화하였을 때 각 문제에 맞게 구현하세요.
		int x = -5;
		int y = 10;
		int result;

		// 1-1) 부호연산자를 이용하여 변수 x의 값을 양수로 출력하세요.
		// 단, 변수 x의 값은 변하지 말아야한다.
		int result1 = -x; // -로 피연산자 x의 부호변경
		System.out.printf("x : %d, result1 : %d\n", x, result1);

		// 1-2) 변수 x의 값을 증가시킨 후 변수 y의 값과 더한 다음
		// 변수 y의 값을 감소시키는 연산식을 한줄로 작성하세요.
		int result2 = ++x + y;
		--y; // ++로 연산전 x값 1증가, 연산후 --y값 감소
		System.out.printf("x : %d, y : %d, result2 : %d\n", x, y, result2);

		// 1-3) 변수 x와 y의 값을 더한 값이 5가 되도록 증감연산자를 사용하여
		// 연산식을 한줄로 작성하세요.
		int result3 = --x + ++y; // 연산전 x는 1씩감소, y는 1씩증가
		System.out.printf("x : %d, y : %d, result3 : %d\n", x, y, result3);
		System.out.println("");

		// 문제2) 아래와 같이 각 변수를 초기화하였을 때 다음 결과를 차례대로
		// false 와 true로 출력하도록 수정하세요.
		int m = 10;
		int n = 5;
		System.out.println((m * 2 == n * 4) && (n > 5));
		// 비교연산자 ==를 사용해서(m*2==n*4) 두피 연산자의 값이 같은지 검사,
		// 피연산자가 모두 같아야하는 논리연산자 &&(논리곱)으로 n(5) > 5보다 작다는 연산식을 사용 false성립.
		// 10곱2는20 == 5곱4 랑 같다 또는 n은 5보다 작다 둘다 만족해야(&&) true;
		System.out.println((m / 2 == 5) && (n % 2 >= 1));
		// m나누기2는 == 5와 같다 또는 5나누기2한값의 나머지는 1보다 같거나 크다

		// 문제3) 각 연산식을 대입 연산자 하나로 구성된 연산식으로 수정하세요.
		System.out.println("");
		int val = 0; // 오른쪽 피연산자의 값을 왼쪽변수에 저장
		val = +10; // 변수=변수+피연산자와 동일
		System.out.println(val);
		val -= 5; // 변수=변수-피연산자와 동일
		System.out.println(val);
		val *= 3; // 변수=변수*피연산자와 동일
		System.out.println(val);
		val /= 5; // 변수=변수/피연산자와동일
		System.out.println(val);

		// 문제4) 변수 val의 값이 양수일 경우엔 변수 값을,
		// 아닐 경우엔 0을 담는 변수를 선언하세요. (단, 삼항연산자를 사용)
		int val = 1; // 변수1을 선언
		int intResult = (val > 0) ? val : 0; // 삼항연산자로 intresult를 (조건문0보다클경우) 참:거짓;
		System.out.println(intResult); // 결과값 도출

		// Scanner scn = new Scanner(System.in); //입력값을 받아서 한다면
		// int vall = scn.nextInt();
		// int result = (vall > 0) ? vall : 0;
		// System.out.println("결과: " + result);
		// System.out.println(intResult);

		/*
		 * 문제 5) 다음과 같이 두 개의 정수가 주어졌을 경우 두 정 수 중에서 음수가 있다면 'One of a or b is negative
		 * number'를, 만일 그렇지 않다면 'both a and b are zero or more'를 출력하도록 구현하세요.
		 */
		int a = 10;
		int b = -8;
		String strResult = a > 0 || b < 0 ? "One of a or b is negative number" : "both a and b are zero or more";
		// 논리합||로 a가0보다 크거나 b가0보다 작은 경우 하나만 만족해도 true결과가 나오게 조건문을 작성해줌
		System.out.println(strResult);

	}
}

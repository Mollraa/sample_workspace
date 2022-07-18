package Yd_HomeWork;

public class ex06 {
	public static void main(String[] args) {
		/*
		 * 추가문제) 아래와 같이 변수 값이 주어질 경우 각 자리의 합을 구해 출력하세요. 예시) 373 일 경우 3 + 7 + 3 = 13 으로
		 * 결과는 13입니다. 힌트) 곱하기 연산자 (*), 나누기 연산자( / ) 와 빼기 연산자 ( - ) 를 이용하세요.
		 */
		int value = 485;
		int frtNum = value / 100;
		int secNum = frtNum * 2;
		int thrNum = secNum - 3;
		int result = frtNum + secNum + thrNum;
		System.out.println(result);

		/*
		 * [풀이] value>0 일때, 485/ 10 = 48 
		 * 나머지 5 48 / 10 = 4 
		 * 나머지 8 4 / 10 = 나머지 4 => 나머지값
		 * 더하면서 value /10으로 나누기
		 * 
		 * int value = 485; int sum = 0; while (value > 0) { sum += value % 10; value /=
		 * 10; } System.out.println(sum); }
		 */

	}
}

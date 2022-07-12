package co.yedam;

import java.util.Scanner;

/*
 * 문제 3: 배열사용.
 * 정수(int)를 저장할 수 있는 배열(크기 3)을 선언하고 Scanner 클래스를 이용하여 사용자의 입력값을 저장 후
 * 저장 된 값중에서 합과 평균을 구하는 기능을 작성하세요.
 * 출력 예 : [12, 21, 17] 합: 50, 평균: 16.7
 */
public class Exam03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] ary = new int[3];

		System.out.println("첫번쨰 값을 입력 >> ");
		ary[0] = scn.nextInt();

		System.out.println("두번쨰 값을 입력 >> ");
		ary[1] = scn.nextInt();

		System.out.println("세번쨰 값을 입력 >> ");
		ary[2] = scn.nextInt();

//		int sum = ary[0] + ary[1] + ary[2];
		int sum = 0;
		for (int i = 0; i < ary.length; i++) { // i < 배열이름.length = 3;
			sum += ary[i];
		}
		double avg = (double) sum / ary.length;
		System.out.printf("합은 %d, 평균은 %.1f", sum, avg);

	}
}

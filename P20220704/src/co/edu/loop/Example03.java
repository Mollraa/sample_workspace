package co.edu.loop;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		boolean isTrue = true;
		int sum = 0;
		// sum의 누적값이 100을 초과할 때 반복문 종료.
		do {
			System.out.println("임의 값을 입력>>>");
			int num = scn.nextInt();
			sum += num;
			if (sum > 100) {
				sum -= num; //100 넘기전 직전 누적값 알아내는것
				System.out.println("반복문을 종료합니다.");
				isTrue = false;
			}

		} while (isTrue);
		// 누적값이 100을 초과히기 전의 값을 출력.
		System.out.println("sum의 누적값: " + sum);

		System.out.println("end of prog.");
	}
}

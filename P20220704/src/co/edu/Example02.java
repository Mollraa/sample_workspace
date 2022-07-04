package co.edu;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		// 사용자 입력값을 읽어서 100 ~ 90: A, ~80: B, ~70: C, 그 외:D
		// 출력값 : 점수 78은 C 등급입니다!
		System.out.print("임의 값을 입력하세요: "); // 지령값
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt(); // 임의 값을 입력하세요~
		String grade = "";

		if (num >= 90 && num <= 100) {
			if (num >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}

		} else if (num >= 80) { // if ~ else
			if (num >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}

		} else if (num >= 70) { // if ~ else
			if (num >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}

		} else {
			grade = "D";
		}
		System.out.println("점수 " + num + "은 " + grade + "등급입니다!");

		// 삼항 연산자로 표현
		grade = (num >= 90) ? "A" : (((num >= 80) ? "B" : (num >= 70) ? "C" : "D"));
		System.out.println("정수 " + num + "는 " + grade + " 등급입니다!");
	}
}

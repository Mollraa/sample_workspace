package co.edu.loop;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

//		boolean isTrue = false;
//		while(isTrue) {
//			System.out.println("입력>>");
//			int inqutVal = scn.nextInt();
//			System.out.println("입력값은 " + inqutVal);
//			
//			if (inqutVal == 9) {
//				System.out.println("반복문을 종료합니다.");
//			isTrue = false;
//			}
//		} //end of while
//			System.out.println("end of prof.");

		boolean isTrue = true;
		do {
			System.out.println("입력>>");
		int inqutVal = scn.nextInt();
			System.out.println("입력값은 " + inqutVal);

			if (inqutVal == 9) {
				System.out.println("반복문을 종료합니다.");
				isTrue = false;
			} else {
				isTrue = true;
			}
		} while (isTrue);
		System.out.println("end of prof.");

	}
}

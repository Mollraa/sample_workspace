package Yd_Study;

import java.util.Scanner;

public class Study02a {
	public static void main(String[] args) {
		/*
		 * 문제. 조건문 만들기 키보드로 아이디, 패스워드 [입력] 받아서 로그인하는 프로그램 입력 조건 : 아이디 - 문자열(String) /
		 * 패스워드 - 정수형(String => int 변환) 아이디 yedam, 패스워드 1234 이라면 "로그인 성공"을 출력하고 그렇지 않으면
		 * "로그인 실패"를 출력하세요. (조건문)
		 */
		Scanner scn = new Scanner(System.in);

		System.out.println("Id를 입력하세요: ");
		String id = scn.nextLine();
		System.out.println("Pw를 입력하세요: ");
		String pw1 = scn.nextLine();
		int pw = Integer.parseInt(pw1);
		
		if(id.equals("yedam")) {
			if(pw == 1234) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}
		} else {
			System.out.println("Id 오류");
		}
}
}
